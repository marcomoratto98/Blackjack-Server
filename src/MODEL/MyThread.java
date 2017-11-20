package MODEL;



import java.awt.Color;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.util.Scanner;

import VIEW.FinestraConnessione;

public class MyThread extends Thread {
	
	private FinestraConnessione f;
	//private DatagramPacket pkt;
	//private byte[] buf = new byte[256];
	
	ServerSocket p;
	Socket s=new Socket();
	Scanner in;
	PrintWriter out;
	Gestione g;

	int carta1=0,carta2=0,hit=0;
	
	public MyThread(ServerSocket ss,Gestione g) {
		this.g=g;
		p = ss;
		
		System.out.println("ciaooo");
		try {
			
			
			p.accept();
			
			System.out.println("ciaoooqqqqqqqqqqqqqq");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			out = new PrintWriter(s.getOutputStream(), true);
			in = new Scanner(s.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		// legge quello che arriva
		while (true) {
			// Leggo una riga e la interpreto
			String risposta = in.nextLine();
			System.out.println("Il server ha ricevuto: ---" + risposta + "--- ");
			if (risposta.equals("hit")) {
				out.println(g.Distribuzione());
			}
				// Invia hai vinto al vincitore
				out.println("Hai vinto!");
		}
		
		
		
	}
	
	
	
	
	
	
	
	public InetAddress getIpAddress(){
		return p.getInetAddress();
		
	}

	public int getCarta1() {
		return carta1;
	}

	public void setCarta1(int carta1) {
		this.carta1 = carta1;
	}

	public int getCarta2() {
		return carta2;
	}

	public void setCarta2(int carta2) {
		this.carta2 = carta2;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	
	
}



	
	
	
	
	/*@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		boolean running = true;
		String CMD;
		for ( ; running; ) {
			f.setPkt(new DatagramPacket(f.getBuf(), f.getBuf().length));//pkt = new DatagramPacket(buf, buf.length);
			try {
				f.getS().receive(f.getPkt());
			} catch (Exception e) {	}
			CMD = new String(f.getPkt().getData(), 0, f.getPkt().getLength());
			//System.out.printf(" recive %d Byte message  \'%s\' from [%s:%s]..\n", pkt.getLength(), CMD, pkt.getAddress(), pkt.getPort());
			System.out.println(" ricevo da "+f.getPkt().getAddress()+" -> "+CMD);
			f.getLblConnessoA().setText("Connesso a   "+f.getPkt().getAddress());
			//f.getLblPorta().setText("Porta:  "+f.getPkt().getPort());
			
			/*if(CMD.equals("FINISH HIM")==true){
				running = !CMD.equals("FINISH HIM");
			}
			else{
				int c=Integer.parseInt(CMD);
				int s=c%3;
				f.getLabel().setText("Resto: "+s);
				if(s==0){
					f.getpRosso().setBackground(null);
					f.getpGiallo().setBackground(null);
					f.getpVerde().setBackground(Color.green);
				}
				else{
					if(s==1){
						f.getpVerde().setBackground(null);
						f.getpRosso().setBackground(null);
						f.getpGiallo().setBackground(Color.yellow);
					}
					if(s==2){
						f.getpGiallo().setBackground(null);
						f.getpVerde().setBackground(null);
						f.getpRosso().setBackground(Color.red);
					}
				}
			}
			running = !CMD.equals("FINISH HIM");
		}*
		System.out.println("FATALITY!!!");
		f.getS().close();
	}*/
