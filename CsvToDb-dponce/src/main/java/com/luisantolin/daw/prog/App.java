package com.luisantolin.daw.prog;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * CREACION DE LA BBDD, DEL USUARIO Y PERMISOS
 * 
 * create database testdb;
 * CREATE USER 'lantolin'@'%' IDENTIFIED BY 'changeme';
 * GRANT ALL PRIVILEGES ON testdb.* TO 'lantolin'@'%';
 */

public class App {
	public static void main( String[] args ) {
		File fichero=new File(args[0]);
		Lectura l =new Lectura();
		ArrayList<String[]> lista =l.leerFichero(fichero);
		ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
		for(int i =0;i<lista.size();i++) {
			String[] datos=lista.get(i);
			Alumno alumno=new Alumno(datos[0],Integer.parseInt(datos[1]),datos[2]);
			alumnos.add(alumno);
		}
	}
}
