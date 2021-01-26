package com.curso.java.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface conexionMariaDB {
	
	default Connection conectar() {
		Connection aux = null;
		//Properties prop = new Properties();
		try {
			
			//prop.load(new FileInputStream("src"+File.separator+"database.properties"));
			
			final String URL = "jdbc:mysql://localhost:3306/proyectofinal01";//prop.getProperty("db.url");
			final String USER = "root";//prop.getProperty("db.user");
			final String PASS = "";//prop.getProperty("db.pass");
			
			Class.forName("org.mariadb.jdbc.Driver");
			
			aux = DriverManager.getConnection(URL, USER, PASS);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		return aux;
	}
	
	
}
