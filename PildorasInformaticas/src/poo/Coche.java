package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	
	
	public Coche() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
	}
	
	public String dime_datos_generales() {
		
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas " + " mide "
		+ largo/1000 + " metros con un ancho de " + ancho;
		
	}
	
	
	
	
//	El metodo getter simpre debe retornar un valor, es por ello(RETURN)
	public String dime_largo() {
		
		return "El largo del coche es " + largo;
	}
	
//	El metodo setter no retorna nada es por ello la palabra(VOID)
	public void establece_color(String color_coche) {
		
		
		color=color_coche;
	}
	
	
//	En este metodo get llamamos al atributo color que ya ha sido modificado
	public String dime_color() {
		
		return "El color del coche es " + color;
		
	}
	
	public void configura_asientos(String asientos_cuero) { //SETTER
		
		if (asientos_cuero=="si") {
			this.asientos_cuero=true;
		
			
		}else {
			
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos() { //Los GETTERS siempre deben llevar un return
		
		if (asientos_cuero) {
			return "El coche tiene asientos de cuero";
			
		}else {
			
			return "El coche tiene asientos de serie";
		}
	}
	
	public void configura_climatizador(String climatizador) {
		
		if (climatizador=="si") {
			
			this.climatizador=true;
			
			
		}else {
			
			this.climatizador=false;
		}
		
	}
	
	public String dime_climatizador() { //GETTER
		
		if (climatizador==true) {
			return "El coche incorpora climatizador";
		
		
	}else {
		return "El coche lleva aire acondicionado";
		
	}
	}
	
	public String dime_peso_coche() {
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if (asientos_cuero==true) {
			
			peso_total=peso_total+50;
			
		}
		
		if (climatizador=true) {
			peso_total=peso_total+20;
		}
		
		return "El peso del coche es " + peso_total;
		
	}
	
	public int precio_coche() {//GETTER
		
		int precio_final=1000;
		
		if (asientos_cuero==true) {
			
			precio_final+=2000;
			
			
		}
		
		if (climatizador==true) {
			
			precio_final+=1500;
			
		}
		
		return precio_final;
		
	}
	

}

