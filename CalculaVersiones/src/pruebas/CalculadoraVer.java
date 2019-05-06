package pruebas;

public class CalculadoraVer {

	int num1,num2;
	//Constructo con dos parametros
	public CalculadoraVer(int num1, int num2){
		
		this.num1=num1;
		this.num2=num2;
		
		
	}
	
	public int sumarNumeros(){
		
		return num1 + num2;
		
	}
	
	public int restarNumeros(){
		
		return num1-num2;
		
	}
	
	public int multiplicarNumeros(){
			
			return num1*num2;
			
		}
	
	
	public int dividirNumeros(){
		
		return num1/num2;
		
	}

	
	public static void main(String[] args) {
		CalculadoraVer str=new CalculadoraVer(8, 4);
		
		System.out.println("El resultado de la suma es: " + str.sumarNumeros());
		
		System.out.println("El resultado de la resta es: " + str.restarNumeros());
		
		System.out.println("El resultado de la multiplicacion es: " + str.multiplicarNumeros());
		
		System.out.println("El resultado de la division es: " + str.dividirNumeros());

	}

}
