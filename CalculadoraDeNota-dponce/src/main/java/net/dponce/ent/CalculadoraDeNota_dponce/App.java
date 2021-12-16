package net.dponce.ent.CalculadoraDeNota_dponce;

import java.lang.reflect.Array;

/**
 * Hello world!
 *
 */
public class App {
	private static boolean esNumero(String posibleNumero) {

		boolean correcto = false;
		try {
			double d = Double.parseDouble(posibleNumero);
		} catch (Exception e) {
			return correcto;
		}

		return !correcto;

	}

	public static void main(String[] args) {

		if (Array.getLength(args) == 6) {
			boolean okexamen1 = esNumero(args[0]);
			boolean okexamen2 = esNumero(args[1]);
			boolean okpractica1 = esNumero(args[2]);
			boolean okpractica2 = esNumero(args[3]);
			boolean okasistencia = esNumero(args[4]);
			boolean okactitud = esNumero(args[5]);
			
			if(!okexamen1) {
				System.out.println("Has introducido algun caracter no valido: "+args[0]);
				return;
			}
			if(!okexamen2) {
				System.out.println("Has introducido algun caracter no valido: "+args[1]);
				return;
			}
			if(!okpractica1) {
				System.out.println("Has introducido algun caracter no valido: "+args[2]);
				return;
			}
			if(!okpractica2) {
				System.out.println("Has introducido algun caracter no valido: "+args[3]);
				return;
			}
			if(!okasistencia) {
				System.out.println("Has introducido algun caracter no valido: "+args[4]);
				return;
			}
			if(!okactitud) {
				System.out.println("Has introducido algun caracter no valido: "+args[5]);
				return;
			}
			
			double examen1 = Double.parseDouble(args[0]);
			double examen2 = Double.parseDouble(args[1]);
			double practica1 = Double.parseDouble(args[2]);
			double practica2 = Double.parseDouble(args[3]);
			double asistencia = Double.parseDouble(args[4]);
			double actitud = Double.parseDouble(args[5]);
			double media=CalculadoraDeNota.sacarMedia(examen1, examen2, practica1, practica2, asistencia, actitud);
			
			if(media==10) {
				System.out.println("ENHORABUENA HAS OBTENIDO MENCIÓN DE HONOR");
			}else {
				if(media!=0) {
					System.out.println("La nota Final es: \n" + Math.round(CalculadoraDeNota.sacarMedia(examen1, examen2, practica1, practica2, asistencia, actitud) * 100.0) / 100.0);
				}
			}
		} else {
			if (Array.getLength(args) < 6) {
				System.out.println("Hay pocas notas");
			} else {
				System.out.println("Hay demasiadas notas");
			}

		}
	}
}
