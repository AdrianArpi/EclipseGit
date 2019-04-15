package poo;

import Bucle_Arrays.Consola;

public class Uso_tallas {
	
	//Creacion de una variable donde solo se guardara estos valores
//	enum Talla{MINI,MEDIANO,GRANDE,MUY_GRANDE};
	
	
	
	enum Talla{
		
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {
			
			this.abreviatura=abreviatura;
		}
		
		
		public String dameAbreviatura() {
			
			return abreviatura;
			
		}
		
		private String abreviatura;
		
	}
	

	public static void main(String[] args) {
		
	//Almacenamos en s el valor de MINI
//	Talla s=Talla.MINI;
//	
//	Talla m=Talla.MEDIANO;
//	
//	Talla l=Talla.GRANDE;
//	
//	Talla xl=Talla.MUY_GRANDE;
	
		System.out.println("Introduce una talla: MINI, MEDIANA, GRANDE, MUY_GRANDE");
		String respuesta=Consola.leeString().toUpperCase();
		
		
		Talla la_talla=Enum.valueOf(Talla.class, respuesta);
		
		System.out.println(la_talla.dameAbreviatura());
		
		
	
		
	}

}
