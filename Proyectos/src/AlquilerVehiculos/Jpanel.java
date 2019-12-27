package AlquilerVehiculos;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jpanel extends JPanel {
	private Clientes Cliente = new Clientes();
	private Vehiculos Vehiculo = new Vehiculos();
	private JTextField textFieldNombre, textFieldDias,textFieldDireccion,textFieldTelefono;
	private Choice Choice = new Choice();
	private ImageIcon Imagen;
	private JLabel LabelFoto;
	
	public Jpanel() {
		
		setLayout(null);
		setBackground(new Color(44, 62, 80));

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setBounds(105, 68, 76, 14);
		add(lblNombre);

		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setBounds(105, 192, 46, 14);
		add(lblMarca);

		JLabel lblDias = new JLabel("Dias");
		lblDias.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDias.setForeground(Color.WHITE);
		lblDias.setBounds(105, 232, 46, 14);
		add(lblDias);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(257, 68, 129, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);

		textFieldDias = new JTextField();
		textFieldDias.setBounds(257, 232, 129, 20);
		add(textFieldDias);
		textFieldDias.setColumns(10);

		JButton btnDatos = new JButton("Datos");
		btnDatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDatos.addActionListener(e -> {
			AgregarNombre();
			AgregarDireccion();
			AgregarTelefono();
			AgregarMarca();
			AgregarDias();
		});
		btnDatos.setBounds(173, 304, 89, 23);
		btnDatos.setBackground(Color.GREEN);
		add(btnDatos);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalcular.setBackground(new Color(34, 167, 240));
		btnCalcular.addActionListener(e -> {
			Vehiculo.SetCalculo();
			Jframe2 MarcoResultado = new Jframe2(btnDatos);
		});
		btnCalcular.setBounds(32, 304, 89, 23);
		add(btnCalcular);
		
		Choice.addItemListener(arg0 -> CambioLogo());
		Choice.setBounds(257, 192, 129, 20);
		add(Choice);
		Choice.add("Honda");
		Choice.add("Toyota");
		Choice.add("Nissan");
		Choice.add("Bmw");

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 153, 0));
		panel.setBounds(0, 0, 526, 45);
		add(panel);
		panel.setLayout(null);

		JLabel lblRentacar = new JLabel("Rent-A-Car");
		lblRentacar.setForeground(Color.WHITE);
		lblRentacar.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRentacar.setBounds(184, 11, 119, 23);
		panel.add(lblRentacar);

		LabelFoto = new JLabel(Imagen);
		LabelFoto.setBounds(392, 177, 46, 45);
		add(LabelFoto);
		
		JLabel lbldireccion = new JLabel("Direccion");
		lbldireccion.setForeground(Color.WHITE);
		lbldireccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbldireccion.setBounds(105, 110, 76, 14);
		add(lbldireccion);
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.setText("example@email.com");
		textFieldDireccion.setBounds(257, 110, 129, 20);
		add(textFieldDireccion);
		textFieldDireccion.setColumns(10);
		
		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setForeground(Color.WHITE);
		lbltelefono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbltelefono.setBounds(105, 152, 76, 14);
		add(lbltelefono);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setBounds(257, 152, 129, 20);
		add(textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		JButton btnborrar = new JButton("Borrar");
		btnborrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnborrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnborrar.setBackground(new Color(242, 38, 19));
		btnborrar.setBounds(297, 306, 89, 23);
		add(btnborrar);
	}
	
	public boolean ValidarNumero(String Numero) {

		Boolean resultado;

		try {
			Integer.parseInt(Numero);
			resultado = true;
		} catch (Exception e) {

			resultado = false;
		}

		return resultado;

	}
	
	
	public void CambioLogo() {
		
		switch(Choice.getSelectedItem()) {
		
		case "Bmw":
			
			Imagen = new ImageIcon("src/image/bmw2.PNG");
			LabelFoto.setIcon(Imagen);
		break;
		
		case "Toyota":
			
			Imagen = new ImageIcon("src/image/toyota.PNG");
			LabelFoto.setIcon(Imagen);
		break;
		}
	}
	
	//------------------------------------- Metodos para agregar informacion

	public void AgregarNombre() {

		Cliente.setNombre(textFieldNombre.getText());
		textFieldNombre.setText("");
	}
	
	public void AgregarDireccion() {

		Cliente.setDireccion(textFieldDireccion.getText());
		textFieldDireccion.setText("");
	}
	
	public void AgregarTelefono() {
		
		if(ValidarNumero(textFieldTelefono.getText())==true){
			Cliente.setTelefono(Integer.parseInt(textFieldTelefono.getText()));
		}else {
			JOptionPane.showMessageDialog(null, "Ingrese numero telefonico");
		}
		
		textFieldTelefono.setText("");
	}

	public void AgregarMarca() {

		Vehiculo.SetVehiculo(Choice.getSelectedItem()/* (textFielMarca.getText()) */);
	}

	public void AgregarDias() {

		if(ValidarNumero(textFieldDias.getText())==true){
			Vehiculo.SetDias(Integer.parseInt(textFieldDias.getText()));
		}else {
			JOptionPane.showMessageDialog(null, "Ingrese numero dia numerico");
		}
		
		textFieldDias.setText("");
	}

}
