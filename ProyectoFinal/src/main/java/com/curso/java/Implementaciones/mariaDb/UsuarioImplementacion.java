package com.curso.java.Implementaciones.mariaDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.curso.java.Entidades.Usuario;
import com.curso.java.interfaces.DAO;
import com.curso.java.interfaces.conexionMariaDB;

public class UsuarioImplementacion implements DAO<Usuario,String[]>,conexionMariaDB{

	private Connection conexion = null;
	private PreparedStatement psInsertar = null;
	private PreparedStatement psEliminar = null;
	private PreparedStatement psActualizar = null;
	private PreparedStatement psBuscar = null;
	private PreparedStatement psListar = null;
	
	private static final String queryInsertar = 
			"insert into usuarios(descripcion,clave,activo)"
			+ " values(?,AES_ENCRYPT(?,?),?); ";
	private static final String queryEliminar =
			"delete from usuarios where descripcion = ?";
	private static final String queryActualizar = 
			"update usuarios set clave = AES_ENCRYPT(?,?),activo = ? where descripcion = ?";
	private static final String queryBuscar =
			"select descripcion,AES_DECRYPT(clave,?) as clave,activo from usuarios where descripcion = ? and clave = AES_ENCRYPT(?, ?)";
	private static final String queryListar=
			"select descripcion,AES_DECRYPT(clave,?) as clave,activo from usuarios";
	private static final String KEY = "proyectoFinal01";
	
	//Constructors
	public UsuarioImplementacion() {
			this.conexion = conectar();
		}
	
	//Getters & setters
	//Getters & Setters
	public Connection getConexion() {
			return conexion;
		}

	public void setConexion(Connection conexion) {
			this.conexion = conexion;
		}
	
	//Methods
	@Override
	public void insertar(Usuario usuario) {
		try {
			if (null == psInsertar) {
				psInsertar = getConexion().prepareStatement(queryInsertar);
			}
			psInsertar.setString(1, usuario.getDescripcion());
			psInsertar.setString(2, usuario.getClave());
			psInsertar.setString(3, KEY);
			psInsertar.setBoolean(4, usuario.getActivo());
			
			psInsertar.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(Usuario usuario) {
		try {
			if (null == psActualizar) {
				psActualizar = getConexion().prepareStatement(queryActualizar);
			}
			psActualizar.setString(1, usuario.getClave());
			psActualizar.setString(2, KEY);
			psActualizar.setBoolean(3, usuario.getActivo());
			psActualizar.setString(4, usuario.getDescripcion());
			
			psActualizar.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void eliminar(Usuario usuario) {
		try {
			if(null == psEliminar) {
				psEliminar = getConexion().prepareStatement(queryEliminar);
			}
			psEliminar.setString(1, usuario.getDescripcion());
			psEliminar.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Usuario buscar(String[] credenciales) {
		Usuario usAux = null;
		try {
			if(credenciales.length != 2 || null == credenciales) {
				throw new Exception("Debe enviar descripcion y clave");
			}
			if(null == psBuscar) {
				psBuscar = getConexion().prepareStatement(queryBuscar);
			}
			psBuscar.setString(1, KEY);
			psBuscar.setString(2, credenciales[0]);
			psBuscar.setString(3, credenciales[1]);
			psBuscar.setString(4, KEY);
			
			ResultSet rs = psBuscar.executeQuery();
			if(rs.next()) {
				usAux = new Usuario();
				usAux.setDescripcion(rs.getString("descripcion"));
				usAux.setClave(rs.getString("clave"));
				usAux.setActivo(rs.getBoolean("activo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usAux;
	}

	@Override
	public List<Usuario> listar() {
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			if (null == psListar) {
				psListar = getConexion().prepareStatement(queryListar);
			}
			psListar.setString(1, KEY);
			ResultSet rs = psListar.executeQuery();
			while(rs.next()) {
				Usuario usAux = new Usuario();
				usAux.setDescripcion(rs.getString("descripcion"));
				usAux.setClave(rs.getString("clave"));
				usAux.setActivo(rs.getBoolean("activo"));
				
				lista.add(usAux);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public static void main(String[] args) {
		UsuarioImplementacion imp = new UsuarioImplementacion();
		try {
			Usuario user = new Usuario("meximi@gmail.com","Fede12345Cam",true);
			//imp.insertar(user);
			String[] credenciales = {user.getDescripcion(),user.getClave()};
			System.out.println(imp.buscar(credenciales));
			//imp.eliminar(user);
			//imp.actualizar(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
