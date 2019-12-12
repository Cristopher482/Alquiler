package AlquilerVehiculos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTextPane;

public class Inicio {

	private JFrame frmInicio;
	boolean Ventana_Abierta_Contacto=false;
	boolean Ventana_Abierta_Estimado=false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frmInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInicio = new JFrame();
		frmInicio.getContentPane().setBackground(Color.WHITE);
		frmInicio.setTitle("Rent-A-Car");
		frmInicio.setBounds(100, 100, 450, 300);
		frmInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmInicio.setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("Inicio");
		menuBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Estimado");
		btnNewButton_1.addActionListener(e -> {
			if(Ventana_Abierta_Estimado==false) {
			Estimado ventana_Estimado=new Estimado();
			ventana_Estimado.main(null);
			Ventana_Abierta_Estimado=true;
			}
		});
		menuBar.add(btnNewButton_1);
			
		JButton btnNewButton_2 = new JButton("Contacto");
		btnNewButton_2.addActionListener(e ->{
			
			if(Ventana_Abierta_Contacto==false) {
			Contacto ventana_Contacto=new Contacto();
			ventana_Contacto.main(null);
			Ventana_Abierta_Contacto=true;
			}
		});
		menuBar.add(btnNewButton_2);
		frmInicio.getContentPane().setLayout(null);
		
		JTextPane textPane1 = new JTextPane();
		textPane1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textPane1.setText("Bienvenido: ");
		textPane1.setBounds(10, 11, 102, 214);
		frmInicio.getContentPane().add(textPane1);
		
		JTextPane textPane2 = new JTextPane();
		textPane2.setBounds(322, 11, 102, 214);
		frmInicio.getContentPane().add(textPane2);
	}
}
