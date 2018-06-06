package elizalde.septimot.cuentas;

import elizalde.septimot.exceptions.SaldoInsuficienteException;
import elizalde.septimot.personas.Titular;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro(Titular titular, String nroCuenta) {
		super(titular, nroCuenta);
	}

	@Override
	public String ConsultarSaldo() {
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("Saldo de la cuenta: $" + this.saldoCuenta);
		mensaje.append(System.lineSeparator());

		return mensaje.toString();
	}

	@Override
	public double Retirar(double importe) throws SaldoInsuficienteException {
		if (saldoCuenta - importe < 0) {
			throw new SaldoInsuficienteException();
		}

		saldoCuenta = saldoCuenta - importe;

		return saldoCuenta;
	}

}
