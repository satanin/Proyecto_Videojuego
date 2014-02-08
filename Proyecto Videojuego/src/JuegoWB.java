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
	public JuegoWB(String m[][]) {

		
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
		
		JLabel casillas[][] = new JLabel[5][5];
		
		for(int i=0;i<casillas.length;i++){
			for(int j=0;j<casillas[i].length;j++){
				System.out.println(m[i][j]);
				casillas[i][j] = new JLabel("");
				casillas[i][j].setIcon(new ImageIcon(JuegoWB.class.getResource("media/"+m[i][j])));
				casillas[i][j].setBounds(21+i*21, 21+j*21, 21, 21);
				contentPane.add(casillas[i][j]);
			}
		}
		
	}
	public void pintarMapa(){
		
	}
}
