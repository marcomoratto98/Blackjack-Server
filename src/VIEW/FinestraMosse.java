package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class FinestraMosse extends JFrame {

	private JPanel contentPane;
	private JButton btnHit;
	private JButton btnStand;
	private JButton btnRegole;
	private JScrollPane sCarte;
	private JPanel pCarte;

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinestraMosse frame = new FinestraMosse();
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
	public FinestraMosse() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 600, 930, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnHit = new JButton("HIT");
		btnHit.setBounds(10, 44, 95, 66);
		contentPane.add(btnHit);
		
		btnStand = new JButton("STAND");
		btnStand.setBounds(115, 44, 100, 66);
		contentPane.add(btnStand);
		
		btnRegole = new JButton("");
		btnRegole.setIcon(new ImageIcon(FinestraMosse.class.getResource("/javax/swing/plaf/metal/icons/Question.gif")));
		btnRegole.setBounds(850, 60, 64, 50);
		contentPane.add(btnRegole);
		
		sCarte = new JScrollPane();
		sCarte.setBounds(234, 0, 606, 172);
		contentPane.add(sCarte);
		
		pCarte = new JPanel();
		sCarte.setViewportView(pCarte);
	}

	
	
	public JButton getBtnRegole() {
		return btnRegole;
	}



	public void setBtnRegole(JButton btnRegole) {
		this.btnRegole = btnRegole;
	}

	
	public JScrollPane getsCarte() {
		return sCarte;
	}



	public void setsCarte(JScrollPane sCarte) {
		this.sCarte = sCarte;
	}



	public JPanel getpCarte() {
		return pCarte;
	}



	public void setpCarte(JPanel pCarte) {
		this.pCarte = pCarte;
	}



	public JButton getBtnHit() {
		return btnHit;
	}

	public void setBtnHit(JButton btnHit) {
		this.btnHit = btnHit;
	}

	public JButton getBtnStand() {
		return btnStand;
	}

	public void setBtnStand(JButton btnStand) {
		this.btnStand = btnStand;
	}

}
