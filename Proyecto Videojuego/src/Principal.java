import java.awt.EventQueue;


public class Principal {

//	public static void main(String[] args) {
//
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Mapas esteMapa = new Mapas();
//					String m[][] = esteMapa.devuelveMapa();
//					JuegoWB frame = new JuegoWB(m);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	
//	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuTest frame = new MenuTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

}
