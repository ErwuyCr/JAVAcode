package Vista;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaRegistro extends JFrame {
	
	public JLabel lblusuario, lblclave;
	public JTextField txtusuario, txtclave;
	public JButton btnRegistrar;
	public Container container;
	public Font font;
	
	public VistaRegistro(){
		setTitle("Registrar");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 200, 600, 300);
		container = getContentPane();
		container.setLayout(new GridLayout(3,1));
		font = new Font("Tahoma", Font.PLAIN, 20);
		
		lblusuario = new JLabel("usuario");
		lblusuario.setFont(font);
		lblclave = new JLabel("clave");
		lblclave.setFont(font);
		
		txtusuario = new JTextField();
		txtusuario.setFont(font);
		txtclave = new JTextField();
		txtclave.setFont(font);
		
		btnRegistrar = new JButton("entrar");
		btnRegistrar.setFont(font);
		
		container.add(lblusuario);
		container.add(txtusuario);
		container.add(lblclave);
		container.add(txtclave);
		container.add(btnRegistrar);
		
		setVisible(true);
		setResizable(false);
		
	}

}
