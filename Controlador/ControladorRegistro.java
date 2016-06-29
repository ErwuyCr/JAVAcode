package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.UsuarioDAO;
import Modelo.UsuarioVO;
import Vista.VistaRegistro;

public class ControladorRegistro implements ActionListener {

	VistaRegistro vistaRegistro = null;
	UsuarioVO usuarioVO;
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public ControladorRegistro(){
		vistaRegistro = new VistaRegistro();
		vistaRegistro.btnRegistrar.addActionListener(this);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		usuarioDAO.registrarUsuario(vistaRegistro.txtusuario.getText(), vistaRegistro.txtclave.getText());
	}

}
