package hospital;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionHospital {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hospital hospital;
		
		String nombre;
		String direccion;
		int numeroCamas;
		ArrayList<Empleado> empleados = new ArrayList();
		ArrayList<Paciente> pacientes= new ArrayList();
		hospital = new Hospital("Virgen Victoria", "Calle Torres s/n", 100, empleados, pacientes);
		for(int i = 0; i < crearSanitario().size(); i++) {
			hospital.contarEmpleados(crearSanitario().get(i));
		}
		for(int i = 0; i < crearPersonalPAS().size(); i++) {
			hospital.contarEmpleados(crearPersonalPAS().get(i));
		}
		for(int i = 0; i < crearPaciente().size(); i++) {
			hospital.ingresarPaciente(crearPaciente().get(i));
		}
		
		((Medico) empleados.get(1)).tratar(pacientes.get(3), "Paracetamol");

		System.out.println("El empleado " + empleados.get(2).getNombre() + " tiene un IRPF de: " + ((Medico)empleados.get(2)).calcularIRPF());
		System.out.println("El empleado " + empleados.get(6).getNombre() + " tiene un IRPF de: " + ((Administrativo)empleados.get(6)).calcularIRPF());
		
		

	}

	public static ArrayList<Paciente> crearPaciente() {
		ArrayList<Paciente> pacientes = new ArrayList();
		pacientes.add(new Paciente("Pepe", "Ortega", new NIF(18747392, LocalDate.of(1999, 3, 8)), "34598230480"));
		pacientes.add(new Paciente("Juan", "Gómez", new NIF(85265928, LocalDate.of(1949, 10, 7)), "2398498375"));
		pacientes.add(new Paciente("Roberto", "López", new NIF(46738296, LocalDate.of(1968, 2, 9)), "2454664345"));
		pacientes.add(new Paciente("María", "Martínez", new NIF(27849393, LocalDate.of(1957, 6, 6)), "23454654632"));
		pacientes.add(new Paciente("Francisca", "Fernández", new NIF(67649387, LocalDate.of(2000, 7, 31)), "23467743234"));
		return pacientes;
	}

	public static ArrayList<Medico> crearSanitario() {
		ArrayList<Medico> medicos = new ArrayList();
		medicos.add(new Medico("34578393745969", 1909.67, "Cirujano", "Rodrigo", "González", new NIF(87834556, LocalDate.of(1979, 10, 19))));
		medicos.add(new Medico("93240584376393", 2933.67, "Medico de Familia", "Ana", "García", new NIF(87834556, LocalDate.of(1989, 11, 9))));
		medicos.add(new Medico("34957689384769", 3089.67, "Psicólogo", "Anotnio", "Gómez", new NIF(87834556, LocalDate.of(1959, 1, 8))));
		medicos.add(new Medico("34587963848674", 2933.67, "Medico de Familia", "Natalia", "López", new NIF(87834556, LocalDate.of(1949, 10, 27))));
		medicos.add(new Medico("45386730847693", 3089.67, "Psicólogo", "María", "Marcial", new NIF(87834556, LocalDate.of(1947, 4, 5))));
		return medicos;
	}

	public static ArrayList<Administrativo> crearPersonalPAS() {
		ArrayList<Administrativo> admins = new ArrayList();
		admins.add(new Administrativo("23985769724794", 1882.23, GrupoAdministrativo.A, "María", "Gómez", new NIF(37534985, LocalDate.of(1964, 1, 9))));
		admins.add(new Administrativo("98796453984", 1882.23, GrupoAdministrativo.A, "Amelia", "España", new NIF(68355275, LocalDate.of(1947, 5, 5))));
		admins.add(new Administrativo("23985769724794", 1882.23, GrupoAdministrativo.B, "Justicia", "Cartagena", new NIF(27699352, LocalDate.of(1942, 4, 9))));
		admins.add(new Administrativo("23985769724794", 1882.23, GrupoAdministrativo.B, "Natalia", "Rodríguez", new NIF(15284903, LocalDate.of(1968, 7, 3))));
		admins.add(new Administrativo("23985769724794", 1882.23, GrupoAdministrativo.A, "Anotnio", "Gómez", new NIF(80000356, LocalDate.of(1966, 3, 5))));
		return admins;
	}
}
