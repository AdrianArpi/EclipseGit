package Bucle_Arrays;

public class ArrayBidimensional {

	public static void main(String[] args) {

		//El cuatro pertenece a la primera dimension (4 elementos 0-3)
		//El cinco pertenece a la segunda dimension (5 elementos 0-4)
		int enteros[][]=new int [4][5];
		
	//
		enteros[0][0]=15;
		enteros[0][1]=20;
		enteros[0][2]=10;
		enteros[0][3]=56;
		enteros[0][4]=28;
		
		enteros[1][0]=63;
		enteros[1][1]=45;
		enteros[1][2]=12;
		enteros[1][3]=11;
		enteros[1][4]=11;

		
		enteros[2][0]=15;
		enteros[2][1]=14;
		enteros[2][2]=42;
		enteros[2][3]=19;
		enteros[2][4]=18;
		
		enteros[3][0]=16;
		enteros[3][1]=14;
		enteros[3][2]=12;
		enteros[3][3]=17;
		enteros[3][4]=15;
		
		
/*//		recorrera la primera dimension
		for(int i =0; i<4; i++) {
			
//			Para que cada vez que termine de ejecutar una parte de la dimension, salte
			System.out.println();
			
//			Recorrera la segunda dimension
			for (int j=0; j<5; j++) {
				
//				probarlo con el debug
				System.out.print(enteros[i] [j] + " "); 
				
			}*/
		
		for(int[]fila:enteros){
			
			System.out.println();
			
			for(int z:fila) {
				
				System.out.print(z + " ");
			}
		}
		
		
	

	}

}

