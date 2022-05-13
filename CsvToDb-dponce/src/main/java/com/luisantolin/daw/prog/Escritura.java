package com.luisantolin.daw.prog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Escritura {

	public void escribirDatos(ArrayList<Alumno> array) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://dponce.daw.practicas.net:3306/testdb?serverTimezone=UTC", "dponce", "Admin123.");
			Statement stmt = con.createStatement();
			
			for(int i = 0; i<array.size();i++) {
				stmt.executeUpdate("INSERT INTO alumnos (num_lista,modulo,mac,ip,id1) values ("+array.get(i).getNumlista()+",'"+array.get(i).getModulo()+"',null,null,'"+array.get(i).getId1()+"')");
			}
			System.out.println("ALUMNOS INSERTADOS.");
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.err.println("MANAZAS: " + e.getMessage());
		}
		
	}
}

