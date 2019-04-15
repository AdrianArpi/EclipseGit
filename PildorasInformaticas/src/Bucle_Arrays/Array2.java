package Bucle_Arrays;



public class Array2 {

	public static void main(String[] args) {

		String[] paises=new String[3];
		
		paises[0]="Ecuador";
		paises[1]="Alemania";
		paises[2]="Jamaica";
		
		//Recorrera todo el array
		/*for(int i=0; i<paises.length; i++) {
			
			System.out.println("Pais" + (i+1) + " =" + paises[i]);
		}*/
		
		
		//Este bucle es la hostia...
		for(String i:paises) {
			System.out.println(i);
		}
		
		int[]numeros_aleatorios=new int[150];
		
		for(int i=0; i<numeros_aleatorios.length; i++) {
			
			numeros_aleatorios[i]=(int)Math.round(Math.random()*100);
			
		}
		
		for(int numeros:numeros_aleatorios) {
			
			System.out.print(numeros + " ");
		}
	}

}
