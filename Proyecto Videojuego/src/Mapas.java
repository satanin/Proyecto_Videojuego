import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mapas {
private Scanner leeFichero;
//private int mapaLeido[][] = new int[5][5];
private String mapaLeido[][] = new String[5][5];
private String pintarMapa[]={"Suelo.png","Pared01.png","Pared02.png","Pared03.png","Pared04.png","Pared05.png","Puerta01.png","Puerta02.png"};

	public Mapas() {
		// TODO Auto-generated constructor stub
		int i=0,j=0;
		try{
			leeFichero = new Scanner ( new File ("./media/map"));
			
			while(leeFichero.hasNext()){
				
				mapaLeido[i][j]=pintarMapa[leeFichero.nextInt()];

				j++;
				if (j==5){
					i++;
					j=0;
				}
				
				
			}
			
			
		}catch (FileNotFoundException fileNotFoundException){
			System.out.println("No encuentro el archivo de mapas!");
		}
	}

	
	public void imprimeMapa(){
		int i=0,j=0;
		for(i=0;i<mapaLeido.length;i++){
			
			for(j=0;j<mapaLeido.length;j++){
				System.out.print(mapaLeido[i][j]);
			}System.out.println();			
		}
	}
	
	public String[][] devuelveMapa(){
		
		return mapaLeido;
	}
}
