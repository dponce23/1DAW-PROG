package coop.gsd.daw.prog;

import java.util.Arrays;

public class UtilidadesArrays {
	
	/**
	 * Recibe un array de enteros y devuelve un entero indicando la posicion del numero mas pequeño del array
	 * @param a array de enteros
	 * @return indice posicion del numero menor en el array
	 */
	public static int minimoIndice(int [] a) {
		int menor=Integer.MAX_VALUE;
		int indice=0;
		for(int i=0; i<a.length;i++) {
			if(a[i]<menor) {
				menor=a[i];
				indice=i;
			}
		}
		return indice;
	}
	
	/**
	 * Recibe un array de enteros y devuelve el numero entero mas pequeño del array
	 * @param a array de enteros
	 * @return menor el numero entero mas pequeño del array
	 */
	public static int minimo(int [] a) {
		int menor=a[0];
		for(int i=1; i<a.length;i++) {
			if(a[i]<menor) {
				menor=a[i];
			}
		}
		return menor;
	}
	
	/**
	 * Recibe un array de enteros y devuelve la media de los numeros enteros del array
	 * @param a array de enteros
	 * @return media la media de los numeros enteros del array
	 */
	public static double media(int [] a) {
		double suma=0;
		double media=0;
		for(int i=0; i<a.length;i++) {
			suma+=a[i];
		}
		media=suma/(a.length);
		return media;
	}
	
	/**
	 * Recibe un array de enteros y devuelve un entero indicando la posicion del numero mas grande del array
	 * @param a array de enteros
	 * @return indice la posicion del numero entero mas grande del array
	 */
	public static int maximoIndice(int [] a) {
		int mayor=Integer.MIN_VALUE;
		int indice=0;
		for(int i=0; i<a.length;i++) {
			if(a[i]>mayor) {
				mayor=a[i];
				indice=i;
			}
		}
		return indice;
	}
	
	/**
	 * Recibe un array de enteros y devuelve el numero entero mas grande del array
	 * @param a array de enteros
	 * @return mayor el numero entero mas grande del array
	 */
	public static int maximo(int [] a) {
		int mayor=a[0];
		for(int i=1; i<a.length;i++) {
			if(a[i]>mayor) {
				mayor=a[i];
			}
		}
		return mayor;
	}
	
	/**
	 * Recibe un array de enteros y modifica el array y lo devuelve al reves
	 * @param a array de enteros
	 */
	public static void invertirArray(int [] a) {
		int aux=0;
		for(int i=0; i<a.length/2; i++) {
			aux=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=aux;
		}
	}
	
	/**
	 * Recibe un array de enteros y devuelve un array nuevo con los numeros al reves
	 * @param a array de enteros
	 */
	public static int [] invertir(int [] a) {
		int [] num;
		num = new int [a.length];
		int j=a.length-1;
		for(int i=0;i<a.length; i++) {
			num[i]=a[j];
			j--;
		}
		return num;
	}
	
	/**
	 * Recibe un array y un numero entero, y modifica el array y lo imprime pero sumando el valor del entero a cada numero del array
	 * @param a array de enteros
	 * @param num numero que sumamos a cada entero del array
	 */
	public static void incrementarArray(int [] a, int numero) {
		
		for(int i=0; i<a.length;i++) {
			a[i]+=numero;
		}
	}
	
	/**
	 * Recibe un array y un numero entero, y devuelve un nuevo array pero sumando el valor del entero a cada numero del array
	 * @param a array de enteros
	 * @param num numero que sumamos a cada entero del array
	 * @return incrementados el array de los numeros sumados
	 */
	public static int [] incrementar(int [] a, int num) {
		int [] incrementados;
		incrementados=new int [a.length];
		int j=0;
		for(int i=0; i<a.length;i++) {
			incrementados[j]=a[i]+num;
			j++;
		}
		return incrementados;
	}

}
