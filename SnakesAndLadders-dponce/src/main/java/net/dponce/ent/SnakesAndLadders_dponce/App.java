package net.dponce.ent.SnakesAndLadders_dponce;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int turno=1;
		
		
		System.out.println("bienvenido al Juego de Escaleras y Serpientes");
		System.out.println("Jugadores:X e Y");
		if(args.length!=0) {
			String [] separados= args[0].split(",");
			int [] tiradas=new int [separados.length];
			for(int i=0;i<separados.length;i++) {
				tiradas[i]=Integer.parseInt(separados[i]);
				
			}
			Tablero.dibujarTablero();
			Tablero.tirarAuto(turno, tiradas);
		}else {
			while(Tablero.ganar()==false) {
				Tablero.dibujarTablero();
				Tablero.tirarDado(turno);
				turno++;
			}
		}
		
		
		
		
		

	}

}
