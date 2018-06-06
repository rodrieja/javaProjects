package elizalde.septimot.cuentas;

import elizalde.septimot.exceptions.ImporteIncorrectoException;
import elizalde.septimot.interfaces.ICuenta;
import elizalde.septimot.personas.Titular;

/***
 * Esta clase define la estructura básica que tendrán todas las clases
 * relacionadas a las cuentas. Como esta clase implementa la interfaz
 * {@link elizalde.septimot.interfaces.ICuenta}, todas las clases que hereden de
 * Cuenta, deberán definir el comportamiento de estos métodos.
 * 
 * @author Alejandro Rodriguez
 *
 */
public abstract class Cuenta implements ICuenta {
	protected double saldoCuenta;
	protected Titular titularCuenta;
	protected String cbu;
	protected String nroCuenta;
	protected long nroCuentaInterno;
	
	@Override
	public double Depositar(double importe) throws ImporteIncorrectoException {
		if (importe < 0) {
			throw new ImporteIncorrectoException();
		}

		this.saldoCuenta = this.saldoCuenta + importe;

		return this.saldoCuenta;
	}
	
	public Cuenta(Titular titular, String nroCuenta) {
		this.titularCuenta = titular;
		this.nroCuenta = nroCuenta;
	}
}
