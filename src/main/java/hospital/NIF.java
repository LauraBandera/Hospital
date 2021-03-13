package hospital;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NIF {
	
	private long numero;
	private char letra;
	private LocalDate fechaCaducidad;
	
	public NIF(long numero, LocalDate fechaCaducidad) {
		this.numero = numero;
		this.fechaCaducidad = fechaCaducidad;
		letra = this.calcularLetra();
	}
	
	private char calcularLetra() {
		int r = 0;
		final int CONTADOR = 23;
		
		r = (int) this.numero;
		r %= CONTADOR;
		
		char l ='o';
		switch(r) {
			case 0:
				l = 'T';
				break;
			case 1:
				l = 'R';
				break;
			case 2:
				l = 'W';
				break;
			case 3:
				l = 'A';
				break;
			case 4:
				l = 'G';
				break;
			case 5:
				l = 'M';
				break;
			case 6:
				l = 'Y';
				break;
			case 7:
				l = 'F';
				break;
			case 8:
				l = 'P';
				break;
			case 9:
				l = 'D';
				break;
			case 10:
				l = 'X';
				break;
			case 11:
				l = 'B';
				break;
			case 12:
				l = 'N';
				break;
			case 13:
				l = 'J';
				break;
			case 14:
				l = 'Z';
				break;
			case 15:
				l = 'S';
				break;
			case 16:
				l = 'Q';
				break;
			case 17:
				l = 'V';
				break;
			case 18:
				l = 'H';
				break;
			case 19:
				l = 'L';
				break;
			case 20:
				l = 'C';
				break;
			case 21:
				l = 'K';
				break;
			case 22:
				l = 'E';
				break;
				
		}
		
		return l;
	}
	
	public static long leer(){
		long dni = 0;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Introduce DNI");
			try {
				dni = s.nextLong();
			}catch (InputMismatchException ime) {
				s.next();
			}
		}while(dni != 0);
		
		return dni;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	@Override
	public String toString() {
		return numero + "-" + letra;
	}
	
	public static void mostrar() {
		
	}
}
