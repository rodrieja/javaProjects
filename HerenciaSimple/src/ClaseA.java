
public class ClaseA {
	protected String mensaje = "Creando el objeto de la clase: ";
	protected String nombreClase = "A";
	
	public ClaseA() {
		mostrarInfo();
	}
	
	protected void mostrarInfo() {
		System.out.println(mensaje + nombreClase);
	}

}
