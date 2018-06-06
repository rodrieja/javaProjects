package elizalde.septimot.cuentas;

import elizalde.septimot.exceptions.SaldoInsuficienteException;
import elizalde.septimot.personas.Titular;

public class CuentaCorriente extends Cuenta {
	private double descubierto;

	public CuentaCorriente(Titular titular, String nroCuenta) {
		super(titular, nroCuenta);

		this.descubierto = 0;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}

	@Override
	public String ConsultarSaldo() {
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("Saldo de la cuenta: $" + this.saldoCuenta);
		mensaje.append(System.lineSeparator());
		mensaje.append("Descubierto de cuenta: $" + this.descubierto);
		mensaje.append(System.lineSeparator());
		mensaje.append("Saldo disponible: $" + (this.saldoCuenta + this.descubierto));
		mensaje.append(System.lineSeparator());

		return mensaje.toString();
	}

	/***
	 * En las Cuentas Corrientes, el saldo disponible para la extracción tienen en
	 * cuenta descubierto, que es un monto adicional que se puede utilizar una vez
	 * que se llega a cero.
	 */
	@Override
	public double Retirar(double importe) throws SaldoInsuficienteException {
		if ((saldoCuenta + descubierto) - importe < 0) {
			throw new SaldoInsuficienteException();
		}

		saldoCuenta = saldoCuenta - importe;

		return saldoCuenta;
	}

}
