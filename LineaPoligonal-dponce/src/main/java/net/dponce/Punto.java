package net.dponce;

public class Punto implements Debugueable{
	private int x;
	private int y;
	
	public void Punto(int x,int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public void debug() {
		System.out.println("["+ x +","+ y +"]");
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
