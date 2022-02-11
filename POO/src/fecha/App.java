package fecha;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Fecha fecha1 = new Fecha(1, 12, 0);
			if (fecha1.fechaCorrecta()) {
				System.out.println(fecha1.toString());

				for (int i = 1; i < 2; i++) {
					fecha1.diaSiguiente();
					System.out.println(fecha1.toString());
					System.out.println("-------------------------------------------------------------------------");
				}
			}
		} catch (IllegalArgumentException execpcion) {
			System.err.println(execpcion.getMessage());
		}

	}

}
