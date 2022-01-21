package net.dponce.ent.CalculadoraDeNota_dponce;

public class CalculadoraDeNota {
	
	public double sacarMedia(double examen1, double examen2, double practica1, double practica2, double asistencia, double actitud) {
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
	public String nota2String(double media) {
		if(media==10) {
			return "ENHORABUENA HAS OBTENIDO MENCIÓN DE HONOR";
		}
		if(media==0) {
			return "";
		}
		return "La nota Final es: \n" + media;
		
	}
	
	public void imprimeNota(double examen1, double examen2, double practica1, double practica2, double asistencia, double actitud) {
		System.out.println(nota2String(sacarMedia(examen1, examen2, practica1, practica2, asistencia, actitud ) ) );
	}

}
