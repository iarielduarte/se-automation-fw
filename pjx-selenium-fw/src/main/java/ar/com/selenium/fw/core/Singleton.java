package ar.com.selenium.fw.core;
/**
 * @author Ariel Duarte
 */

public class Singleton {
	//Se coloca la variable del mismo tipo que la clase llama por convension "instance".
	//Aqui reside todo el secreto de este patrón, ya que es dicha variable la que se
	//instancia por unica vez y se devuelve al cliente.
	private static Singleton instance;
	
	//Se privatiza el constructor para que no se pueda hacer un new Singleton() 
	//desde otro lugar que no sea dentro de la misma clase.
	private Singleton() { }
	
	//Para utilizar la unica instancia de la clase los clientes deveran convocar al metodo "getInstance()"
	//Si observamos la condicion del if solo sera true la primera vez.
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton single = Singleton.getInstance();
		
		//Esta mal y ya no se puede hacer asi.
		Singleton single2 = new Singleton();

	}

}
