package AlquilerVehiculos;

import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Contacto {

	private JFrame frmContacto;
	private JTextField textField;
	private JTextField textField_1;
	private JScrollPane AreaScroll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contacto window = new Contacto();
					window.frmContacto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Contacto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmContacto = new JFrame();
		frmContacto.setBounds(100, 100, 550, 400);
		//frmContacto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmContacto.getContentPane().setLayout(null);
		
		JLabel lblTuNombre = new JLabel("Tu Nombre:");
		lblTuNombre.setBounds(47, 28, 66, 14);
		frmContacto.getContentPane().add(lblTuNombre);
		
		textField = new JTextField();
		textField.setBounds(47, 41, 213, 20);
		frmContacto.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTuEmail = new JLabel("Tu Email:");
		lblTuEmail.setBounds(47, 87, 56, 14);
		frmContacto.getContentPane().add(lblTuEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(47, 101, 213, 20);
		frmContacto.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Mensaje:");
		lblNewLabel.setBounds(47, 147, 56, 14);
		frmContacto.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		AreaScroll=new JScrollPane(textArea);
		AreaScroll.setBounds(47, 160, 213, 69);
		frmContacto.getContentPane().add(AreaScroll);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(175, 238, 89, 23);
		frmContacto.getContentPane().add(btnNewButton);

	}
}
