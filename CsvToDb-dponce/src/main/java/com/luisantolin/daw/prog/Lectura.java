package com.luisantolin.daw.prog;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Lectura {

	public void leerFichero(File f) {
		ArrayList<String> alumnos=new ArrayList<String>() ;
		try {
			Scanner inputFile=new Scanner(f);
			while(inputFile.hasNext()) {
				String linea = inputFile.nextLine();
				alumnos.add(linea);
			}
			Escritura escribir= new Escritura();
			escribir.escribirDatos(alumnos);
			inputFile.close();
			
		}catch(Exception e) {
			System.err.println("ERROR: no se puede abrir el fichero");
			
		}
	}
}
