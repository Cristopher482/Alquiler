package AlquilerVehiculos;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Jframe2 extends JFrame {

	private JPanel contentPane;

	public Jframe2(JButton boton_dispose) {
		Jpanel2 Lamina2=new Jpanel2();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		add(Lamina2);
		setVisible(true);
		boton_dispose.addActionListener(arg0 -> {
			// TODO Auto-generated method stub
			dispose();
		});
		//setIconImage(newImageIcon(getClass().getResource("Image/icon.png")).getImage());icono
	}

}
