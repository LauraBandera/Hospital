package hospital;

public enum GrupoAdministrativo {

	A("Jefe Administrativo", "Planta 1", "A", 109),
	B("Secretario información", "Planta 1", "B", 107);
	
	
	private final String nombre, tipo, plantaEdificio;
	private int pasillo;

	private GrupoAdministrativo(String nombre, String tipo, String plantaEdificio, int pasillo) {
		this.tipo = tipo;
		this.plantaEdificio = plantaEdificio;
		this.pasillo = pasillo;
		this.nombre = nombre;
	}
	
	
}
