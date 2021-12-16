package net.dponce.ent.CalculadoraDeNota_dponce;

public class CalculadoraDeNota {


	

	public static double sacarMedia(double examen1, double examen2, double practica1, double practica2, double asistencia, double actitud) {
		double notaFinal;
		double teoria = (examen1 + examen2 + practica1 + practica2) / 4;

			if (examen1 < 0 || examen1 > 10 || examen2 < 0 || examen2 > 10 || practica1 < 0 || practica1 > 10
					|| practica2 < 0 || practica2 > 10 || asistencia < 0 || asistencia > 1 || actitud < 0
					|| actitud > 1) {
				System.out.println("Algun dato introducido es incorrecto");
				notaFinal = 0;
			} else {
				if (teoria < 4) {
					notaFinal = teoria;
				} else {
					notaFinal = (teoria * 0.8) + (actitud) + (asistencia);
					System.out.println("Tus notas son: \nEn los examenes\n" + examen1 + "\n" + examen2
							+ "\nEn las practicas\n" + practica1 + "\n" + practica2 + "\nAsistencia y actitud\n"
							+ asistencia + "\n" + actitud);
				}
				if (examen1 < 3 || examen2 < 3) {
					notaFinal = 0;
				}
				if (practica1 < 5 || practica2 < 5) {
					notaFinal = 0;
				}
			}
		return notaFinal;

	}

}
