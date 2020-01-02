package AlquilerVehiculos;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Inicio_Jframe extends JFrame {

	public static Inicio_Jframe ventanaInicial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaInicial = new Inicio_Jframe();
					ventanaInicial.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public Inicio_Jframe() {

		Inicio_Jpanel lamina = new Inicio_Jpanel();
		add(lamina);
		setIconImage(new ImageIcon(getClass().getResource("/image/portada.png")).getImage());
		setBounds(0, 0, 363, 441);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Inicio");
	}

}
