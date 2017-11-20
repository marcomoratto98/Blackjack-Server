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

public class FinestraGioco extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JLabel lblTable;
	private JLabel label;
	private JScrollPane SDealer,SG1,SG2,SG3,SG4;
	private JPanel pManoDealer,pManoG1,pManoG2,pManoG3,pManoG4;
	private JLabel G11;
	private JLabel G12;
	private JLabel G21;
	private JLabel G22;
	private JLabel G31;
	private JLabel G32;
	private JLabel G41;
	private JLabel G42;
	private JLabel D1;
	private JLabel D2;
	private JLabel G13;
	private JLabel G14;
	private JLabel G15;
	private JLabel G16;
	private JLabel G23;
	private JLabel G24;
	private JLabel G25;
	private JLabel G26;
	private JLabel G33;
	private JLabel G34;
	private JLabel G35;
	private JLabel G36;
	private JLabel G43;
	private JLabel G44;
	private JLabel G45;
	private JLabel G46;
	private JLabel D3;
	private JLabel D4;
	private JLabel D5;
	private JLabel D6;
	

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
		
		G11 = new JLabel("");
		G11.setBackground(Color.WHITE);
		G11.setBounds(79, 311, 50, 70);
		panel.add(G11);
		
		G12 = new JLabel("");
		G12.setBounds(127, 311, 50, 70);
		panel.add(G12);
		
		G21 = new JLabel("");
		G21.setBounds(277, 129, 50, 70);
		panel.add(G21);
		
		G22 = new JLabel("");
		G22.setBounds(324, 129, 50, 70);
		panel.add(G22);
		
		G31 = new JLabel("");
		G31.setBounds(464, 129, 50, 70);
		panel.add(G31);
		
		G32 = new JLabel("");
		G32.setBounds(511, 129, 50, 70);
		panel.add(G32);
		
		G41 = new JLabel("");
		G41.setBounds(703, 272, 50, 70);
		panel.add(G41);
		
		G42 = new JLabel("");
		G42.setBounds(752, 272, 50, 70);
		panel.add(G42);
		
		D1 = new JLabel("");
		D1.setBounds(337, 117, 50, 70);
		panel.add(D1);
		
		D2 = new JLabel("");
		D2.setBounds(386, 117, 50, 70);
		panel.add(D2);
		
		G13 = new JLabel("");
		G13.setBounds(175, 311, 50, 70);
		panel.add(G13);
		
		G14 = new JLabel("");
		G14.setBounds(79, 374, 50, 70);
		panel.add(G14);
		
		G15 = new JLabel("");
		G15.setBounds(127, 374, 50, 70);
		panel.add(G15);
		
		G16 = new JLabel("");
		G16.setBounds(175, 374, 50, 70);
		panel.add(G16);
		
		G23 = new JLabel("");
		G23.setBounds(373, 129, 50, 70);
		panel.add(G23);
		
		G24 = new JLabel("");
		G24.setBounds(277, 198, 50, 70);
		panel.add(G24);
		
		G25 = new JLabel("");
		G25.setBounds(324, 198, 50, 70);
		panel.add(G25);
		
		G26 = new JLabel("");
		G26.setBounds(373, 198, 50, 70);
		panel.add(G26);
		
		G33 = new JLabel("");
		G33.setBounds(560, 129, 50, 70);
		panel.add(G33);
		
		G34 = new JLabel("");
		G34.setBounds(464, 198, 50, 70);
		panel.add(G34);
		
		G35 = new JLabel("");
		G35.setBounds(511, 198, 50, 70);
		panel.add(G35);
		
		G36 = new JLabel("");
		G36.setBounds(560, 198, 50, 70);
		panel.add(G36);
		
		G43 = new JLabel("");
		G43.setBounds(801, 272, 50, 70);
		panel.add(G43);
		
		G44 = new JLabel("");
		G44.setBounds(703, 335, 50, 70);
		panel.add(G44);
		
		G45 = new JLabel("");
		G45.setBounds(752, 335, 50, 70);
		panel.add(G45);
		
		G46 = new JLabel("");
		G46.setBounds(801, 335, 50, 70);
		panel.add(G46);
		
		D3 = new JLabel("");
		D3.setBounds(435, 117, 50, 70);
		panel.add(D3);
		
		D4 = new JLabel("");
		D4.setBounds(482, 117, 50, 70);
		panel.add(D4);
		
		D5 = new JLabel("");
		D5.setBounds(530, 117, 50, 70);
		panel.add(D5);
		
		D6 = new JLabel("");
		D6.setBounds(575, 117, 50, 70);
		panel.add(D6);
		
		SDealer = new JScrollPane();
		SDealer.setOpaque(false);
		SDealer.setBounds(314, 41, 296, 77);
		
		panel.add(SDealer);
		
		pManoDealer = new JPanel();
		pManoDealer.setOpaque(false);
		
		SDealer.setViewportView(pManoDealer);
		
		SG1 = new JScrollPane();
		SG1.setOpaque(false);
		SG1.setBounds(95, 168, 183, 96);
		
		panel.add(SG1);
		
		pManoG1 = new JPanel();
		pManoG1.setOpaque(false);
		SG1.setViewportView(pManoG1);
		
		SG2 = new JScrollPane();
		SG2.setOpaque(false);
		SG2.setBounds(249, 289, 183, 96);
		panel.add(SG2);
		
		pManoG2 = new JPanel();
		pManoG2.setOpaque(false);
		SG2.setViewportView(pManoG2);
		
		SG3 = new JScrollPane();
		SG3.setOpaque(false);
		SG3.setBounds(486, 289, 183, 96);
		panel.add(SG3);
		
		pManoG3 = new JPanel();
		pManoG3.setOpaque(false);
		SG3.setViewportView(pManoG3);
		
		SG4 = new JScrollPane();
		SG4.setOpaque(false);
		SG4.setBounds(655, 129, 183, 96);
		panel.add(SG4);
		
		pManoG4 = new JPanel();
		pManoG4.setOpaque(false);
		SG4.setViewportView(pManoG4);
		
		
		
		
		
		
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






	public JScrollPane getSG2() {
		return SG2;
	}






	public void setSG2(JScrollPane sG2) {
		SG2 = sG2;
	}






	public JScrollPane getSG3() {
		return SG3;
	}






	public void setSG3(JScrollPane sG3) {
		SG3 = sG3;
	}






	public JScrollPane getSG4() {
		return SG4;
	}






	public void setSG4(JScrollPane sG4) {
		SG4 = sG4;
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






	public JPanel getpManoG2() {
		return pManoG2;
	}






	public void setpManoG2(JPanel pManoG2) {
		this.pManoG2 = pManoG2;
	}






	public JPanel getpManoG3() {
		return pManoG3;
	}






	public void setpManoG3(JPanel pManoG3) {
		this.pManoG3 = pManoG3;
	}






	public JPanel getpManoG4() {
		return pManoG4;
	}






	public void setpManoG4(JPanel pManoG4) {
		this.pManoG4 = pManoG4;
	}






	public JLabel getD3() {
		return D3;
	}





	public void setD3(JLabel d3) {
		D3 = d3;
	}





	public JLabel getD4() {
		return D4;
	}





	public void setD4(JLabel d4) {
		D4 = d4;
	}





	public JLabel getD5() {
		return D5;
	}





	public void setD5(JLabel d5) {
		D5 = d5;
	}





	public JLabel getD6() {
		return D6;
	}





	public void setD6(JLabel d6) {
		D6 = d6;
	}





	public JLabel getG23() {
		return G23;
	}





	public void setG23(JLabel g23) {
		G23 = g23;
	}





	public JLabel getG24() {
		return G24;
	}





	public void setG24(JLabel g24) {
		G24 = g24;
	}





	public JLabel getG25() {
		return G25;
	}





	public void setG25(JLabel g25) {
		G25 = g25;
	}





	public JLabel getG26() {
		return G26;
	}





	public void setG26(JLabel g26) {
		G26 = g26;
	}





	public JLabel getG33() {
		return G33;
	}





	public void setG33(JLabel g33) {
		G33 = g33;
	}





	public JLabel getG34() {
		return G34;
	}





	public void setG34(JLabel g34) {
		G34 = g34;
	}





	public JLabel getG35() {
		return G35;
	}





	public void setG35(JLabel g35) {
		G35 = g35;
	}





	public JLabel getG36() {
		return G36;
	}





	public void setG36(JLabel g36) {
		G36 = g36;
	}





	public JLabel getG43() {
		return G43;
	}





	public void setG43(JLabel g43) {
		G43 = g43;
	}





	public JLabel getG44() {
		return G44;
	}





	public void setG44(JLabel g44) {
		G44 = g44;
	}





	public JLabel getG45() {
		return G45;
	}





	public void setG45(JLabel g45) {
		G45 = g45;
	}





	public JLabel getG46() {
		return G46;
	}





	public void setG46(JLabel g46) {
		G46 = g46;
	}





	public JLabel getG13() {
		return G13;
	}



	public void setG13(JLabel g13) {
		G13 = g13;
	}



	public JLabel getG14() {
		return G14;
	}



	public void setG14(JLabel g14) {
		G14 = g14;
	}



	public JLabel getG15() {
		return G15;
	}



	public void setG15(JLabel g15) {
		G15 = g15;
	}



	public JLabel getG16() {
		return G16;
	}



	public void setG16(JLabel g16) {
		G16 = g16;
	}



	public JLabel getG11() {
		return G11;
	}


	public void setG11(JLabel g11) {
		G11 = g11;
	}


	public JLabel getG12() {
		return G12;
	}


	public void setG12(JLabel g12) {
		G12 = g12;
	}


	public JLabel getG21() {
		return G21;
	}


	public void setG21(JLabel g21) {
		G21 = g21;
	}


	public JLabel getG22() {
		return G22;
	}


	public void setG22(JLabel g22) {
		G22 = g22;
	}


	public JLabel getG31() {
		return G31;
	}


	public void setG31(JLabel g31) {
		G31 = g31;
	}


	public JLabel getG32() {
		return G32;
	}


	public void setG32(JLabel g32) {
		G32 = g32;
	}


	public JLabel getG41() {
		return G41;
	}


	public void setG41(JLabel g41) {
		G41 = g41;
	}


	public JLabel getG42() {
		return G42;
	}


	public void setG42(JLabel g42) {
		G42 = g42;
	}


	public JLabel getD1() {
		return D1;
	}


	public void setD1(JLabel d1) {
		D1 = d1;
	}


	public JLabel getD2() {
		return D2;
	}


	public void setD2(JLabel d2) {
		D2 = d2;
	}
}
