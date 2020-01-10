package Tarifas;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TarifaHonda extends JFrame {

	
	public TarifaHonda() {
		setIconImage(new ImageIcon(getClass().getResource("/image/portada.png")).getImage());
		setTitle("Tarifa");
		setResizable(false);
		setBounds(0, 0, 272, 355);
		setLocationRelativeTo(null);//
		setVisible(true);
	}

}
