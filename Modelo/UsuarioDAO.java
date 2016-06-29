package Modelo;

import javax.swing.JOptionPane;

import java.sql.Statement;

public class UsuarioDAO {
	
	public void registrarUsuario(String usuario, String clave){
	 	 
	 	// Creamos el query
	 	String query = "INSERT INTO usuarios(usuario,clave) VALUES ('"+usuario+"','"+clave+"')";
	 	 
	 	//Creamos el objeto que trae la informacion de conexion a la b.d.
	 	Conexion conexion = new Conexion();
	 	try{
		 	Statement st = conexion.getConexion().createStatement();
		 	st.executeUpdate(query);
		 	st.close();
		 	conexion.desconectar();
		 	System.out.print("Usuario Registrado exitosamente");
	 	}catch(Exception e){
	 		JOptionPane.showMessageDialog(null,"Error al insertar: "+e);
	 	}

	 }
	
	public void EliminarUsuario(String usuario){
	 	 
	 	// Creamos el query
		String query = "DELETE FROM usuarios WHERE usuario ="+usuario;
	 	 
	 	//Creamos el objeto que trae la informacion de conexion a la b.d.
	 	Conexion conexion = new Conexion();
	 	try{
		 	Statement st = conexion.getConexion().createStatement();
		 	st.executeUpdate(query);
		 	st.close();
		 	conexion.desconectar();
		 	System.out.print("Usuario Eliminado exitosamente \n");
	 	}catch(Exception e){
	 		JOptionPane.showMessageDialog(null,"Error al eliminar: "+e);
	 	}

	 }

}
