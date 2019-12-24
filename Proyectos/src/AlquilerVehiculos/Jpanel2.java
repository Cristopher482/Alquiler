package AlquilerVehiculos;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Jpanel2 extends JPanel {
	
	private JTextField textField;
	private Clientes Nombre=new Clientes();
	private Vehiculos Vehiculo=new Vehiculos();
	
	public Jpanel2() {
		
		setLayout(null);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(182, 27, 89, 14);
		add(lblResultado);
		
		textField = new JTextField();
		textField.setBounds(74, 113, 313, 20);
		add(textField);
		textField.setColumns(10);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append((Nombre.getNombre()));
		stringBuilder.append((Vehiculo.toString()));
		textField.setText(stringBuilder.toString());
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(arg0 -> {
			
		});
		btnInicio.setBounds(120, 190, 89, 23);
		add(btnInicio);
		
		JLabel lblCalcularOtraVez = new JLabel("calcular otra vez:");
		lblCalcularOtraVez.setBounds(148, 173, 97, 14);
		add(lblCalcularOtraVez);

	}
}
