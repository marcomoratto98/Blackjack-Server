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
import java.awt.Font;

public class FinestraConnessione extends JFrame {

	private JPanel contentPane;
	private JButton btnSalmone;
	private JLabel lblGiocatore1;
	private JLabel lblGiocatori;

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
		lblGiocatore1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGiocatore1.setBounds(10, 85, 424, 33);
		contentPane.add(lblGiocatore1);
		
		lblGiocatori = new JLabel("GIOCATORI");
		lblGiocatori.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblGiocatori.setHorizontalAlignment(SwingConstants.CENTER);
		lblGiocatori.setBounds(10, 15, 424, 33);
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
	
}
