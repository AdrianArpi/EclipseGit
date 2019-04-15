package Bucle_Arrays;

public class ExcelBidimensional {

	public static void main(String[] args) {
		
		double acumulado;
		
//	Representamos el 10%
		double interes=0.10;
		
		double [][]saldo=new double [6][5];
		
//		Recorreremos la primera dimension
		for (int i=0; i<6; i++) {
			
//			Mantenemos el valor fijo inicial del cual nos valdremos
			saldo[i][0]=10000;
			
//			La iremos incrementando paulatinamente
			acumulado=10000;
			
			
//			Recorremos la segunda dimension y lo iniciamos en 1 xq tengo ucupada toda la segunda fila de la dimension
			
		for(int j=1; j<5; j++) {
			
			acumulado=+acumulado + (acumulado* interes);
			
			saldo[i][j]=acumulado;
			
		}
		
//		Esto equivale al paso del 10% al 11% y viceversa
			interes=interes + 0.01;
			
		}
		
//		Proyeccion de el array completo
		for(int z=0; z<6; z++) {
			
			System.out.println();
			
			for(int h=0; h<5; h++) {
				
//				De acorde a esta declaracion imprimimos solo 2 decimales
				System.out.printf("%1.2f" , saldo[z][h]);
				
				System.out.print(" ");
				
			}
			
			
		}
	}
}
