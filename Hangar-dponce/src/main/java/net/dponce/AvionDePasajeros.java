package net.dponce;

public class AvionDePasajeros extends Aeronave{
	private String compania;
	private int numTurbinas;
	
	public AvionDePasajeros(String identificador,  int numTurbinas,String compania) {
		super(identificador);
		this.compania = compania;
		this.numTurbinas = numTurbinas;
	}

	public String getCompania() {
		return compania;
	}

	public int getNumTurbinas() {
		return numTurbinas;
	}	
}
