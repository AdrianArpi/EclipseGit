package poo;

import java.sql.DatabaseMetaData;

public class Pruebas {

	public static void main(String[] args) {

//		Constructor preparado para recibir 2 parametros
		Empleados emp1=new Empleados("Adrian");
		Empleados emp2=new Empleados("Fernando");
		Empleados emp3=new Empleados("Melisa");
		Empleados emp4=new Empleados("Fernando");
		Empleados emp5=new Empleados("Melisa");
		
		
		
		emp1.cambiaSeccion("Programador");
		
		System.out.println(emp1.dameDatos());
		
		//Empleados.Id++; //Incrementamosla clase despues de proyectar el primer objeto
		
		System.out.println(emp2.dameDatos());
		
		System.out.println(emp3.dameDatos());
		
		System.out.println(emp4.dameDatos());
		
		System.out.println(emp5.dameDatos());
		
		System.out.println(Empleados.dameIdSiguiente()); //Cuando creamos metodos estaticos debemos acceder a ellos mediante el nombre de la clase
		
		
		
	}

}

	class Empleados{
		
		private  final String nombre; //Gracias a la palabra FINAL (constante) conseguimos que nuestra variable no pueda ser modificada por ningun metodo
		private String seccion;
		
		public int Id; //La palabra static consigue que no se repitan el mismo valor de variables, esta pertenece a una clase
		
		private static int IdSiguiente=1; //Gracias a esta variable estatica le pasamos como parametro a Id
		
		public Empleados(String nom) { //Una vez que creemos un nuevo objeto sera necesario escribir un nombre
			
			nombre=nom;
			
			
			//Le asignamos el valor que sera por defecto a menos que se cambie con el otro metodo setter 
			seccion="Administracion";
			
			//Id=1; Asignamos un valor inicial a id, pero debemos incrementarla en 1 para que cada vez aumente
			
			Id=IdSiguiente;
			
			IdSiguiente++; //COn esto evitamos tener que incrementar nustra variable cada vez que proyectamos un nuevo objeto
			
		}
		
		public void cambiaSeccion(String seccion) { //Setter para cambiar seccion
			
			this.seccion=seccion;
			
			
		}
		
		
		
		
		public String dameDatos() {//GETTER
			
			return "Nombre: " + nombre + " y la seccion es " + seccion + " ID: " + Id; //Debemos mantener esta ultima variable
		}

		
		//Construccion de metodo estatico y llamada desde Main (SOLO PUEDEN ACCEDER A OTRAS VARIABLES ESTATICAS)
		public static String dameIdSiguiente() {
			
			return "El IdSiguiente es: " + IdSiguiente;
		}
		
		
	}
