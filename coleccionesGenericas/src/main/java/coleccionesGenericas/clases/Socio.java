package coleccionesGenericas.clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import coleccionesGenericas.enumeraciones.TIPO_TEL;

public class Socio implements Comparable<Socio> {
	private String nombre;
	private long dni;
	private Date fechaNacimiento;
	private Date fechaInscripcion;
	private Domicilio domicilio;
	private Telefono telefono;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}

	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	/***
	 * Crea una lista de Socios con datos de prueba.
	 * 
	 * @return ArrayList de Socios
	 */
	public static List<Socio> getListaDeSocios(int cantidadSocios) {
		/*
		 * Para utilizar fechas de una forma simple, necesitamos crear un objeto
		 * de tipo SimpleDateFormat, para convertir un String a un Date.
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String fecIns = "01/01/2017";
		String fecNac = "11/01/1989";
		Date fechaNacimiento = null;
		Date fechaInscripcion = null;

		/*
		 * Debido a que la conversión de Stringa a Date puede fallar, es
		 * necesario encerrar las sentencias en un try-catch, para capturar la
		 * exception que se pueda producir, ya sea por un error en el formato o
		 * por un valor incorrecto
		 */
		try {
			fechaNacimiento = sdf.parse(fecNac);
			fechaInscripcion = sdf.parse(fecIns);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		List<Socio> socios = new ArrayList<Socio>();
		/*
		 * socioAux, será la referencia de tipo Socio que utilizaremos para
		 * crear las instancias en el for.
		 */
		Socio socioAux;
		// Objeto Docimilio para crear los socios.
		Domicilio domicilioAux = new Domicilio();
		domicilioAux.setCalle("Calle Falsa");
		domicilioAux.setAltura(123);
		// Objeto Telefono para crear los socios.
		Telefono telefonoAux = new Telefono();
		telefonoAux.setTipo(TIPO_TEL.CELULAR);
		telefonoAux.setCodigoArea(11);
		telefonoAux.setNumero(1155556666);

		/* Creo 20 Socios con datos de prueba */
		for (int i = 1; i < cantidadSocios; i++) {
			socioAux = new Socio();
			socioAux.setNombre("Socio Nro " + i);
			socioAux.setDni(40000000 + i);
			socioAux.setFechaInscripcion(fechaInscripcion);
			socioAux.setFechaNacimiento(fechaNacimiento);
			socioAux.setDomicilio(domicilioAux);
			socioAux.setTelefono(telefonoAux);

			// Agrego el objeto creado a la lista.
			socios.add(socioAux);
		}

		return socios;
	}

	/***
	 * Con este método vamos a poder comparar 2 objetos de tipo Socio para poder
	 * ordenarlos por DNI de forma Ascendente.
	 */
	@Override
	public int compareTo(Socio otroSocio) {
		int diff = (int) (this.dni - otroSocio.getDni());
		return diff;
	}

	/**
	 * Con este método estático, vamos a poder definir la forma de ordenar
	 * nuestros objetos, ya no solo por un valor númerico entero, como vimos con
	 * el método compareTo(). En este caso lo vamos a realizar por el String
	 * Nombre.
	 */
	public static Comparator<Socio> compararSociosPorNombre = new Comparator<Socio>() {
		public int compare(Socio socio, Socio otroSocio) {

			String nombreSocio = socio.getNombre();
			String nombreOtroSocio = otroSocio.getNombre();

			// Orden Ascendente
			return nombreSocio.compareTo(nombreOtroSocio);
		}
	};

}
