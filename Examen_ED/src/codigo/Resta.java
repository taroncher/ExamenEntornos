package codigo;


/*
 * Clase que nos permite restar dos n�meros enteros
 * */
public class Resta {
	//Inicializaci�n
	private int a;
	private int b;

	//Constructor
	public Resta() {
		a=0;
		b=0;
	}
	
	public void setA(int a){
		this.a=a;
	}

	public void setB(int b){
		this.b=b;
	}
	
	//M�todo que permite restar dos n�meros enteros
	public int resta(){
		return a-b;
	}
}
