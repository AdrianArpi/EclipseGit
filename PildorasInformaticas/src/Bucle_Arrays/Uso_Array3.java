package Bucle_Arrays;

public class Uso_Array3 {

	public static void main(String[] args) {
	String[] paises=new String[3];
			
			
			//Recorrera todo el array
			for(int i=0; i<paises.length; i++) {
				
				System.out.println("Introduce pais " + (i+1));
				paises[i]=Consola.leeString();
				
			}
			
			
			//Este bucle es la hostia...
			/*for(String i:paises) {
				System.out.println(i);
			}*/
		}

	}

