package hospital;

public class Medico extends Empleado{

	private String especialidad;
	
	public Medico(String numeroSeguridadSocial, double salario, String especialidad, String nombre, String apellido, NIF nif) {
		super(numeroSeguridadSocial, salario, nombre, apellido, nif);
		this.especialidad = especialidad;
	}

	public void tratar(Paciente paciente, String medicina) {
		System.out.println("El médico le ha madado la medicia " + medicina 
				+ " al paciente " + paciente.getNombre() + " " + paciente.getApellido());
		paciente.tomarMedicina(medicina);
	}
	
	@Override
	public double calcularIRPF() {
		// TODO Auto-generated method stub
		return this.getSalario()*0.21;
	}

}
