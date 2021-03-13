package hospital;

public abstract class Empleado extends Persona{

	private String numeroSeguridadSocial;
	private double salario;
	
	public Empleado(String numeroSeguridadSocial, double salario, String nombre, String apellido, NIF nif) {
		super(nombre, apellido, nif);
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.salario = salario;
	}

	public String getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract double calcularIRPF();
}
