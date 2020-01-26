package AlquilerVehiculos;

public class Clientes {

	private String Nombre;
	private String Direccion;
	private long Telefono;

	// --constructors
	public Clientes() {

	}

	public Clientes(String Nombre) {

		this.Nombre = Nombre;
	}

	// --SETTERS

	public void setTelefono(long telefono) {
		this.Telefono = telefono;
	}

	public void setDireccion(String direccion) {
		this.Direccion = direccion;
	}

	public void setNombre(String Nombre) {

		this.Nombre = Nombre;
	}

	// --GETTERS

	public String getNombre() {

		return Nombre;
	}

	public long getTelefono() {
		return Telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public String toString() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.Nombre);
		stringBuilder.append(" su email es: ");
		stringBuilder.append(this.Direccion);
		stringBuilder.append(" y su numero de telefono es ");
		stringBuilder.append(this.Telefono);
		return stringBuilder.toString();
	}

}
