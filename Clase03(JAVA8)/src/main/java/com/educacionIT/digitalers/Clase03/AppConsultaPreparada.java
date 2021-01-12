package com.educacionIT.digitalers.Clase03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.educacionIT.digitalers.Entidades.Usuario;

public class AppConsultaPreparada {

	public static void main(String[] args) {
		final String USER = "root";
    	final String PASS = "";
    	final String URL = "jdbc:mysql://localhost:3306/cursoDigitalers01";
        //Connecton permite conectar a la base de datos
    	Connection conexionSql = null;
    	//Statement permite manejar consultas a las bases de datos
        PreparedStatement pSt = null;
        
        
        //Conectar a la base de datos
        try {
			conexionSql = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conectado...");
			System.out.println("===================");
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        try {
        	String filtro = JOptionPane.showInputDialog("Indica usuario");
        	String buscar = "select id,descripcion,clave from usuarios where descripcion = ?";
			pSt = conexionSql.prepareStatement(buscar);
			pSt.setString(1,filtro);
			
			ResultSet rs = pSt.executeQuery();
			while (rs.next()) {
				Usuario userAux = new Usuario(rs.getInt("id"), 
											rs.getString("descripcion"), 
											rs.getString("clave"));
				
				System.out.println(userAux);
				System.out.println("-------------------");
			}			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
        
      //Actualizar base de datos
        String actualizar = "update usuarios set clave = ? where id = ?";
        try {
			pSt = conexionSql.prepareStatement(actualizar);
			pSt.setString(1, "99999");
			pSt.setInt(2, 3);
			pSt.executeQuery();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
        
        
      //Cerrar la conexión con la base de datos
        try {
			conexionSql.close();
			System.out.println("===================");
			System.out.println("Conexion finalizada");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
