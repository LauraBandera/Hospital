package hospital;

public class Administrativo extends Empleado{

	private GrupoAdministrativo grupo;
	
	public Administrativo(String numeroSeguridadSocial, double salario, GrupoAdministrativo grupo, String nombre, String apellido, NIF nif) {
		super(numeroSeguridadSocial, salario, nombre, apellido, nif);
		this.grupo = grupo;
	}

	public void registrarDocumento() {
		System.out.println("El administrativo " + this.getNombre() + " " + this.getApellido() + " ha registrado un documento");
	}
	
	@Override
	public double calcularIRPF() {
		// TODO Auto-generated method stub
		if(grupo.equals(GrupoAdministrativo.A)){
			return this.getSalario()*0.18;
		}else {
			return this.getSalario()*0.16;
		}
	}

}
