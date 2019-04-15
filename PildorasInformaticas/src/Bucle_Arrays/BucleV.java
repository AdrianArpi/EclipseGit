package Bucle_Arrays;

public class BucleV {

	public static void main(String[] args) {
		
		int arroba=0;
		int punto=0;
		System.out.println("Introduce tu correo xD");
		String mail=Consola.leeString();
		
		for(int i=0; i<mail.length(); i++ ) {
			
			if(mail.charAt(i)=='@') {
				arroba++;
			}
			
			if(mail.charAt(i)=='.') {
				punto++;
			}
			
		}
		
		
		if(arroba==1 && punto==1 ) {
			System.err.println("Es correcto");
			
			
		}else {
			System.out.println("No es correcto");
			System.out.println("Han aparecido: " + arroba + " arrobas" + " y\n" + punto + " puntos de mas" );
		}

		System.out.println("\n");
		
		//Bucle para obtener el factirial de un numero
		int resultado=1;
		int numero=0;
		
		System.out.println("Introduce un numero");
		numero=Consola.leeInt();
		
		for(int i=numero; i>0; i--) {
			
			resultado=resultado * i;
			
		}
		
		System.out.println("El factorial de " + numero + " es" + resultado);
	}

}
