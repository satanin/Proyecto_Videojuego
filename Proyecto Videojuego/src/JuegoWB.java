import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class JuegoWB extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public JuegoWB() {

		
		addWindowListener(new WindowAdapter() {
			
			public void windowOpened(WindowEvent arg0) {
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 133, 147);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label10 = new JLabel("");
		label10.setBounds(25, 21, 21, 21);
		contentPane.add(label10);
		
		JLabel label00 = new JLabel("");
		label00.setBounds(25, 0, 21, 21);
		contentPane.add(label00);
		
		JLabel label20 = new JLabel("");
		label20.setBounds(25, 42, 21, 21);
		contentPane.add(label20);
		
		JLabel label30 = new JLabel("");
		label30.setBounds(25, 63, 21, 21);
		contentPane.add(label30);
		
		JLabel label40 = new JLabel("");
		label40.setBounds(25, 84, 21, 21);
		contentPane.add(label40);
		
		JLabel label01 = new JLabel("");
		label01.setBounds(46, 0, 21, 21);
		contentPane.add(label01);
		
		JLabel label11 = new JLabel("");
		label11.setBounds(46, 21, 21, 21);
		contentPane.add(label11);
		
		JLabel label21 = new JLabel("");
		label21.setBounds(46, 42, 21, 21);
		contentPane.add(label21);
		
		JLabel label31 = new JLabel("");
		label31.setBounds(46, 63, 21, 21);
		contentPane.add(label31);
		
		JLabel label41 = new JLabel("");
		label41.setBounds(46, 84, 21, 21);
		contentPane.add(label41);
		
		JLabel label02 = new JLabel("");
		label02.setBounds(67, 0, 21, 21);
		contentPane.add(label02);
		
		JLabel label12 = new JLabel("");
		label12.setBounds(67, 21, 21, 21);
		contentPane.add(label12);
		
		JLabel label22 = new JLabel("");
		label22.setBounds(67, 42, 21, 21);
		contentPane.add(label22);
		
		JLabel label32 = new JLabel("");
		label32.setBounds(67, 63, 21, 21);
		contentPane.add(label32);
		
		JLabel label42 = new JLabel("");
		label42.setBounds(67, 84, 21, 21);
		contentPane.add(label42);
		
		JLabel label03 = new JLabel("");
		label03.setBounds(88, 0, 21, 21);
		contentPane.add(label03);
		
		JLabel label13 = new JLabel("");
		label13.setBounds(88, 21, 21, 21);
		contentPane.add(label13);
		
		JLabel label23 = new JLabel("");
		label23.setBounds(88, 42, 21, 21);
		contentPane.add(label23);
		
		JLabel label33 = new JLabel("");
		label33.setBounds(88, 63, 21, 21);
		contentPane.add(label33);
		
		JLabel label43 = new JLabel("");
		label43.setBounds(88, 84, 21, 21);
		contentPane.add(label43);
		
		JLabel label04 = new JLabel("");
		label04.setBounds(109, 0, 21, 21);
		contentPane.add(label04);
		
		JLabel label14 = new JLabel("");
		label14.setBounds(109, 21, 21, 21);
		contentPane.add(label14);
		
		JLabel label24 = new JLabel("");
		label24.setBounds(109, 42, 21, 21);
		contentPane.add(label24);
		
		JLabel label34 = new JLabel("");
		label34.setBounds(109, 63, 21, 21);
		contentPane.add(label34);
		
		JLabel label44 = new JLabel("");
		label44.setIcon(new ImageIcon("D:\\Copy\\Programaci\u00F3n\\Workspaces\\JuegoWB\\media\\Pared05.png"));
		label44.setBounds(109, 84, 21, 21);
		contentPane.add(label44);
		Mapas esteMapa = new Mapas();
		String m[][] = esteMapa.devuelveMapa();
		
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m.length;j++){
				

			}
		}
	}
}
