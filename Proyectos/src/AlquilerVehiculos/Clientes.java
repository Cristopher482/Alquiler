package AlquilerVehiculos;

public class Clientes {

	private static String Nombre;
	
	private static String Direccion;
	
	private static long Telefono;
	
	//*buscar informacion si es igual constructor vacio y no tener constructor
	/*public Clientes(String Nombre){
		
		Clientes.Nombre=Nombre;
	}*/
	public String getNombre() {

		return Nombre;
	}

	public  void setNombre(String Nombre) {

		Clientes.Nombre = Nombre;
	}

	public  long getTelefono() {
		return Telefono;
	}

	public  void setTelefono(long telefono) {
		Clientes.Telefono = telefono;
	}

	public  String getDireccion() {
		return Direccion;
	}

	public  void setDireccion(String direccion) {
		Clientes.Direccion = direccion;
	}
	
	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(Nombre);
		stringBuilder.append(" su email es: ");
		stringBuilder.append(Direccion);
		stringBuilder.append(" y su numero de telefono es ");
		stringBuilder.append(Telefono);
		return stringBuilder.toString();
	}

}
