package com.luisantolin.daw.prog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Escritura {

	public void escribirDatos(ArrayList<String> array) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://dponce.daw.practicas.net:3306/testdb?serverTimezone=UTC", "dponce", "Admin123.");
			Statement stmt = con.createStatement();
			
			for(int i = 0; i<array.size();i++) {
				String [] alumno;
				alumno=array.get(i).split(",");
				String modulo=alumno[0];
				String numlista=alumno[1];
				String id1=alumno[2];
				stmt.executeUpdate("INSERT INTO alumnos (num_lista,modulo,mac,ip,id1) values ("+numlista+",'"+modulo+"',null,null,'"+id1+"')");
			}
			System.out.println("AUMNOS INSERTADOS.");
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.err.println("MANAZAS: " + e.getMessage());
		}
		
	}
}

