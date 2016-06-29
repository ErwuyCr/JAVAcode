package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VistaLogin;

public class ControladorLogin implements ActionListener {

	VistaLogin vistaLogin = null;
	
	public ControladorLogin(VistaLogin vistaLogin){
		this.vistaLogin = vistaLogin;
		this.vistaLogin.btnEntrar.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
	}

}
