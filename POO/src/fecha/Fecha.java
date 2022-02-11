package fecha;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		
	}

	// METODOS
	public boolean fechaCorrecta() {
		boolean correcta = true;

		if (anio < 0 || anio > 2022) {
			correcta = false;

		}
		if (mes > 12 || mes < 1) {
			correcta = false;

		}
		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31) {
			correcta = false;

		}
		if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
			correcta = false;

		}
		if (esBisiesto()) {
			if (mes == 2 && dia > 29) {
				correcta = false;

			}
		} else {
			if (mes == 2 && dia > 28) {
				correcta = false;

			}
		}

		return correcta;

	}

	private boolean esBisiesto() {
		boolean bisiesto = false;

		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			bisiesto = true;
		}

		return bisiesto;
	}

	public void diaSiguiente() {
		dia += 1;
		if (!fechaCorrecta()) {
			dia = 1;
			mes += 1;
			if (!fechaCorrecta()) {
				mes = 1;
				anio += 1;
			}
		}

	}

	public String toString() {
		String fecha = "";
		String dia = "";
		String mes = "";

		if (this.dia < 10) {
			dia = "0" + String.valueOf(this.dia);
		} else {
			dia = String.valueOf(this.dia);
		}
		if (this.mes < 10) {
			mes = "0" + String.valueOf(this.mes);
		} else {
			mes = String.valueOf(this.mes);
		}
		return fecha = dia + "-" + mes + "-" + anio;

	}

	// SETTERS Y GETTERS
	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getDia() {
		return this.dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getMes() {
		return this.mes;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getAnio() {
		return this.anio;
	}

}
