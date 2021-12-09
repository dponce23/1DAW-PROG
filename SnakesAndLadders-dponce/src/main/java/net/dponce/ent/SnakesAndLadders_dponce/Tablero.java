package net.dponce.ent.SnakesAndLadders_dponce;

import java.util.Scanner;

public class Tablero {

	static int posX = 1;
	static int posY = 1;

	public static void dibujarTablero() {
		
		int[] tablero = new int[25];
		int casilla = 1;

		for (int i = 0; i < tablero.length; i++) {
			if (i % 5 == 0) {
				System.out.println("");
			}

			if (casilla == posX && casilla == posY) {
				System.out.print("XY  ");
				casilla++;
				continue;
			}

			if (casilla == posX) {
				System.out.print("XX  ");
				casilla++;
				continue;
			}

			if (casilla == posY) {
				System.out.print("YY  ");
				casilla++;
				continue;
			}
			isEscalera();
			isSerpiente();
			tablero[i] = casilla;
			System.out.printf("%02d  ", casilla);
			casilla++;

		}

		System.out.println("\n\nEscaleras:\t02->16 13->17 15->22");
		System.out.println("Serpientes:\t18->04 20->06 23->14");
		System.out.println("--------------------------------------------------------------------------");

	}

	public static int tirarDado(int turno) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Te toca jugador Y presiona 'enter' para tirar");
		teclado.nextLine();
		int numero = (int) (Math.random() * 6 + 1);
		System.out.println("has Sacado un " + numero);
		if (turno % 2 == 0) {
			if(posY+numero>26) {
				posY+=0;
				System.out.println("Te has pasado la meta le toca a jugador X");
			}else {
				posY += numero;
			}
			
		} else {
			if(posX+numero>26) {
				posX+=0;
				System.out.println("Te has pasado la meta le toca a jugador Y");
			}else {
				posX += numero;
			}
		}
		return numero;
	}

	public static void turno(int turno) {
		
		if (turno % 2 == 0) {
			System.out.println("Turno " + turno);
			
			if (posY <= 25) {
				System.out.println("Avanzas hasta la casilla " + posY);
			}

		}
		if (turno % 2 != 0) {
			System.out.println("Turno " + turno);
			if (posX <= 25) {
				System.out.println("Avanzas hasta la casilla " + posX);
			}
		}
	}

	public static boolean ganar() {
		boolean ganar = false;
		if (posX == 26 || posY == 26) {
			ganar = true;
		}
		return ganar;
	}

	public static void ganador() {
		if (posX == 26) {
			System.out.println("Enhorabuena jugador X has ganado la partida");
		} else {
			if (posY == 26) {
				System.out.println("Enhorabuena jugador Y has ganado la partida");
			}
		}
	}

	public static void isEscalera() {
		if (posX == 2) {
			System.out.println("Jugador X has caido en una escalera avanzas hasta la casilla 16");
			posX = 16;
		}
		if (posX == 13) {
			System.out.println("Jugador X has caido en una escalera avanzas hasta la casilla 17");
			posX = 17;
		}
		if (posX == 15) {
			System.out.println("Jugador X has caido en una escalera avanzas hasta la casilla 22");
			posX = 22;
		}
		if (posY == 2) {
			System.out.println("Jugador Y has caido en una escalera avanzas hasta la casilla 16");
			posY = 16;
		}
		if (posY == 13) {
			System.out.println("Jugador Y has caido en una escalera avanzas hasta la casilla 17");
			posY = 17;
		}
		if (posY == 15) {
			System.out.println("Jugador Y has caido en una escalera avanzas hasta la casilla 22");
			posY = 22;
		}
	}

	public static void isSerpiente() {
		if (posX == 18) {
			System.out.println("Jugador X has caido en una serpiente retrocedes hasta la casilla 04");
			posX = 4;
		}
		if (posX == 20) {
			System.out.println("Jugador X has caido en una serpiente retrocedes hasta la casilla 06");
			posX = 6;
		}
		if (posX == 23) {
			System.out.println("Jugador X has caido en una serpiente retrocedes hasta la casilla 14");
			posX = 14;
		}
		if (posY == 18) {
			System.out.println("Jugador Y has caido en una serpiente retrocedes hasta la casilla 04");
			posY = 4;
		}
		if (posY == 20) {
			System.out.println("Jugador Y has caido en una serpiente retrocedes hasta la casilla 06");
			posY = 6;
		}
		if (posY == 23) {
			System.out.println("Jugador Y has caido en una serpiente retrocedes hasta la casilla 14");
			posY = 14;
		}
	}
}
