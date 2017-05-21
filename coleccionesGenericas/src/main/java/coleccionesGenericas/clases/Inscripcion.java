package coleccionesGenericas.clases;

import java.util.ArrayList;
import java.util.List;

import coleccionesGenericas.excepciones.CupoExcedidoException;

public class Inscripcion {
	private Curso clase;
	private List<Socio> socios;
	private int cupo;

	public Curso getClase() {
		return clase;
	}

	public void setClase(Curso clase) {
		this.clase = clase;
	}

	public List<Socio> getSocios() {
		return socios;
	}

	/***
	 * Relaciona un listado de socios a una clase, verificando si el cupo lo
	 * permite.
	 * 
	 * @param socios
	 * @throws CupoExcedidoException
	 */
	public void setSocios(List<Socio> socios) throws CupoExcedidoException {
		if (socios.size() > cupo)
			throw new CupoExcedidoException();

		this.socios = socios;
	}

	public int getCupo() {
		return cupo;
	}

	public void setCupo(int cupo) {
		this.cupo = cupo;
	}

	public Inscripcion(Curso clase, int cupo) {
		this.clase = clase;
		this.cupo = cupo;
		this.socios = new ArrayList<Socio>();
	}

	/***
	 * Agrega un {@link Socio} a la lista, verificando si el cupo lo permite.
	 * 
	 * @param socio
	 * @throws CupoExcedidoException
	 */
	public void addSocio(Socio socio) throws CupoExcedidoException {
		if (this.socios.size() < this.cupo)
			this.socios.add(socio);
		else
			throw new CupoExcedidoException();

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Información de la inscripción\n");
		sb.append("Clase: " + this.clase.getNombre() + "\n");
		sb.append("Profesor: " + this.clase.getProfesor().getNombre() + "\n");
		sb.append("Horario: " + this.clase.getDia().toString() + " - " + this.clase.getHorario().toString() + "\n");
		sb.append("Cupo: " + this.cupo + "\n");
		sb.append("Valor Cuota: " + this.clase.getCouta() + "\n");
		sb.append("Inscriptos: " + this.socios.size() + "\n");

		for (Socio socio : socios) {
			sb.append("\tDNI: "+socio.getDni() + " - Nombre: " + socio.getNombre() + "\n");
		}

		return sb.toString();
	}
}
