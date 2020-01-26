package AlquilerVehiculos;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Tarifas.TarifaHonda;

public class Menu_Jpanel extends JPanel {

	private JLabel LabelFoto,lblNombre,lblMarca,lblDias,lbldireccion,lbltelefono,lblIngreseSuInfromacion;
	private JTextField textFieldNombre, textFieldDias, textFieldDireccion, textFieldTelefono;
	private JButton btnborrar,btnCalcular,btnDatos;
	private JTextArea textArea;
	private ImageIcon Imagen;
	private Clientes Cliente = new Clientes();
	private Vehiculos Vehiculo = new Vehiculos();
	private Choice Choice = new Choice();
	private String NombreCliente = "";

	public Menu_Jpanel() {

		setLayout(null);
		setBackground(new Color(44, 62, 80));

		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setBounds(33, 136, 76, 14);
		add(lblNombre);

		lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setBounds(308, 136, 46, 14);
		add(lblMarca);

		lblDias = new JLabel("Dias");
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

		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText("Aqui aparecera tu resultado");
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(225, 288, 380, 111);
		add(scroll);

		btnDatos = new JButton("Datos");
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

		btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalcular.setBackground(new Color(34, 167, 240));
		btnCalcular.addActionListener(e -> {
			Vehiculo.SetCalculo();
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(Cliente.toString());
			stringBuilder.append(Vehiculo.toString());
			textArea.setText(stringBuilder.toString());
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

		LabelFoto = new JLabel();
		LabelFoto.setBounds(449, 152, 46, 45);
		add(LabelFoto);

		lbldireccion = new JLabel("Direccion");
		lbldireccion.setForeground(Color.WHITE);
		lbldireccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbldireccion.setBounds(33, 212, 76, 14);
		add(lbldireccion);

		textFieldDireccion = new JTextField();
		textFieldDireccion.setText("example@email.com");
		textFieldDireccion.setBounds(33, 237, 129, 20);
		add(textFieldDireccion);
		textFieldDireccion.setColumns(10);

		lbltelefono = new JLabel("Telefono");
		lbltelefono.setForeground(Color.WHITE);
		lbltelefono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbltelefono.setBounds(33, 281, 76, 14);
		add(lbltelefono);

		textFieldTelefono = new JTextField();
		textFieldTelefono.setBounds(33, 306, 129, 20);
		add(textFieldTelefono);
		textFieldTelefono.setColumns(10);

		btnborrar = new JButton("Borrar");
		btnborrar.addActionListener(arg0 -> borrarInformacion());
		btnborrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnborrar.setBackground(new Color(242, 38, 19));
		btnborrar.setBounds(499, 425, 89, 23);
		add(btnborrar);

		lblIngreseSuInfromacion = new JLabel("Ingrese su infromacion");
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

		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(e -> volverAInicio());
		mnOpciones.add(mntmSalir);

		JMenu mnTarifas = new JMenu("Tarifas");
		menuBar.add(mnTarifas);

		JMenuItem mntmHonda = new JMenuItem("Honda");
		mntmHonda.addActionListener(e -> {

			TarifaHonda honda = new TarifaHonda();
		});
		mnTarifas.add(mntmHonda);

		JMenuItem mntmToyota = new JMenuItem("Toyota");
		mnTarifas.add(mntmToyota);

		JMenuItem mntmNissan = new JMenuItem("Nissan");
		mnTarifas.add(mntmNissan);

		JMenuItem mntmBmw = new JMenuItem("Bmw");
		mnTarifas.add(mntmBmw);

		JMenu mnTerminos = new JMenu("Acerca de");
		menuBar.add(mnTerminos);

		JMenuItem mntmCreador = new JMenuItem("Creador");
		mntmCreador.addActionListener(e -> JOptionPane.showMessageDialog(null, "Cristopher morales gonzalez"));
		mnTerminos.add(mntmCreador);

	}

	// ------------------------------------- Metodos para agregar informacion

	public void AgregarNombre() {

		NombreCliente = textFieldNombre.getText().trim();
		if (NombreCliente.equals("")) {

			JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
		} else {
			Cliente.setNombre(textFieldNombre.getText());
		}

	}

	public void AgregarDireccion() {

		Cliente.setDireccion(textFieldDireccion.getText());
	}

	public void AgregarTelefono() {

		try {
			Cliente.setTelefono(Long.parseLong(textFieldTelefono.getText().trim()));

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Ingrese numero telefonico");
		}
	}

	public void AgregarMarca() {

		if (Choice.getSelectedItem() != "") {
			Vehiculo.SetVehiculo(Choice.getSelectedItem());
		} else {
			JOptionPane.showMessageDialog(null, "Elija Alguna Marca de carro");
		}
	}

	public void AgregarDias() {

		if (ValidarNumero(textFieldDias.getText()) == true) {
			Vehiculo.SetDias(Double.parseDouble(textFieldDias.getText().trim()));
		} else {
			JOptionPane.showMessageDialog(null, "Ingrese numero dia numerico");
		}
	}

	// ------------------------------------- otros metodos

	public boolean ValidarNumero(String Numero) {

		Boolean resultado;

		try {
			Double.parseDouble(Numero);
			resultado = true;
		} catch (Exception e) {

			resultado = false;
		}

		return resultado;

	}

	public void CambioLogo() {

		switch (Choice.getSelectedItem()) {

		case "Bmw":

			Imagen = new ImageIcon("src/image/bmw2.PNG");
			break;

		case "Toyota":

			Imagen = new ImageIcon("src/image/toyota.PNG");
			break;
		}
		LabelFoto.setIcon(Imagen);
	}

	public void borrarInformacion() {

		textFieldDias.setText("");
		textFieldTelefono.setText("");
		textFieldDireccion.setText("");
		textFieldNombre.setText("");
		textArea.setText("");
	}

	public void volverAInicio() {
	
		Terminos_Jpanel.ventanaMenu.dispose();

		Inicio_Jframe.ventanaInicial = new Inicio_Jframe();
	}
}
