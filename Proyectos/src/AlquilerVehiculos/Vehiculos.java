package AlquilerVehiculos;

import javax.swing.JOptionPane;

public class Vehiculos {

	private static String Vehiculo;

	private static Double Resultado;

	private static Double Dias;

	/*public Vehiculos(String Vehiculo, Double Dias) {
		
		Vehiculos.Vehiculo=Vehiculo;
		Vehiculos.Dias=Dias;
	}*/
	
	public void SetVehiculo(String Vehiculo) {

		Vehiculos.Vehiculo = Vehiculo;
	}

	public String getVehiculo() {
		return Vehiculo;
	}

	public void SetDias(double Dias) {

		Vehiculos.Dias = Dias;
	}

	public Double getDias() {
		return Dias;
	}

	public  void SetCalculo() {

		switch (Vehiculo) {

		case "Honda":

			if (Dias < 6) {

				Resultado = 25 * Dias;
			} else {

				Resultado = (25 * Dias) - (25 * Dias) * 0.03;
			}
			break;

		case "Nissan":

			if (Dias < 6) {

				Resultado = 28 * Dias;
			} else {

				Resultado = (28 * Dias) - (28 * Dias) * 0.04;
			}

			break;

		case "Toyota":

			if (Dias < 6) {

				Resultado = 30 * Dias;
			} else {

				Resultado = (30 * Dias) - (30 * Dias) * 0.05;
			}

			break;

		case "Bmw":

			if (Dias < 6) {

				Resultado = 60 * Dias;
			} else {

				Resultado = (60 * Dias) - (60 * Dias) * 0.06;
			}

			break;

		default:

			JOptionPane.showMessageDialog(null, "La opcion no es correcta");

		}

	}

	public String toString() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(" Los dias de alquiler fueron ");
		stringBuilder.append(Math.round(Dias));
		stringBuilder.append(" y el costo total por alquiler de la marca ");
		stringBuilder.append(Vehiculo);
		stringBuilder.append(" fue de ");
		stringBuilder.append(Math.round(Resultado));
		return stringBuilder.toString();
	}

}
