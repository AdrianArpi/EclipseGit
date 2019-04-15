package poo;

public class Uso_vehiculo {

	public static void main(String[] args) {

//		Coche num1=new Coche();
		
//		Una vez que llamamos a este metodo set, modifica nuestra variable, es importante primero modificar la variable 
//		y luego llamar al metodo  (get) que contiente nuestra nueva variable modificada
	/*	num1.establece_color("Amarillo");
		
		
		System.out.println(num1.dime_asientos());
		
		System.out.println(num1.dime_color());
		
		num1.configura_asientos("no");
		
		System.out.println(num1.dime_asientos());
		
		num1.configura_climatizador("si");
		
		System.out.println(num1.dime_climatizador());
		
		System.out.println(num1.dime_peso_coche());

		System.out.println("El precio de mi coche es:" + num1.precio_coche());
		
		
		System.out.println();*/
		Coche co1=new Coche();
		
		co1.establece_color("Verde");
		
		//El objeto furgoneta obtiene todos los metodos de la super clase
		Furgoneta fur1=new Furgoneta(5, 6);
		fur1.establece_color("Azul");
		
		
		System.out.println(co1.dime_datos_generales() + co1.dime_color());
		System.out.println(fur1.dime_datos_generales() + fur1.dime_color() + fur1.dimeDatosFurgoneta());
		
		
	}

}
