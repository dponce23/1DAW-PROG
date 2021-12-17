package net.dponce.AleatoriosSinRepeticion_dponce;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No has escrito argumentos");
		} else {
			if (args.length < 2) {
				System.out.println("Falta alguno, no has escrito 2 argumentos");
			} else {
				int numeroDeNums = Integer.parseInt(args[0]);
				int maximo = Integer.parseInt(args[1]);
				Aleatorio nuevo = new Aleatorio();
				nuevo.mostrarNumeros(numeroDeNums, maximo);
			}

		}
	}
}
