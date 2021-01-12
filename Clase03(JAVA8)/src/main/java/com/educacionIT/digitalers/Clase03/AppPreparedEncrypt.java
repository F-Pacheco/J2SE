package com.educacionIT.digitalers.Clase03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.educacionIT.digitalers.Entidades.Usuario;

public class AppPreparedEncrypt {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/cursoDigitalers01";
		final String PASS = "";
		final String USER = "root";
		final String KEY = "cursoDigitalers";
		
		Connection conexionSql = null;
		PreparedStatement pSt = null;
		
		try {
			conexionSql = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conectado...");
			System.out.println("===================");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//consulta
		String consulta = "select descripcion,aes_decrypt(clave,?) as clave from usuarios02 where descripcion = ?";
		String filtro = JOptionPane.showInputDialog("Indica usuario");
		try {
			pSt = conexionSql.prepareStatement(consulta);
			pSt.setString(1, KEY);
			pSt.setString(2, filtro);
			
			//ejecutar
			ResultSet rs = pSt.executeQuery();
			if (rs.next()) {
				Usuario userAux = new Usuario(null, 
						rs.getString("descripcion"), 
						rs.getString("clave"));
				System.out.println(userAux);
				System.out.println("-------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			pSt = conexionSql.prepareStatement("insert into usuarios02 (descripcion,clave) values (?, aes_encrypt(?,?))");
			pSt.setString(1, "user256");
			pSt.setString(2, "56475");
			pSt.setString(3, KEY);
			
		
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
