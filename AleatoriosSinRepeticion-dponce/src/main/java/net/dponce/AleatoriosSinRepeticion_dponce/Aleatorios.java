package net.dponce.AleatoriosSinRepeticion_dponce;

import java.util.Arrays;
import java.util.Random;

public class Aleatorios {

	public int generarNumero(int maximo) {
		int numero;
		Random generador = new Random();
		numero = generador.nextInt(maximo + 1);
		return numero;
	}

	public void mostrarNumeros(int numeroDeNums, int maximo) {
		int[] numerosGenerados = new int[numeroDeNums];

		for (int i = 0; i < numeroDeNums; i++) {
			int generado = generarNumero(maximo);
			numerosGenerados[i] = generado;
			System.out.print(numerosGenerados[i] + " ");
		}
		
	}

}
