package AlquilerVehiculos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Menu_Jframe extends JFrame {


	public Menu_Jframe() {
		Menu_Jpanel lamina=new Menu_Jpanel();
		add(lamina);
		setTitle("Rent-A-Car");	
		setIconImage(new ImageIcon(getClass().getResource("/image/portada.png")).getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 640, 535);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
}
