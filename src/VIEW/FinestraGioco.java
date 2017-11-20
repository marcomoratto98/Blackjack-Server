package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.text.html.ImageView;



import javax.swing.text.Element;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Font;

public class FinestraGioco extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JLabel lblTable;
	private JLabel label;
	private JScrollPane SDealer,SG1;
	private JPanel pManoDealer,pManoG1;
	private JLabel lblGPuntata;
	

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinestraGioco frame = new FinestraGioco();
					FinestraMosse fM=new FinestraMosse();
					frame.setVisible(true);
					fM.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame. 
	 */
	public FinestraGioco() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 930, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setOpaque(false);
		panel.setBounds(0, 0, 917, 480);
		contentPane.add(panel);
		panel.setLayout(null);
		
		SDealer = new JScrollPane();
		SDealer.setOpaque(false);
		SDealer.setBounds(313, 357, 296, 96);
		
		panel.add(SDealer);
		
		pManoDealer = new JPanel();
		pManoDealer.setOpaque(false);
		
		SDealer.setViewportView(pManoDealer);
		
		SG1 = new JScrollPane();
		SG1.setOpaque(false);
		SG1.setBounds(313, 26, 296, 96);
		
		panel.add(SG1);
		
		pManoG1 = new JPanel();
		pManoG1.setOpaque(false);
		SG1.setViewportView(pManoG1);
		
		lblGPuntata = new JLabel("Puntata: ");
		lblGPuntata.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGPuntata.setForeground(new Color(255, 0, 0));
		lblGPuntata.setBounds(620, 38, 102, 26);
		panel.add(lblGPuntata);
		
		
		
		
		
		
		label = new JLabel("");
		label.setOpaque(true);
		label.setBounds(0, 0, 917, 480);
		contentPane.add(label);
		label.setIcon(new ImageIcon(FinestraGioco.class.getResource("/img/blackjack_table.png")));
		
		
		
	}


	
	public JScrollPane getSDealer() {
		return SDealer;
	}
	public void setSDealer(JScrollPane sDealer) {
		SDealer = sDealer;
	}
	public JScrollPane getSG1() {
		return SG1;
	}
	public void setSG1(JScrollPane sG1) {
		SG1 = sG1;
	}
	public JPanel getpManoDealer() {
		return pManoDealer;
	}
	public void setpManoDealer(JPanel pManoDealer) {
		this.pManoDealer = pManoDealer;
	}
	public JPanel getpManoG1() {
		return pManoG1;
	}
	public void setpManoG1(JPanel pManoG1) {
		this.pManoG1 = pManoG1;
	}
}
