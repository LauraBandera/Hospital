package hospital;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {

	private String nombre, apellido;
	private NIF nif;
	
	public Persona(String nombre, String apellido, NIF nif) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nif = nif;
	}

	//Fecha de validez +10años desde que la persona lo renueva
	public void renovarNIF(LocalDate fechaSolicitud) {
		this.nif.setFechaCaducidad(fechaSolicitud.plus(10, ChronoUnit.YEARS));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public NIF getNif() {
		return nif;
	}

	public void setNif(NIF nif) {
		this.nif = nif;
	}
	
	
}
