package ar.com.selenium.fw.utils;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 * Write a description of class Conexion here.
 * 
 * @author Rey Salcedo 
 * @version (a version number or a date)
 */
public class Conexion{
	Connection conexion;
	Statement consulta;
	public String ruta;
	

    /**
     * Constructor for objects of class Conexion
     */
    public Conexion()
    {
//        ruta = "/home/taniao/Escritorio/registro.db";
    	System.out.println("ruta : "+System.getProperty("user.dir")+File.separator);
    	 ruta = System.getProperty("user.dir")+File.separator+"registro.db";
        
    }
    public void conectar(){
		try {
	            Class.forName("org.sqlite.JDBC");
	        }
	        catch (ClassNotFoundException e) {
	            JOptionPane.showMessageDialog(null, e.getMessage());
	        }	 
			try {
                            conexion = DriverManager.getConnection("jdbc:sqlite:"+ruta);
                            consulta = conexion.createStatement();
			} catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
	}
    
}

