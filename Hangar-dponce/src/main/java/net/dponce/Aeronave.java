package net.dponce;

public abstract class Aeronave {
	private String identificador;
	private double litrosDeCombustible;
	
	public Aeronave(String identificador) {
		this.identificador = identificador;
		this.litrosDeCombustible = 0;
	}

	public double getLitrosDeCombustible() {
		return litrosDeCombustible;
	}

	public void setLitrosDeCombustible(double litrosDeCombustible) {
		this.litrosDeCombustible = litrosDeCombustible;
	}

	public String getIdentificador() {
		return identificador;
	}	
}
