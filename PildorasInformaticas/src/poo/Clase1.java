package poo;
public class Clase1 {

	//Utilizamos protected para que al momoento de crear un objeto desde Clase3, este pueda acceder
	protected int mivar=5;
	
	protected int mivar2=7;
	
	protected String mimetodo() {
		
		return "El valor de mivar2 es: " + mivar2;
	}
}
