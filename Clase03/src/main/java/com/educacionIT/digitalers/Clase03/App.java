package com.educacionIT.digitalers.Clase03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.educacionIT.digitalers.Entidades.Usuario;

public class App 
{
    public static void main( String[] args )
    {
    	final String USER = "root";
    	final String PASS = "";
    	final String URL = "jdbc:mysql://localhost:3306/cursoDigitalers01";
        //Connecton permite conectar a la base de datos
    	Connection conexionSql = null;
    	//Statement permite manejar consultas a las bases de datos
        Statement st = null;
        
        
        //Conectar a la base de datos
        try {
			conexionSql = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conectado...");
			System.out.println("===================");
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
      
        //Buscar en base de datos
        try {
			st = conexionSql.createStatement();
			String filtro = JOptionPane.showInputDialog("Indica usuario");
			//ResultSet es el objeto que almacena lo que devuelve la consulta
			String buscar = "Select id,descripcion,clave from usuarios where descripcion = '"+ filtro+"'";
			ResultSet rs = st.executeQuery(buscar);
			
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
        
  
        //Insertar en la base de datos
        try {
			st = conexionSql.createStatement();
			String insertar = "insert into usuarios(descripcion,clave) values ('user5','123987')";
			st.execute(insertar);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
        
        //Actualizar la base de datos
        
        try {
			st = conexionSql.createStatement();
			String actualizar = "Update usuarios set clave = 'cambiado' where id = 1";
			st.execute(actualizar);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
      
        
        //Eliminar de la base de datos
        
        try {
			st = conexionSql.createStatement();
			String eliminar = "delete from usuarios where clave = '123987'";
			st.execute(eliminar);
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
