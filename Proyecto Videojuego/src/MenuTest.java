import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MenuTest extends JFrame {

	private JPanel contentPane;
	private Mapa mapaJuego;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public MenuTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU DEL JUEGO");
		lblNewLabel.setBounds(65, 11, 100, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JButton btnPequeo = new JButton("Peque\u00F1o");
		btnPequeo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mapaJuego = new Mapa(51);
			}
		});
		btnPequeo.setBounds(85, 61, 75, 23);
		contentPane.add(btnPequeo);
		
		JLabel lblTamaoDelMapa = new JLabel("Tama\u00F1o del Mapa");
		lblTamaoDelMapa.setBounds(75, 36, 84, 14);
		contentPane.add(lblTamaoDelMapa);
		
		JButton btnMediano = new JButton("Mediano");
		btnMediano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mapaJuego = new Mapa(200);
			}
		});
		btnMediano.setBounds(85, 95, 75, 23);
		contentPane.add(btnMediano);
		
		JButton btnGrande = new JButton("Grande");
		btnGrande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mapaJuego = new Mapa(300);
			}
		});
		btnGrande.setBounds(85, 129, 75, 23);
		contentPane.add(btnGrande);
	}
}
