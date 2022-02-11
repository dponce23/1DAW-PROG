package fecha;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Fecha fecha1 = new Fecha(31, 12, 1991);
			if (fecha1.fechaCorrecta()) {
				System.out.println(fecha1.toString());

				for (int i = 1; i < 150; i++) {
					fecha1.diaSiguiente();
					System.out.println(fecha1.toString());
					System.out.println("-------------------------------------------------------------------------");
				}
			}
		} catch (IllegalArgumentException execpcion) {
			System.err.println("La Fecha introducida es incorrecta");
		}

	}

}
