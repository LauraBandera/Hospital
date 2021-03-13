package hospital;

public class Paciente extends Persona{

	private String numeroHistoria;
	
	public Paciente(String nombre, String apellido, NIF nif, String numeroHistoria) {
		super(nombre, apellido, nif);
		this.numeroHistoria = numeroHistoria;
	}

	public String getNumeroHistoria() {
		return numeroHistoria;
	}

	public void setNumeroHistoria(String numeroHistoria) {
		this.numeroHistoria = numeroHistoria;
	}

	public void tomarMedicina(String medicina) {
		System.out.println("El paciente " + this.getNombre() + " " + this.getApellido() + " se ha tomado la medicina " + medicina);
	}
	
}
