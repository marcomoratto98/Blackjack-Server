package MODEL;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	//4 giocatori massimi
	ServerSocket p;
	Gestione g;
	
	
	public Server(Gestione g){
		this.g=g;
	}
	
	//                                inizio= partita appena iniziata
	public void avvio(ServerSocket ss, boolean Inizio){
		System.out.println("ciaooo");
		// Crea il server socket le connessioni
		
		try {
			p=ss;
			//Invio le carte ai client
			
			
			//------------------------------------------------
			// Ora invio due parole ai client ogni 10 secondi
			//out1 = new PrintWriter(uno.getOutputStream(), true);
			//out2 = new PrintWriter(due.getOutputStream(), true);
		} catch (Exception e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try{
			uno = ss.accept();
		}catch (IOException e) {
			// Insersci che l'utente non è disponibile
			
		}
		try{
			due = ss.accept();
		}catch (IOException e) {
			// Insersci che l'utente non è disponibile
			
		}
		try{
			tre = ss.accept();
		}catch (IOException e) {
			// Insersci che l'utente non è disponibile
			
		}
		try{
			quattro = ss.accept();
		}catch (IOException e) {
			// Insersci che l'utente non è disponibile
			
		}*/
		
		
		
		System.out.println("ciaooo");
		try{
			int carta;
		MyThread st1 = new MyThread(ss,g);
		System.out.println("ciaooo");
		st1.start();
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ciaooo");
			e.printStackTrace();
		}
		try{
			MyThread st2 = new MyThread(ss,g);
			st2.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try{
			MyThread st3 = new MyThread(ss,g);
			st3.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try{
			MyThread st4 = new MyThread(ss,g);
			st4.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		// Dopo 5 secondi invio una parola diversa
		while (Inizio==true) {
		// Passo int ai client
			int g1,g2,g3,g4,d;
			System.out.println("ciaooo");
			System.out.println("Inizio parte gestione carte");
			/*
			parola = "albero";
			vincitore = null;
			out1.println(parola);
			out2.println(parola);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			parola = "manoscritto";
			vincitore = null;
			out1.println(parola);
			out2.println(parola);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		
	}
		
	//Il giro dei turni tra i 5 giocatori
	public void Rotazione(){
		
	}
	
}
