package net.dponce;

import java.io.File;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        try {
        	File fichero=new File(args[0]);
        	Scanner inputFile = new Scanner( fichero );
			while (inputFile.hasNext()) {
				int cont=0;
				char barra=(int) 92;
				String[] palabras = new String[2];
				String linea = inputFile.nextLine();
				palabras=linea.split("(?<!\\\\),");
				while(cont<palabras.length) {
					palabras[cont]=palabras[cont].replace(barra+",", ",");
					System.out.print("["+palabras[cont]+"]");
					cont++;
				}
				System.out.println("");
			}
			inputFile.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("NO SE HA PODIDO LEER EL FICHERO");
		}
    }
    
}
