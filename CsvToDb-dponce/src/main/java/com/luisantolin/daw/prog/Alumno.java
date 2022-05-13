package com.luisantolin.daw.prog;

public class Alumno {
	private String modulo;
	private String id1;
	private int numlista;
	
	public Alumno(String modulo,  int numlista, String id1) {
		this.modulo = modulo;
		this.id1 = id1;
		this.numlista = numlista;
	}

	public String getModulo() {
		return modulo;
	}

	public int getNumlista() {
		return numlista;
	}

	public String getId1() {
		return id1;
	}

	@Override
	public String toString() {
		return "Alumno [modulo=" + modulo + ", id1=" + id1 + ", numlista=" + numlista + "]";
	}
	
	
}
