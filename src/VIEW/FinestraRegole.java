package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class FinestraRegole extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnHitRiceviUna;

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinestraRegole frame = new FinestraRegole();
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
	public FinestraRegole() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(1050, 600, 232, 157);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMosseDisponibili = new JLabel("MOSSE DISPONIBILI:");
		lblMosseDisponibili.setBounds(10, 11, 271, 14);
		contentPane.add(lblMosseDisponibili);
		
		txtpnHitRiceviUna = new JTextPane();
		txtpnHitRiceviUna.setEditable(false);
		txtpnHitRiceviUna.setText("Hit: Ricevi una carta dal banco\r\n\r\nStand: Termina il tuo turno");
		txtpnHitRiceviUna.setBackground(SystemColor.control);
		txtpnHitRiceviUna.setBounds(10, 36, 196, 72);
		contentPane.add(txtpnHitRiceviUna);
	}
}
