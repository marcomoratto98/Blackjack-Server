package MAIN;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;

import CONTROLLER.Controller;
import MODEL.Gestione;
import VIEW.FinestraConnessione;
import VIEW.FinestraGioco;
import VIEW.FinestraMosse;
import VIEW.FinestraRegole;

public class MainServer {

	
	
	public static void main(String[] args) {
		FinestraConnessione f1=new FinestraConnessione();
		FinestraGioco f2= new FinestraGioco();
		FinestraRegole f3= new FinestraRegole();
		FinestraMosse f4= new FinestraMosse();
		Gestione g=new Gestione();
		
		
		
		
		
		
		Controller c=new Controller(f1,f2,f3,f4,g);
	}


	
	
}
