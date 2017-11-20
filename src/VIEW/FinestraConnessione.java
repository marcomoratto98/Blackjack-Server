package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import MODEL.MyThread;

public class FinestraConnessione extends JFrame {

	private JPanel contentPane;
	private JButton btnSalmone;
	private JLabel lblGiocatore1;
	private JLabel lblGiocatore2;
	private JLabel lblGiocatore3;
	private JLabel lblGiocatore4;
	private JLabel lblGiocatori;
	
	private static DatagramSocket s;
	private static int PORT1=1234,PORT2=5678,PORT3=0023,PORT4=4564;
	private static DatagramPacket pkt;
	private static byte[] buf = new byte[256];
	
	
	

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinestraConnessione frame = new FinestraConnessione();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FinestraConnessione() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSalmone = new JButton("SALMONE");
		btnSalmone.setBounds(147, 209, 146, 23);
		contentPane.add(btnSalmone);
		
		lblGiocatore1 = new JLabel("Giocatore 1: Non disponibile");
		lblGiocatore1.setBounds(10, 40, 424, 14);
		contentPane.add(lblGiocatore1);
		
		lblGiocatore2 = new JLabel("Giocatore 2: Non disponibile");
		lblGiocatore2.setBounds(10, 66, 424, 14);
		contentPane.add(lblGiocatore2);
		
		lblGiocatore3 = new JLabel("Giocatore 3: Non disponibile");
		lblGiocatore3.setBounds(10, 91, 424, 14);
		contentPane.add(lblGiocatore3);
		
		lblGiocatore4 = new JLabel("Giocatore 4: Non disponibile");
		lblGiocatore4.setBounds(10, 116, 424, 14);
		contentPane.add(lblGiocatore4);
		
		lblGiocatori = new JLabel("GIOCATORI");
		lblGiocatori.setHorizontalAlignment(SwingConstants.CENTER);
		lblGiocatori.setBounds(10, 15, 424, 14);
		contentPane.add(lblGiocatori);
		
		
		
		
		//MyThread t=new MyThread(this);
		//t.run();
	}

	public JButton getBtnSalmone() {
		return btnSalmone;
	}

	public void setBtnSalmone(JButton btnSalmone) {
		this.btnSalmone = btnSalmone;
	}

	public JLabel getLblGiocatore1() {
		return lblGiocatore1;
	}

	public void setLblGiocatore1(JLabel lblGiocatore1) {
		this.lblGiocatore1 = lblGiocatore1;
	}

	public JLabel getLblGiocatore2() {
		return lblGiocatore2;
	}

	public void setLblGiocatore2(JLabel lblGiocatore2) {
		this.lblGiocatore2 = lblGiocatore2;
	}

	public JLabel getLblGiocatore3() {
		return lblGiocatore3;
	}

	public void setLblGiocatore3(JLabel lblGiocatore3) {
		this.lblGiocatore3 = lblGiocatore3;
	}

	public JLabel getLblGiocatore4() {
		return lblGiocatore4;
	}

	public void setLblGiocatore4(JLabel lblGiocatore) {
		this.lblGiocatore4 = lblGiocatore;
	}
	
	
}
