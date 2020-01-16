package AlquilerVehiculos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Terminos_Jpanel extends JPanel {

	private JLabel label1;

	private JCheckBox check1;

	private JButton boton1, boton2;

	private JScrollPane scrollpane1;

	private JTextArea textarea1;

	public static Menu_Jframe ventanaMenu;

	public Terminos_Jpanel() {

		setBackground(new Color(44, 62, 80));
		setLayout(null);

		label1 = new JLabel("TERMINOS Y CONDICIONES");
		label1.setBounds(39, 11, 180, 30);
		label1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		label1.setForeground(Color.WHITE);
		add(label1);

		textarea1 = new JTextArea();
		textarea1.setForeground(Color.WHITE);
		textarea1.setEditable(false);
		textarea1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 11));
		textarea1.setLineWrap(true);
		textarea1.setText("\n Para completar tu registro debes aceptar los terminos de uso y el procesamiento, "
				+ "tratamiento y transferencia de tus datos personales conforme a lo dispuesto en las politicas de privacidad");
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(39, 52, 200, 125);
		scrollpane1.setBorder(null);
		textarea1.setBackground(new Color(44, 62, 80));
		add(scrollpane1);

		check1 = new JCheckBox("Yo  Acepto");
		check1.setForeground(Color.WHITE);
		check1.setBackground(new Color(44, 62, 80));
		check1.addChangeListener(e -> aceptarTerminos());
		check1.setBounds(85, 184, 100, 30);
		add(check1);

		boton1 = new JButton("Continuar");
		boton1.addActionListener(e -> Continuar());
		boton1.setBounds(39, 221, 200, 30);
		boton1.setEnabled(false);
		add(boton1);

		boton2 = new JButton("Regresar");
		boton2.addActionListener(e -> Regresar());
		boton2.setBounds(39, 279, 200, 30);
		boton2.setEnabled(true);
		add(boton2);

	}

	public void Continuar() {

		Inicio_Jpanel.ventanaLicencia.dispose();

		ventanaMenu = new Menu_Jframe();

	}

	public void Regresar() {

		Inicio_Jpanel.ventanaLicencia.dispose();

		Inicio_Jframe.ventanaInicial = new Inicio_Jframe();

	}

	public void aceptarTerminos() {

		if (check1.isSelected() == true) {

			boton1.setEnabled(true);
			boton2.setEnabled(false);
		} else {

			boton1.setEnabled(false);
			boton2.setEnabled(true);
		}
	}
}
