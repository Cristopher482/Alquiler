package AlquilerVehiculos;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Estimado {

	private JFrame frmEstimado;
	private JTextField textNombre, textMarca, textDias;
	Clientes ArrayNombre = new Clientes();
	Vehiculos ArrayVehiculos = new Vehiculos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estimado window = new Estimado();
					window.frmEstimado.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Estimado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEstimado = new JFrame();
		frmEstimado.setTitle("Rent-A-Car");
		frmEstimado.setBounds(100, 300, 450, 300);
		frmEstimado.setLocationRelativeTo(null);
		// frmEstimado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEstimado.getContentPane().setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(46, 50, 46, 14);
		frmEstimado.getContentPane().add(lblNombre);

		textNombre = new JTextField();
		textNombre.setBounds(157, 47, 166, 20);
		frmEstimado.getContentPane().add(textNombre);
		textNombre.setColumns(10);

		JLabel lblNewLabel = new JLabel("Marca");
		lblNewLabel.setBounds(46, 95, 46, 14);
		frmEstimado.getContentPane().add(lblNewLabel);

		JLabel lblDias = new JLabel("Dias");
		lblDias.setBounds(46, 152, 46, 14);
		frmEstimado.getContentPane().add(lblDias);

		textMarca = new JTextField();
		textMarca.setBounds(157, 92, 166, 20);
		frmEstimado.getContentPane().add(textMarca);
		textMarca.setColumns(10);

		textDias = new JTextField();
		textDias.setBounds(157, 149, 166, 20);
		frmEstimado.getContentPane().add(textDias);
		textDias.setColumns(10);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(e -> {

			/*
			 * cliente.setNombre(textNombre.getText());
			 * vehiculos.SetVehiculo(textMarca.getText());
			 * vehiculos.SetDias(Double.parseDouble(textDias.getText()));
			 * 
			 * vehiculos.SetCalculo();
			 * 
			 * StringBuilder stringBuilder = new StringBuilder();
			 * stringBuilder.append(cliente.getNombre());
			 * stringBuilder.append(vehiculos.getVehiculo());
			 * stringBuilder.append(vehiculos.getDias());
			 * System.out.println(vehiculos.GetInformacion());
			 */

			// Nombre.forEach((n)-> System.out.println(n));

			ArrayVehiculos.SetCalculo();

			System.out.println(ArrayVehiculos.GetInformacion());

			textNombre.setText("");
		});
		btnCalcular.setBounds(121, 227, 89, 23);
		frmEstimado.getContentPane().add(btnCalcular);

		JButton btnEntrardatos = new JButton("Datos");
		btnEntrardatos.addActionListener(arg0 -> {

			AgregarArrayNombre();
			AgregarArrayDias();
			AgregarArrayVehiculos();

			textNombre.setText("");
			textMarca.setText("");
			textDias.setText("");
		});
		btnEntrardatos.setBounds(244, 227, 89, 23);
		frmEstimado.getContentPane().add(btnEntrardatos);
	}

	public void AgregarArrayNombre() {

		ArrayNombre.setNombre(textNombre.getText());
	}

	public void AgregarArrayVehiculos() {

		ArrayVehiculos.SetVehiculo((textMarca.getText()));
	}

	public void AgregarArrayDias() {

		ArrayVehiculos.SetDias((Double.parseDouble(textDias.getText())));
	}

}
