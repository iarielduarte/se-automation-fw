package ar.com.selenium.fw.utils;

public class TestSQLite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona p = new Persona();
		 p.setId(2);
	     p.setSegundo_nombre("Ariel");
	     p.setSegundo_nombre("Reynaldo");
	     p.setSegundo_apellido("Vcc");
	     p.setSegundo_nombre("cpppp");
	     
	    Operaciones o = new Operaciones();
	    o.guardarUsuario(p);

	}

}
