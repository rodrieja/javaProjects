package elizalde.septimot.interfaces;

import elizalde.septimot.exceptions.ImporteIncorrectoException;
import elizalde.septimot.exceptions.SaldoInsuficienteException;

/***
 * La interfaz define los métodos que deben tener todas las clases que la
 * implementen. Esto significa que cuando se sabe que una clase implementa
 * esta interfaz, si o si va a tener estos métodos, sin importar qué hagan,
 * solo se sabe que la clase sabe reconocer estos mensajes.
 * <p>
 * @author Alejandro Rodriguez
 *
 */
public interface ICuenta {
	public String ConsultarSaldo();

	public double Depositar(double importe) throws ImporteIncorrectoException;

	public double Retirar(double importe) throws SaldoInsuficienteException;
}
