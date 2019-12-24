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

public class Jpanel extends JPanel {
	private Clientes Nombre = new Clientes();
	private Vehiculos Vehiculo = new Vehiculos();
	private JTextField textFieldNombre, textFieldDias;
	private Choice choice = new Choice();
	private ImageIcon imagen;
	private JLabel labelfoto;
	
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
		lblMarca.setBounds(105, 101, 46, 14);
		add(lblMarca);

		JLabel lblDias = new JLabel("Dias");
		lblDias.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDias.setForeground(Color.WHITE);
		lblDias.setBounds(105, 144, 46, 14);
		add(lblDias);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(257, 68, 129, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);

		textFieldDias = new JTextField();
		textFieldDias.setBounds(257, 138, 129, 20);
		add(textFieldDias);
		textFieldDias.setColumns(10);

		JButton btnDatos = new JButton("Datos");
		btnDatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDatos.addActionListener(e -> {
			AgregarNombre();
			AgregarDias();
			AgregarVehiculos();
		});
		btnDatos.setBounds(275, 304, 89, 23);
		btnDatos.setBackground(new Color(242, 38, 19));
		add(btnDatos);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalcular.setBackground(new Color(34, 167, 240));
		btnCalcular.addActionListener(e -> {
			Vehiculo.SetCalculo();
			Jframe2 MarcoResultado = new Jframe2(btnDatos);
		});
		btnCalcular.setBounds(92, 304, 89, 23);
		add(btnCalcular);
		
		choice.addItemListener(arg0 -> CambioLogo());
		choice.setBounds(257, 101, 129, 20);
		add(choice);
		choice.add("Honda");
		choice.add("Toyota");
		choice.add("Nissan");
		choice.add("Bmw");

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

		labelfoto = new JLabel(imagen);
		labelfoto.setBounds(392, 89, 46, 45);
		add(labelfoto);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(96, 176, 302, 116);
		add(textArea);
	}

	public void AgregarNombre() {

		Nombre.setNombre(textFieldNombre.getText());
		textFieldNombre.setText("");
	}

	public void AgregarVehiculos() {

		Vehiculo.SetVehiculo(choice.getSelectedItem()/* (textFielMarca.getText()) */);
	}

	public void AgregarDias() {

		isNumber((textFieldDias.getText()));
		textFieldDias.setText("");
	}

	public boolean isNumber(String Numero) {

		Boolean resultado;

		try {
			Vehiculo.SetDias((Double.parseDouble(Numero)));
			resultado = true;
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Ingrese dias numericos");
			resultado = false;
		}

		return resultado;

	}
	
	public void CambioLogo() {
		
		switch(choice.getSelectedItem()) {
		
		case "Bmw":
			
			imagen = new ImageIcon("src/image/bmw2.PNG");
			labelfoto.setIcon(imagen);
		break;
		
		case "Toyota":
			
			imagen = new ImageIcon("src/image/toyota.PNG");
			labelfoto.setIcon(imagen);
		break;
		}
	}
	
}
