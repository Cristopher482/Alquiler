package AlquilerVehiculos;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Jpanel extends JPanel {
	Clientes Nombre = new Clientes();
	Vehiculos Vehiculo = new Vehiculos();
	private JTextField textFieldNombre,textFielMarca,textFieldDias,textFieldResultado;
	/**
	 * Create the panel.
	 */
	public Jpanel() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(54, 56, 46, 14);
		add(lblNombre);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(54, 107, 46, 14);
		add(lblMarca);
		
		JLabel lblDias = new JLabel("Dias");
		lblDias.setBounds(54, 158, 46, 14);
		add(lblDias);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(160, 53, 129, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFielMarca = new JTextField();
		textFielMarca.setBounds(160, 104, 129, 20);
		add(textFielMarca);
		textFielMarca.setColumns(10);
		
		textFieldDias = new JTextField();
		textFieldDias.setBounds(160, 155, 129, 20);
		add(textFieldDias);
		textFieldDias.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(e -> {
			
			Vehiculo.SetCalculo();

			textFieldResultado.setText(Vehiculo.GetInformacion());
		});
		btnCalcular.setBounds(54, 210, 89, 23);
		add(btnCalcular);
		
		JButton btnDatos = new JButton("Datos");
		btnDatos.addActionListener(e -> {
			AgregarArrayNombre();
			AgregarArrayDias();
			AgregarArrayVehiculos();
		});
		btnDatos.setBounds(212, 210, 89, 23);
		add(btnDatos);
		
		textFieldResultado = new JTextField();
		textFieldResultado.setBounds(23, 269, 379, 20);
		add(textFieldResultado);
		textFieldResultado.setColumns(10);

	}
	
	public void AgregarArrayNombre() {

		Nombre.setNombre(textFieldNombre.getText());
		textFieldNombre.setText("");
	}

	public void AgregarArrayVehiculos() {

		Vehiculo.SetVehiculo((textFielMarca.getText()));
		textFielMarca.setText("");
	}

	public void AgregarArrayDias() {

		Vehiculo.SetDias((Double.parseDouble(textFieldDias.getText())));
		textFieldDias.setText("");
	}
}
