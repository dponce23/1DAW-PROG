package net.dponce;

import java.util.Arrays;

public class Hangar {
	private Aeronave[] hangar = new Aeronave[5];

	public Hangar() {
		Arrays.fill(hangar, null);
	}

	public void addAeronave(Aeronave a) {
		for (int i = 0; i < hangar.length; i++) {
			if (hangar[i] == null) {
				hangar[i] = a;
				return;
			}
		}
		System.out.println("El hangar esta lleno");
	}

	public void removeAeronave(int pos) {

		for (int i = 0; i < hangar.length; i++) {
			if(i == pos) {
				hangar[i]=null;
			}
			
		}
		System.out.println("No se encuentra la aeronave");

	}

	public Aeronave getAeronave(int pos) {
		if(pos > 5 || pos < 0) {
			System.out.println("No existe esa posicion");
			return null;
		}
		return hangar[pos];
	}
	
	public void listarAeronaves() {
		for(int i=0;i<hangar.length;i++) {
			if(hangar[i]==null) {
				System.out.println("Posicion ["+i+"]: vacía");
			}else {
				System.out.println("Posicion ["+i+"]: "+hangar[i].getIdentificador());
			}
		}
	}
	
	public double combustibleTotal() {
		double devolver=0;
		for(int i=0;i<hangar.length;i++) {
			if(hangar[i]!=null) {
				devolver+=hangar[i].getLitrosDeCombustible();
			}
		}
		return devolver;
	}

}
