package AlquilerVehiculos;

public class Vehiculos {

	private String Vehiculo;
	private Double Resultado;
	private Double Dias;

	// --Constructors

	public Vehiculos() {

	}

	public Vehiculos(String Vehiculo) {

		this.Vehiculo = Vehiculo;
	}

	public Vehiculos(String Vehiculo, Double Dias) {

		this.Vehiculo = Vehiculo;
		this.Dias = Dias;
	}

	// --SETTERS

	public void SetVehiculo(String Vehiculo) {

		this.Vehiculo = Vehiculo;
	}

	public void SetDias(double Dias) {

		this.Dias = Dias;
	}

	public void SetCalculo() {

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
		}

	}

	// --GETTERS

	public String getVehiculo() {
		return this.Vehiculo;
	}

	public Double getDias() {
		return this.Dias;
	}

	public String toString() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(" Los dias de alquiler fueron ");
		stringBuilder.append(Math.round(this.Dias));
		stringBuilder.append(" y el costo total por alquiler de la marca ");
		stringBuilder.append(this.Vehiculo);
		stringBuilder.append(" fue de ");
		stringBuilder.append(Math.round(this.Resultado));
		return stringBuilder.toString();
	}

}
