package coleccionesGenericas.clases;

import coleccionesGenericas.enumeraciones.TIPO_TEL;

public class Telefono {
	private TIPO_TEL tipo;
	private int codigoArea;
	private long numero;

	public TIPO_TEL getTipo() {
		return tipo;
	}

	public void setTipo(TIPO_TEL tipo) {
		this.tipo = tipo;
	}

	public int getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(int codigoArea) {
		this.codigoArea = codigoArea;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}
}
