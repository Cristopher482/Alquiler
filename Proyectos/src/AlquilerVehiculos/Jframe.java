package AlquilerVehiculos;

import javax.swing.JFrame;

public class Jframe extends JFrame {

	/*
	  Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe frame = new Jframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	public Jframe() {
		Jpanel lamina=new Jpanel();
		setTitle("Rent-A-Car");	
		//setIconImage(newImageIcon(getClass().getResource("Image/icon.png")).getImage());icono
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 418);
		setLocationRelativeTo(null);
		setResizable(false);
		add(lamina);
	}
}
