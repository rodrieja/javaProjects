package elizalde.septimot.exceptions;

public class ImporteIncorrectoException extends Exception {
	private static final long serialVersionUID = 6507056203533390968L;

	private String mensaje;

	public ImporteIncorrectoException(String mensajeError) {
		this.mensaje = mensajeError;
	}
	
	public ImporteIncorrectoException() {
		this.mensaje = "El saldo ingresado es incorrecto.";
	}
	
	public String toString() {
		return mensaje;
	}
}
