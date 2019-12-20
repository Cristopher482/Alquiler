package AlquilerVehiculos;

import java.awt.Choice;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;

public class Jpanel extends JPanel {
	public static Clientes Nombre = new Clientes();
	public Vehiculos Vehiculo = new Vehiculos();
	private JTextField textFieldNombre, textFieldDias;
	Choice choice = new Choice();

	/**
	 * Create the panel.
	 */
	public Jpanel() {
		setLayout(null);

		setBackground(new Color(44, 62, 80));
		ImageIcon imagen=new ImageIcon("src/image/bmw2.PNG");

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setBounds(54, 56, 76, 14);
		add(lblNombre);

		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setBounds(54, 107, 46, 14);
		add(lblMarca);

		JLabel lblDias = new JLabel("Dias");
		lblDias.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDias.setForeground(Color.WHITE);
		lblDias.setBounds(54, 158, 46, 14);
		add(lblDias);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(160, 53, 129, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);

		textFieldDias = new JTextField();
		textFieldDias.setBounds(160, 155, 129, 20);
		add(textFieldDias);
		textFieldDias.setColumns(10);

		JButton btnDatos = new JButton("Datos");
		btnDatos.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDatos.addActionListener(e -> {
			AgregarNombre();
			AgregarDias();
			AgregarVehiculos();
		});
		btnDatos.setBounds(212, 210, 89, 23);
		btnDatos.setBackground(new Color(242, 38, 19));
		add(btnDatos);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalcular.setBackground(new Color(34, 167, 240));
		btnCalcular.addActionListener(e -> {
			Vehiculo.SetCalculo();
			Jframe2 MarcoResultado = new Jframe2(btnDatos);
		});
		btnCalcular.setBounds(54, 210, 89, 23);
		add(btnCalcular);
		
		choice.setBounds(160, 112, 129, 20);
		add(choice);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 153, 0));
		panel.setBounds(0, 0, 515, 45);
		add(panel);
		
		choice.add("Honda");
		choice.add("Toyota");
		choice.add("Nissan");
		choice.add("Bmw");
		
		JLabel labelfoto = new JLabel(imagen);
		labelfoto.setBounds(295, 112, 21, 20);
		add(labelfoto);
	}

	public void AgregarNombre() {

		Nombre.setNombre(textFieldNombre.getText());
		textFieldNombre.setText("");
	}

	public void AgregarVehiculos() {
		
		Vehiculo.SetVehiculo(choice.getSelectedItem()/*(textFielMarca.getText())*/);
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

			System.out.println("Ingrese dias");
			resultado = false;
		}

		return resultado;

	}
}
