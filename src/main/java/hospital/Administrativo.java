package hospital;

public class Administrativo extends Empleado{

	private GrupoAdministrativo grupo;
	public static final double IRPFA = 0.18;
	public static final double IRPFB = 0.16;
	
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
			return this.getSalario()*IRPFA;
		}else {
			return this.getSalario()*IRPFB;
		}
	}

	public GrupoAdministrativo getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoAdministrativo grupo) {
		this.grupo = grupo;
	}

}
