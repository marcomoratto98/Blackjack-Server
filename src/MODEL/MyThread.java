package MODEL;



import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.util.Scanner;

import javax.swing.JLabel;

import CONTROLLER.Controller;
import VIEW.FinestraConnessione;
import VIEW.FinestraGioco;

public class MyThread extends Thread {
	
	private FinestraConnessione f;
	private FinestraGioco f2;
	Socket s;
	Scanner in;
	PrintWriter out;
	Gestione g;
	Controller c;


	
	public MyThread(Socket s,Gestione g,FinestraGioco f2,Controller c) {
		this.g=g;
		this.s=s;
		this.c=c;
		this.f2=f2;
		
		System.out.println("ciaooo");
		try {
			out = new PrintWriter(s.getOutputStream(), true);
			in = new Scanner(s.getInputStream());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//mando le carte del client
		out.println(c.getPath1());
		out.println(c.getPath2());
		
		//mando le carte del server
		out.println(c.getPath3());
		out.println(c.getPath4());
		/*String cc="ciao";
		try {
			cc=Ascolto();
			if(cc.equals("punta"))
				cc=Ascolto();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.f2.getLblGPuntata().setText("Puntata: "+cc);*/
	}



	
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		// legge quello che arriva
		while (true) {
			
			String ca="ciao";
			try {
				ca=Ascolto();
				if(ca.equals("punta")){
					ca=Ascolto();
					this.f2.getLblGPuntata().setText("Puntata: "+ca);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(ca!="stand"){
				String cc="ciao";
				try {
					cc=Ascolto();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Il server ha ricevuto: ---" + cc + "--- ");
				if (cc.equals("hit")) {
					HIT();
				}
				/*if (cc.equals("stand")) {
					out.println("0");
				}*/
				if (cc.equals("dd")) {
					HIT();
				}	
			}
		}
	}
	
	public String Ascolto() throws IOException{
		InputStreamReader isr = new InputStreamReader(s.getInputStream());
		BufferedReader in = new BufferedReader(isr);
		String sa = in.readLine();
		return sa;
	}
	
	
	public void HIT(){
		out.println(g.Distribuzione());
	}
	
	public InetAddress getIpAddress(){
		return s.getInetAddress();
		
	}

	
	
	
}
