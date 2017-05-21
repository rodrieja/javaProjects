package coleccionesGenericas.clases;

import coleccionesGenericas.enumeraciones.DIA;
import coleccionesGenericas.enumeraciones.HORARIO;

public class Curso {
	private String descripcion;
	private String nombre;
	private DIA dia;
	private HORARIO horario;
	private Profesor profesor;
	private int couta;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public DIA getDia() {
		return dia;
	}

	public void setDia(DIA dia) {
		this.dia = dia;
	}

	public HORARIO getHorario() {
		return horario;
	}

	public void setHorario(HORARIO horario) {
		this.horario = horario;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public int getCouta() {
		return couta;
	}

	public void setCouta(int couta) {
		this.couta = couta;
	}

	/*** 
	 * Este comentario es un JavaDoc, lo que indica que nos brindará ayuda cuando
	 * querramos consultar qué hace, recibe, devuelve o las excepciones que puede
	 * generar el método que estamos creando.
	 * 
	 * @return
	 * Devuelve un objeto Clase con valores por defecto.
	 */
	public static Curso getDefaultInstance() {
		Profesor profesor = new Profesor();
		profesor.setNombre("Alejandro");
		
		Curso clase = new Curso();
		clase.setNombre("Java");
		clase.setDescripcion("Clase de iniciación a la programación con Java");
		clase.setCouta(1500);
		clase.setDia(DIA.MIERCOLES);
		clase.setHorario(HORARIO.DE_10_A_12);
		clase.setProfesor(profesor);
		
		return clase;
	}

}
