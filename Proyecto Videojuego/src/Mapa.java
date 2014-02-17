
public class Mapa {
	private int[][] miMapa;
	private int minimo = 4;
	private int maximo = 20;
	private int quedanx, quedany;
	private int tamanyoHab = 1;
	private int posi=0;
	private int posj=0;
	private int contador=0;
	
	public Mapa(int size) {
		System.out.println("Intentando generar un mapa cuadrado de tama�o: "+size+"x"+size);
		quedanx = size-1;
		quedany = size-1;
		miMapa = new int[size][size];
		try{
			
			while(quedany>minimo){
				
				while(posi<size-1){
					posj=0;
					maximo = 20;
					minimo = 4;
					quedanx = size-1;
					
					while(posj<size-1){
						if(quedanx<maximo){
							maximo = quedanx;
						}
						if (quedanx-maximo<minimo){
							minimo = maximo-1;
						}
						
						
					// genero una habitaci�n con un tama�o aleatorio entre 4 y 20 posiciones;
						tamanyoHab = minimo + (int)(Math.random() * (maximo-minimo)+1);
						System.out.println("El tama�o de la habitaci�n es: "+tamanyoHab);
						
						// Intento rellenar el array con la nueva habitaci�n
		//				System.out.println("pos vale: "+posj);
						for (int i=0;i<=10;i++){
	//						System.out.println("i vale: "+i);
							for(int j = 0 ;j<=tamanyoHab;j++){
								if(i == 0| j == 0 | i == size-1 | j == size-1 | i == 10 | j == tamanyoHab){
									miMapa[posi+i][posj+j] = 1;
								}else {
									miMapa[posi+i][posj+j] = 0;
								}
								
		//						System.out.println("j vale: "+j);
							}
							
							
							
	//						System.out.println("pos vale: "+posi);
														
							
	
						}
						
						for (int k=0;k<miMapa.length;k++){
							for (int l=0;l<miMapa.length;l++){
								System.out.print(miMapa[k][l]);
							}System.out.println();
						}
					
						System.out.println("Habitaci�n Rellenada!");
						quedanx = quedanx - tamanyoHab;
		//				quedanx = quedanx - tamanyoHab;
						posj = posj + tamanyoHab;
					}
					posi = posi+10;
					quedany = quedany-10;
				}
			}
		
		}finally {
			System.out.println("OOPS!");
		}
//		catch (Exception e){
//			System.out.println("Ha ocurrido algo malo");
//		}
			
		// TODO Auto-generated constructor stub
	}

}