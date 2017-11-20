package MAIN;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;

import CONTROLLER.Controller;
import MODEL.Gestione;
import MODEL.Server;
import VIEW.FinestraConnessione;
import VIEW.FinestraGioco;
import VIEW.FinestraMosse;
import VIEW.FinestraRegole;

public class MainServer {

	//connessione con client
	/*private static DatagramSocket s;
	private static int PORT1=1234,PORT2=5678,PORT3=0023,PORT4=4564;
	private static DatagramPacket pkt;
	private static byte[] buf = new byte[256];
	*/
	
	
	
	public static void main(String[] args) {
		FinestraConnessione f1=new FinestraConnessione();
		FinestraGioco f2= new FinestraGioco();
		FinestraRegole f3= new FinestraRegole();
		FinestraMosse f4= new FinestraMosse();
		Gestione g=new Gestione();
		
		
		
		
		
		
		Server server=new Server(g);
		//server.avvio(ss);
		Controller c=new Controller(f1,f2,f3,f4,g,server);
	}


	
	
}
