package Bucle_Arrays;


public class Uso_Array {

	public static void main(String[] args) {
		//Sintaxis de un array, que guardara 5 enteros --> Declaracion
		int []mi_matriz=new int[5];
		
		//Inicializacion
		//En la posicion (0) guardaremos el valor 5
		mi_matriz[0]=5;
		
		//En la posicion (1) guardaremos el valor 20
		mi_matriz[1]=20;
		
		//En la posicion (2) guardaremos el valor 3
		mi_matriz[2]=3;
		
		//En la posicion (3) guardaremos el valor 10
		mi_matriz[3]=10;
		
		//En la posicion (4) guardaremos el valor 25
		mi_matriz[4]=25;
		
		

		/*System.out.println(mi_matriz[0]);
		System.out.println(mi_matriz[1]);
		System.out.println(mi_matriz[2]);
		System.out.println(mi_matriz[3]);
		System.out.println(mi_matriz[4] + "\n");*/
		
		//Recorrera todo el array
		for(int i=0; i<5; i++) {
			
			System.out.println("Valor del indice" + i + "=" + mi_matriz[i]);
		}
		
		System.out.println();
		
		String[]mi_matriz2= {"Adrian", "es", "el", "mejor"};
		
	//Recorrera todo el array
		for(int i=0; i<mi_matriz2.length; i++) {
			
			System.out.println("Valor del indice" + i + "=" + mi_matriz2[i]);
		}
}

}
