package com.educacionIT.digitalers.Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConexionMariaDB {
	String URL = "jdbc:mysql://localhost:3306/cursoDigitalers01";
	String USSER = "root";
	String PASS = "";
	
	default Connection crearConexion() throws SQLException {
		Connection conexAux = null;	
		conexAux = DriverManager.getConnection(URL, USSER, PASS);
		return conexAux;
	}
}
