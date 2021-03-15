package hospital;

import java.util.ArrayList;

public class Hospital {

	private String nombre, direccion;
	private int numeroCamas;
	private ArrayList<Empleado> empleados;
	private ArrayList<Paciente> pacientes;
	
	
	
	public Hospital(String nombre, String direccion, int numeroCamas, ArrayList<Empleado> empleados,
			ArrayList<Paciente> pacientes) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.numeroCamas = numeroCamas;
		this.empleados = empleados;
		this.pacientes = pacientes;
	}

	public void contarEmpleados(Empleado emp) {
		empleados.add(emp);
	}
	
	public void ingresarPaciente(Paciente paciente) {
		pacientes.add(paciente);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroCamas() {
		return numeroCamas;
	}

	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	
	
}
