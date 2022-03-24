package net.dponce;

public class Helicoptero extends Aeronave{
	private int numHelices;
	private boolean autoPilot;

	public Helicoptero(String identificador, int numHelices, boolean autoPilot) {
		super(identificador);
		this.numHelices = numHelices;
		this.autoPilot = autoPilot;
	}

	public int getNumHelices() {
		return numHelices;
	}

	public boolean isAutoPilot() {
		return autoPilot;
	}
	
}
