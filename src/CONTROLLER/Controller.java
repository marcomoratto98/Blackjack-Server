package CONTROLLER;


import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import MODEL.Gestione;
import MODEL.MyThread;
import VIEW.FinestraConnessione;
import VIEW.FinestraGioco;
import VIEW.FinestraMosse;
import VIEW.FinestraRegole;

public class Controller implements ActionListener{

	FinestraConnessione f1;
	FinestraGioco f2;
	FinestraRegole f3;
	FinestraMosse f4;
	Gestione g;
	int Dmano=0,Gmano=0;
	private static ServerSocket ss;
	Socket s;
	boolean Inizio=true;	
	int ilTurno=0;
	int Dmoney=9999,Dpuntata=100;
	MyThread giocator1;
	
	public Controller(FinestraConnessione f1, FinestraGioco f2, FinestraRegole f3, FinestraMosse f4, Gestione g) {
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
		this.f4 = f4;
		this.g = g;
		
		this.f1.setVisible(true);
		this.f1.getBtnSalmone().addActionListener(this);
		this.f4.getBtnRegole().addActionListener(this);
		this.f4.getBtnHit().addActionListener(this);
		this.f4.getBtnStand().addActionListener(this);
		
		//creo i thread per i giocatori
		
		try {
			ss=new ServerSocket(9999);
			s=ss.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		giocator1=new MyThread(s,g,ilTurno,f2);
		
		
		
	}
	
	
	public void Carde(){
		
		System.out.println("ciaooo");
		try{
			
		
		
		for(int a=0;a<2;a++){
			String path=String.valueOf(g.Distribuzione());
			f2.getpManoG1().add(new JLabel(CaricaImmagine(path+".png")));
			f2.getSG1().setViewportView(f2.getpManoG1());
		}
		
		System.out.println("ciaooo");
		
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ciaooo");
			e.printStackTrace();
		}
		
		for(int a=0;a<2;a++){
			String path=String.valueOf(g.Distribuzione());
			f2.getpManoDealer().add(new JLabel(CaricaImmagine(path+".png")));
			f2.getSDealer().setViewportView(f2.getpManoDealer());
			f4.getpCarte().add(new JLabel(CaricaImmagine(path+".png",50,70)));
			f4.getsCarte().setViewportView(f4.getpCarte());
		}
		
		// Dopo 5 secondi invio una parola diversa
		/*while (Inizio==true) {
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
			}
		}*/
	}
	
	public ImageIcon CaricaImmagine(String path,int larg,int alt){
		ImageIcon temp = new ImageIcon(FinestraGioco.class.getResource("/cards/"+path));
		int width = temp.getIconWidth();
		int height = temp.getIconHeight();
		if (width > 50 || height > 70) {
			double d = 150D / Math.max(width, height);
			width = (int)Math.round(width * d);
			height = (int)Math.round(height * d);
			Image img1 = temp.getImage();
			BufferedImage img2 = new BufferedImage(
				width, height, BufferedImage.TYPE_INT_RGB
			);
			java.awt.Graphics g = img2.getGraphics();
			g.drawImage(img1, 0, 0, width, height, Color.white,null);
			
			temp = new ImageIcon(img2);
		}
		return temp;
	}
	
	public ImageIcon CaricaImmagine(String path){
		ImageIcon temp = new ImageIcon(FinestraGioco.class.getResource("/cards/"+path));
		int width = temp.getIconWidth();
		int height = temp.getIconHeight();
		if (width > 50 || height > 70) {
			double d = 75D / Math.max(width, height);
			width = (int)Math.round(width * d);
			height = (int)Math.round(height * d);
			Image img1 = temp.getImage();
			BufferedImage img2 = new BufferedImage(
				width, height, BufferedImage.TYPE_INT_RGB
			);
			java.awt.Graphics g = img2.getGraphics();
			g.drawImage(img1, 0, 0, width, height, Color.white,null);
			
			temp = new ImageIcon(img2);
		}
		return temp;
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		
		
		//Pulsante Hit
		if(evt.getSource()==f4.getBtnHit()){
			if(ilTurno==1){
				String path=String.valueOf(g.Distribuzione());
				f2.getpManoDealer().add(new JLabel(CaricaImmagine(path+".png")));
				f2.getSDealer().setViewportView(f2.getpManoDealer());
				f4.getpCarte().add(new JLabel(CaricaImmagine(path+".png",50,70)));
				f4.getsCarte().setViewportView(f4.getpCarte());
				
				ilTurno=0;
				
				/*f2.getD3().setIcon(CaricaImmagine(path+".png"));
				f2.getD3().setVisible(true);
				f4.getCarta3().setIcon(CaricaImmagine(path+".png",50,70));
			*/}
		}
		
		//Pulsante Stand
		if(evt.getSource()==f4.getBtnStand()){
			ilTurno=0;
			System.out.println("FINE TURNO");
		}
		
		//Salmone inizia la partita
		if(evt.getSource()==f1.getBtnSalmone()){
			
			
			int i=JOptionPane.showConfirmDialog(null, "Iniziare la Partita?", "?", JOptionPane.YES_NO_OPTION);
			if(i==JOptionPane.YES_OPTION){
				
				
				f1.setVisible(false);
				f2.setVisible(true);
				f4.setVisible(true);
			}
			else{
				System.out.println("annullare");
			}
			
			Carde();
				
		}
		
		
		//Compaino le mosse disponibili del giocatore
		if(evt.getSource()==f4.getBtnRegole()){
			if(f3.isVisible()){
				
				f3.setVisible(false);
				
			}
			else{
				f3.setVisible(true);
			}
		}
	}
	
	
	public int ASSO(int carta){
		int valore=0;
		if(carta==10 || carta==30 || carta==50 || carta==70){
			
		}
		return valore;
	}
	
	
	
	
}
