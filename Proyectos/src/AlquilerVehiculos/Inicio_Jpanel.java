package AlquilerVehiculos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Inicio_Jpanel extends JPanel {

	private JTextField txtContrasena;

	private String Contrasena;

	public static Terminos_Jframe ventanaLicencia;

	public Inicio_Jpanel() {

		setBackground(new Color(44, 62, 80));
		setLayout(null);

		JLabel lblSistemaDeRentar = new JLabel("Sistema de rentar autos");
		lblSistemaDeRentar.setForeground(Color.WHITE);
		lblSistemaDeRentar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblSistemaDeRentar.setBounds(69, 118, 238, 38);
		add(lblSistemaDeRentar);

		txtContrasena = new JTextField();
		txtContrasena.setBounds(69, 247, 211, 28);
		add(txtContrasena);
		txtContrasena.setColumns(10);

		JLabel lblIngreseContraena = new JLabel("Ingrese Contrasena");
		lblIngreseContraena.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIngreseContraena.setForeground(Color.WHITE);
		lblIngreseContraena.setBounds(69, 222, 170, 14);
		add(lblIngreseContraena);

		JButton btnContrasena = new JButton("Enter");
		btnContrasena.setBorder(null);
		btnContrasena.setBackground(new Color(44, 62, 80));
		btnContrasena.setIcon(new ImageIcon(Inicio_Jpanel.class.getResource("/image/enter.png")));
		btnContrasena.addActionListener(e -> {

			Contrasena = txtContrasena.getText().trim();

			if (Contrasena.equals("cris")) {

				Inicio_Jframe.ventanaInicial.dispose();

				ventanaLicencia = new Terminos_Jframe();

			} else {

				JOptionPane.showMessageDialog(null, "contrasena incorrecta");

			}
		});
		btnContrasena.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnContrasena.setBounds(151, 286, 49, 52);
		add(btnContrasena);

		ImageIcon Imagen = new ImageIcon("src/image/portada2.PNG");
		JLabel lblfoto = new JLabel();
		lblfoto.setBounds(139, 23, 95, 84);
		lblfoto.setIcon(Imagen);
		add(lblfoto);

	}
}
