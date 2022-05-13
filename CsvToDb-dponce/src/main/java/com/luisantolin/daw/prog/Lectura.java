package com.luisantolin.daw.prog;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Lectura {

	public ArrayList<String[]> leerFichero(File f) {
		try {
			ArrayList<String[]> alumnos= new ArrayList<String[]>();
			Scanner inputFile=new Scanner(f);
			while(inputFile.hasNext()) {
				String linea = inputFile.nextLine();
				String[] alumno=linea.split(",");
				alumnos.add(alumno);
			}
			inputFile.close();
			return alumnos;
			
		}catch(Exception e) {
			System.err.println("ERROR: no se puede abrir el fichero");
			return null;
		}

	}
}
