package com.luisantolin.daw.prog;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		Lectura leer= new Lectura();
		leer.leerFichero(fichero);
	}
}
