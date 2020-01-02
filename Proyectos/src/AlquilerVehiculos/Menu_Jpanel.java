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
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class Menu_Jpanel extends JPanel {
	private Clientes Cliente = new Clientes();
	private Vehiculos Vehiculo = new Vehiculos();
	private JTextField textFieldNombre, textFieldDias,textFieldDireccion,textFieldTelefono;
	private Choice Choice = new Choice();
	private ImageIcon Imagen;
	private JLabel LabelFoto;
	private String nombre="";
	public Menu_Jpanel() {
		
		setLayout(null);
		setBackground(new Color(44, 62, 80));

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setBounds(33, 136, 76, 14);
		add(lblNombre);

		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setBounds(308, 136, 46, 14);
		add(lblMarca);

		JLabel lblDias = new JLabel("Dias");
		lblDias.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDias.setForeground(Color.WHITE);
		lblDias.setBounds(308, 212, 46, 14);
		add(lblDias);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(33, 161, 129, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);

		textFieldDias = new JTextField();
		textFieldDias.setBounds(308, 237, 129, 20);
		add(textFieldDias);
		textFieldDias.setColumns(10);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(225, 288, 380, 111);
		add(textArea);

		JButton btnDatos = new JButton("Datos");
		btnDatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDatos.addActionListener(e -> {
			AgregarNombre();
			AgregarDireccion();
			AgregarTelefono();
			AgregarMarca();
			AgregarDias();
		});
		btnDatos.setBounds(265, 425, 89, 23);
		btnDatos.setBackground(Color.GREEN);
		add(btnDatos);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalcular.setBackground(new Color(34, 167, 240));
		btnCalcular.addActionListener(e -> {
			Vehiculo.SetCalculo();
			textArea.setText(Cliente.toString() + Vehiculo.toString());
		});
		btnCalcular.setBounds(10, 425, 89, 23);
		add(btnCalcular);
		
		Choice.addItemListener(arg0 -> CambioLogo());
		Choice.setBounds(308, 161, 129, 20);
		Choice.add("");
		Choice.add("Honda");
		Choice.add("Toyota");
		Choice.add("Nissan");
		Choice.add("Bmw");
		add(Choice);

		LabelFoto = new JLabel(Imagen);
		LabelFoto.setBounds(449, 152, 46, 45);
		add(LabelFoto);
		
		JLabel lbldireccion = new JLabel("Direccion");
		lbldireccion.setForeground(Color.WHITE);
		lbldireccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbldireccion.setBounds(33, 212, 76, 14);
		add(lbldireccion);
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.setText("example@email.com");
		textFieldDireccion.setBounds(33, 237, 129, 20);
		add(textFieldDireccion);
		textFieldDireccion.setColumns(10);
		
		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setForeground(Color.WHITE);
		lbltelefono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbltelefono.setBounds(33, 281, 76, 14);
		add(lbltelefono);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setBounds(33, 306, 129, 20);
		add(textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		JButton btnborrar = new JButton("Borrar");
		btnborrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnborrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnborrar.setBackground(new Color(242, 38, 19));
		btnborrar.setBounds(499, 425, 89, 23);
		add(btnborrar);
		
		
		
		JLabel lblIngreseSuInfromacion = new JLabel("Ingrese su infromacion");
		lblIngreseSuInfromacion.setForeground(Color.WHITE);
		lblIngreseSuInfromacion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblIngreseSuInfromacion.setBounds(175, 56, 287, 46);
		add(lblIngreseSuInfromacion);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 706, 42);
		menuBar.setBackground(Color.GRAY);
		add(menuBar);
		
		JMenu mnOpciones = new JMenu("opciones");
		menuBar.add(mnOpciones);
		
		JMenu mnTarifas = new JMenu("Tarifas");
		menuBar.add(mnTarifas);
		
		JMenu mnTerminos = new JMenu("Acerca de");
		menuBar.add(mnTerminos);
		
	
		
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

		nombre=textFieldNombre.getText().trim();
		if (nombre.equals("")) {

			JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
		}else {
			Cliente.setNombre(textFieldNombre.getText());
			textFieldNombre.setText("");
		}
		
	}
	
	public void AgregarDireccion() {

		Cliente.setDireccion(textFieldDireccion.getText());
		textFieldDireccion.setText("");
	}
	
	public void AgregarTelefono() {
		
		if(ValidarNumero(textFieldTelefono.getText().trim())==true){
			Cliente.setTelefono(Integer.parseInt(textFieldTelefono.getText().trim()));
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
			Vehiculo.SetDias(Integer.parseInt(textFieldDias.getText().trim()));
		}else {
			JOptionPane.showMessageDialog(null, "Ingrese numero dia numerico");
		}
		
		textFieldDias.setText("");
	}
}
