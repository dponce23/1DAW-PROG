package net.dponce.ent.UtilidadesArrays_dponce;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coop.gsd.daw.prog.UtilidadesArrays;

/**
 * Unit test for simple App.
 */
public class AppTest {
	UtilidadesArrays utilidades = new UtilidadesArrays();
	private int[] arrayA = { 1, 2, 3, 4, 5 };
	private int[] arrayB = { -1, -2, -3, -4, -5 };

	@Test
	@DisplayName("Test que devuelve el menor indice con array de positivos")
	public void menorIndice() {
		int indice = utilidades.minimoIndice(arrayA);
		assertEquals(0, indice);
	}

	@Test
	@DisplayName("Test que devuelve el menor indice con array de negativos")
	public void menorIndice2() {
		int indice = utilidades.minimoIndice(arrayB);
		assertEquals(4, indice);
	}

	@Test
	@DisplayName("Test que devuelve el menor numero del array de positivos")
	public void menorNumero() {
		int num = utilidades.minimo(arrayA);
		assertEquals(1, num);
	}

	@Test
	@DisplayName("Test que devuelve el menor numero del array de negativos")
	public void menorNumero2() {
		int num = utilidades.minimo(arrayB);
		assertEquals(-5, num);
	}

	@Test
	@DisplayName("Test que devuelve la media del array de positivos")
	public void sacarMedia() {
		double media = utilidades.media(arrayA);
		assertEquals(3.0, media, 0.001);
	}

	@Test
	@DisplayName("Test que devuelve la media del array de negativos")
	public void sacarMedia2() {
		double media = utilidades.media(arrayB);
		assertEquals(-3.0, media, 0.001);
	}

	@Test
	@DisplayName("Test que devuelve el maximo indice del array de positivos")
	public void maximoIndice() {
		int indice = utilidades.maximoIndice(arrayA);
		assertEquals(4, indice);
	}

	@Test
	@DisplayName("Test que devuelve el maximo indice del array de negativos")
	public void maximoIndice2() {
		int indice = utilidades.maximoIndice(arrayB);
		assertEquals(0, indice);
	}

	@Test
	@DisplayName("Test que devuelve el maximo numero del array de positivos")
	public void maximoNumero() {
		int num = utilidades.maximo(arrayA);
		assertEquals(5, num);
	}

	@Test
	@DisplayName("Test que devuelve el maximo numero del array de negativos")
	public void maximoNumero2() {
		int num = utilidades.maximo(arrayB);
		assertEquals(-1, num);
	}
	
	/*TESTS DE LA FUNCION INVERTIR_ARRAY
	 * 
	 */

	@Test
	@DisplayName("Test que modifica el array de positivos y lo invierte")
	public void invertirArray() {
		int[] invertido = { 5, 4, 3, 2, 1 };
		utilidades.invertirArray(arrayA);
		assertEquals(Arrays.toString(invertido), Arrays.toString(arrayA));
	}

	@Test
	@DisplayName("Test que modifica el array de negativos y lo invierte")
	public void invertirArray2() {
		int[] invertido = { -5, -4, -3, -2, -1 };
		utilidades.invertirArray(arrayB);
		assertEquals(Arrays.toString(invertido), Arrays.toString(arrayB));
	}
	
	/*TESTS DE LA FUNCION INVERTIR
	 * 
	 */

	@Test
	@DisplayName("Test que comrpueba que no se modifica el array de positivos en INVERTIR")
	public void invertir() {
		int[] original = Arrays.copyOf(arrayA, arrayA.length);
		utilidades.invertir(arrayA);
		assertEquals(Arrays.toString(original), Arrays.toString(arrayA));
	}

	@Test
	@DisplayName("Test que devuelve un nuevo array con los numeros positivos invertidos")
	public void invertir2() {
		int[] correcto = { 5, 4, 3, 2, 1 };
		int[] invertido = utilidades.invertir(arrayA);
		assertEquals(Arrays.toString(correcto), Arrays.toString(invertido));
	}

	@Test
	@DisplayName("Test que comrpueba que no se modifica el array de negativos en INVERTIR")
	public void invertir3() {
		int[] original = Arrays.copyOf(arrayB, arrayB.length);
		utilidades.invertir(arrayB);
		assertEquals(Arrays.toString(original), Arrays.toString(arrayB));
	}

	@Test
	@DisplayName("Test que devuelve un nuevo array con los numeros negativos invertidos")
	public void invertir4() {
		int[] correcto = { -5, -4, -3, -2, -1 };
		int[] invertido = utilidades.invertir(arrayB);
		assertEquals(Arrays.toString(correcto), Arrays.toString(invertido));
	}

	/*TESTS DE LA FUNCION INCREMENTAR_ARRAY
	 * 
	 */
	
	@Test
	@DisplayName("Test que modifica el array de positivos y les suma el entero a cada numero del array")
	public void incrementarArray() {
		int[] correcto = { 3, 4, 5, 6, 7 };
		utilidades.incrementarArray(arrayA, 2);
		assertEquals(Arrays.toString(correcto), Arrays.toString(arrayA));
	}
	
	@Test
	@DisplayName("Test que modifica el array de negativos y les suma el entero a cada numero del array")
	public void incrementarArray2() {
		int[] correcto = { 1, 0, -1, -2, -3 };
		utilidades.incrementarArray(arrayB, 2);
		assertEquals(Arrays.toString(correcto), Arrays.toString(arrayB));
	}
	
	/*TESTS DE LA FUNCION INCREMENTAR
	 * 
	 */
	
	@Test
	@DisplayName("Test que comrpueba que no se modifica el array de positivos en INCREMENTAR")
	public void incrementar() {
		int[] original = Arrays.copyOf(arrayA, arrayA.length);
		utilidades.incrementar(arrayA, 2);
		assertEquals(Arrays.toString(original), Arrays.toString(arrayA));
	}

	@Test
	@DisplayName("Test que devuelve un nuevo array con los numeros positivos incrementados")
	public void incrementar2() {
		int[] correcto = {3,4,5,6,7};
		int[] incrementado = utilidades.incrementar(arrayA, 2);
		assertEquals(Arrays.toString(correcto), Arrays.toString(incrementado));
	}

	@Test
	@DisplayName("Test que comrpueba que no se modifica el array de negativos en INCREMENTAR")
	public void incrementar3() {
		int[] original = Arrays.copyOf(arrayB, arrayB.length);
		utilidades.incrementar(arrayB, 1);
		assertEquals(Arrays.toString(original), Arrays.toString(arrayB));
	}

	@Test
	@DisplayName("Test que devuelve un nuevo array con los numeros negativos incrementados")
	public void incrementar4() {
		int[] correcto = { 0, -1, -2, -3, -4 };
		int[] incrementado = utilidades.incrementar(arrayB, 1);
		assertEquals(Arrays.toString(correcto), Arrays.toString(incrementado));
	}

}
