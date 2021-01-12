package com.educacionIT.digitalers.Interfaces;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public interface ConexionMariaDB {
	default Connection crearConexion() throws SQLException {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("src/database.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		final String URL = prop.getProperty("db.url");
		final String USER = prop.getProperty("db.user");
		final String PASS = prop.getProperty("db.pass");
		Connection conexAux = null;	
		conexAux = DriverManager.getConnection(URL, USER, PASS);
		return conexAux;
	}
}
