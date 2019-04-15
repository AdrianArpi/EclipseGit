package poo;

public class Uso_Persona {

	public static void main(String[] args) {
		
		
		
		Persona[] str=new Persona[2];
		
		

	}

	//Creacion de metodo abstracto
	
	abstract class Persona{
		
		private String nombre;
		
		public Persona(String nombre) {
			
			this.nombre = nombre;
		}

		
		//Metodos que implementaremos 
		public String dameNombre() {
			
			return nombre;
			
			
			}
		
		
		//Forma de declarar un metodo abstrcto sin corchetes, por lo cual la clase debera ser abstracta
		public abstract String dameDescripcion();
		
		
		
	}
	class Empleado2 extends Persona{
		
		
		//variables definidas para que no puedan ser modificadas 
		
		private double sueldo;
		
		
		
		
		
		public Empleado2(String nombre) {
			
			super(nombre);
			
		
			
		} 
		
		
		//Creacion de un metodo abstracto para corregir error
		
		public String dameDescripcion() {
			
			return "Este empleado tiene un ID= "+ " con un sueldo= " + sueldo;
		}
		
	
		
		
		class Alumno extends Persona{
			
			
			private String carrera;
			
			public Alumno(String nombre,String car) {
				
				super(nombre);
				
				carrera=car;
				
			}
			
			
			public String dameDescripcion() {
				
				return "Este alumno esta estudiando la carrera de " + carrera;
			}
			
		}
		
		
		
	}
}
