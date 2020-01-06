package AlquilerVehiculos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Terminos_Jframe extends JFrame {

	
	public Terminos_Jframe() {
		Terminos_Jpanel lamina=new Terminos_Jpanel();
		getContentPane().add(lamina);
		setIconImage(new ImageIcon(getClass().getResource("/image/portada.png")).getImage());
		setTitle("Licencia de uso");
		setResizable(false);
		setBounds(0, 0, 272, 355);
		setLocationRelativeTo(null);//
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
