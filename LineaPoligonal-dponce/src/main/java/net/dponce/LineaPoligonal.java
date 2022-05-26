package net.dponce;

import java.util.ArrayList;

public class LineaPoligonal implements Debugueable{
	private ArrayList<Punto> puntos;

	public LineaPoligonal() {
		this.puntos = new ArrayList<Punto>();
	}
	
	public void addPunto(Punto p) {
		puntos.add(p);
	}
	


	@Override
	public void debug() {
		for (int i =0; i < puntos.size();i++) {
			puntos.get(i).debug();
		}
	}
	
	
}
