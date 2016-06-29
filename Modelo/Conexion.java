package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	static private String bd = "pruebaJAVA"; 
	static private String url ="jdbc:mysql://127.0.0.1/"+bd;
	static private String usuario = "root";
	static private String clave = "1q2w3e"; 
	static private String driver ="com.mysql.jdbc.Driver";
	
	Connection conexion = null;
	
	public Conexion(){
		
		try{
			//Cargamos el driver de MySQL
			Class.forName(driver);
			
			//Establecemos la conexion con la base de datos
			conexion = DriverManager.getConnection(url, usuario, clave);
			
			//Si todo sale bien muestra el mensaje
			System.out.println("Conexion exitosa");
			
		}catch(Exception e){
			System.out.println("Error al conectar: "+e);
		}
		
	}

	public Connection getConexion() {
		return conexion;
	}
	
	public void desconectar(){
		conexion = null;
	}

}
