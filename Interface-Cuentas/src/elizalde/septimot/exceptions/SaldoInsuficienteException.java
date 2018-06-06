package elizalde.septimot.exceptions;

public class SaldoInsuficienteException extends Exception {
	private static final long serialVersionUID = 2824849966460330548L;
	private String mensaje;

	public SaldoInsuficienteException(String mensajeError) {
		this.mensaje = mensajeError;
	}
	
	public SaldoInsuficienteException() {
		this.mensaje = "No es posible realizar la operación. Saldos insuficientes.";
	}
	
	public String toString() {
		return mensaje;
	}
}
