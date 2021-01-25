package com.curso.java.interfaces;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public interface conexionMariaDB {
	
	default Connection conectar() {
		Connection aux = null;
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("src"+File.separator+"database.properties"));
			final String URL = prop.getProperty("db.url");
			final String USER = prop.getProperty("db.user");
			final String PASS = prop.getProperty("db.pass");
			
			Class.forName("org.mariadb.jdbc.Driver");
			
			aux = DriverManager.getConnection(URL, USER, PASS);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		return aux;
	}
}
