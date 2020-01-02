package AlquilerVehiculos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Inicio_Jpanel extends JPanel {

	private JTextField txtContrasena;

	private String Contrasena;

	public static Menu_Jframe ventanaMenu;

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
		btnContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Contrasena = txtContrasena.getText().trim();

				if (Contrasena.equals("")) {

					JOptionPane.showMessageDialog(null, "Debes ingresar tu contrasena");
				} else {

					Inicio_Jframe.ventanaInicial.dispose();

					ventanaMenu = new Menu_Jframe();

				}
			}
		});
		btnContrasena.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnContrasena.setBounds(124, 315, 89, 23);
		add(btnContrasena);

		ImageIcon Imagen = new ImageIcon("src/image/portada2.PNG");
		JLabel lblfoto = new JLabel();
		lblfoto.setBounds(139, 23, 95, 84);
		lblfoto.setIcon(Imagen);
		add(lblfoto);

	}
}
