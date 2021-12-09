package net.dponce.ent.SnakesAndLadders_dponce;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int turno=1;
		String [] separados= args[0].split(",");
		int [] tiradas=new int [separados.length];
		for(int i=0;i<separados.length;i++) {
			tiradas[i]=Integer.parseInt(separados[i]);
		}
		
		System.out.println("bienvenido al Juego de Escaleras y Serpientes");
		System.out.println("Jugadores:X e Y");
		while(Tablero.ganar()==false) {
			Tablero.dibujarTablero();
			Tablero.turno(turno);
			turno++;
		}
		Tablero.ganador();
		

	}

}
