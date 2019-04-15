package poo;

import java.util.*;

public class Uso_empleado {
	
	public static void main(String[] args) {
		
//		construimos nuestro objeto de acorde a las variables creadas
//		Empleado emp1=new Empleado("Adrian", 5.000, 2019, 3, 20);
//		
//		otro nuevo enmpleado
//		Empleado emp2=new Empleado("Jesus", 5.000, 2020, 6, 5);	
//		
//		Empleado emp3=new Empleado("Adrian", 5.000, 2010, 9, 1);
		
//		Modificamos su sueldo 
		
//		emp1.subeSueldo(5);
//		emp2.subeSueldo(6);
//		emp3.subeSueldo(7);
		
//		Proyectamos sus datos
		
//		Para poder acceder a cada uno de los datos debemos llamar  al empleado junto a su debido getter 
//		System.out.println("Nombre: " + emp1.dameNombre() + " Sueldo: " + emp1.dameSueldo() + " Fecha alta: " + emp1.dameFechaContrato());
//		
//		System.out.println("Nombre: " + emp2.dameNombre() + " Sueldo: " + emp2.dameSueldo() + " Fecha alta: " + emp2.dameFechaContrato());
//		
//		System.out.println("Nombre: " + emp3.dameNombre() + " Sueldo: " + emp3.dameSueldo() + " Fecha alta: " + emp3.dameFechaContrato());
		
		
		
//		Momento de crear un objeto del jefe
		Jefatura jefe_RR=new Jefatura("Angel", 2.300, 2019, 03, 12);
		jefe_RR.estableceIncentivo(2.750);
		
		
		
		//Aqui creamos un array de tres posiciones, las cuales seran para nuestros empleados
		Empleado[] misEmpleados=new Empleado[6];
		
		misEmpleados[0]=new Empleado("Adrian", 5000, 2018, 12, 21);
		misEmpleados[1]=new Empleado("Pepe", 5000, 2020, 10, 8);
		misEmpleados[2]=new Empleado("Aitzol", 5000, 2019, 6, 12);
		misEmpleados[3]=new Empleado("Fernando"); //Un solo argumento para diferenciarlo de el otro constructor
		misEmpleados[4]=jefe_RR; //COn esto añadimos toda la informacion del jefe...
		misEmpleados[5]=new Jefatura("Maria", 1.700, 2018, 04, 20); //Tambien podemos instanciar directamente al array
		
		//A continucacion haremos un casting
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		jefa_Finanzas.estableceIncentivo(5500);
		
		
//		Primero aumentamos el sueldo de cada empleado
		
/*		for(int i=0; i<3; i++) {
			
			misEmpleados[i].subeSueldo(5);
			
			
		}*/
		
/*		Luego proyectamos cada uno de sus datos, llamando exclusivamente a los getters
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + "Sueldo: "+ misEmpleados[i].dameSueldo() + " Fecha Alta: "+ misEmpleados[i].dameFechaContrato());
			
		}*/
			
		//Prueba para verificar la interfaz
		System.out.println(jefa_Finanzas.tomar_decisiones("Mandar a toos a la verga"));
		
		System.out.println(jefa_Finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dameNombre()+ " tiene un bonus de " + misEmpleados[3].establece_bonus(500));
		
		
		
		//En este bucle for mejorado creamos un objeto de Empleado para poder proyectar cada uno
		
		for(Empleado e:misEmpleados) {
			
			e.subeSueldo(5);
		}
		
		
		//Metodo par aodenar el objeto del array, pero solo si creamos una interfaz... 
		Arrays.sort(misEmpleados);
		
		
		Empleado director_comercial=new Jefatura("Sandra",8500,2012,05,05);
		
		//No se puede instanciar la intefaz, pero si las clases que forman parte de ella.
		Comparable ejemplo=new Empleado("Adrian",9500,2019,06,06);
		
		
		if(director_comercial instanceof Empleado) {
			
			System.out.println("Es de tipo jefatura");
		}
		
		
		if(ejemplo instanceof Comparable) {
			
			System.out.println("Implementa la interfaz comparable");
			
			
		}
		
		
		for(Empleado e:misEmpleados) {
			
			System.out.println("Nombre " + e.dameNombre() + " Sueldo: "+ e.dameSueldo() + " Fecha Alta: "+ e.dameFechaContrato());
		}
			
		

		
	}

}


class Empleado implements Comparable,Trabajadores{
	
	
	//variables definidas para que no puedan ser modificadas 
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		
		sueldo=sue;
		
		
		//Agregamos un nuevo objeto a partir de informacion de la API DE JAVA
		//La variable mes le restamos 1 xq el estado unicial empieza en 0(enero)
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		//Almacenar dentro de la variable una fecha
		altaContrato=calendario.getTime();
		
		
	} 
	
	
	//Ahora (sobrecarga de constructores), dar mas de un estado inicial (constructor)
	
	public Empleado(String nom) { //La diferecia sera el numero de nuevas variables
		
		//nombre=nom;
		
		this(nom, 3000, 2000, 01, 01); //Con esto logramos que adquiera las demas variables se almacenen con las del 1ª construc.
		
		
	}
	
	//Todos los siguientes getters devolveran los valores almacenados en el constructor es por ello que siempre deben tener el return
	
	public String dameNombre() {//GETTER
		
		return nombre;
	}
	
	public double dameSueldo() {//GETTER
		
		return sueldo;
	}
	
	public Date dameFechaContrato() {//GETTER
		return altaContrato;
	}
	
	//Los siguientes metodos setter se utilizaran para modificar cada una de las variables de los constructores
	
	public void subeSueldo(double porcentaje) {//una nueva varieble que recibira un nuevo valor cuando llamemos a este metodo 
		
		double aumento=sueldo*porcentaje/100; //Creamos una nueva variable que es donde almacenaremos el resultado
		
		sueldo+=aumento;
		
		
		
	}
	
	//Creacion de la intefaz Comparable para poder ordenar el array
	public int compareTo(Object miObjeto) {
		
		
		//Hacemos un casting 
		Empleado otroEmpleado=(Empleado) miObjeto;
		if(this.sueldo < otroEmpleado.sueldo) {
			return -1;
			
			
		}
		
		
		if(this.sueldo < otroEmpleado.sueldo) {
			return 1;
			
			
		}
		
		return 0;
	}
	
	
	//Implementacion de la interfaz Trabajadores
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
	
	
}

 //Creacion de una nueva clase para experimentar

	class Jefatura extends Empleado implements Jefes{ //De esta forma añadimos herencia multiple a partir de interfaces, pero debemos inplementar sus metodos
	

	//Nueva variable solo par jefe
	private double incentivo;
	
	
	//IMplementacion del metodo de la interfaz
	public String tomar_decisiones(String decision) {
		
		return "La decision que debe tomar es: " + decision;
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		//Llamos al primer constructor ya que es el que contiene todas estas variables
		super(nom, sue, agno, mes, dia);
		
	}
	
	
	public void estableceIncentivo(double b) { //SETTER
		
		//Le pasamos a b la variable incentivo
		incentivo=b;
	}
	
	//En este caso ultilizaremos el metodo de empleado, pero lo modificaremos xq no cumple con los rquisitos, machacamos variable
	public double dameSueldo() { //GETTER
		
		//Sobreescribomos el metodo que eredamos asignandolo a una variable
		double sueldoJefe=super.dameSueldo(); //Llama el metodo de la clase padre
		
		return sueldoJefe + incentivo;
		
		
		
	}
	
	
	
}

