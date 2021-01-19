package com.curso.java.Implementaciones.mariaDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.curso.java.Entidades.Documento;
import com.curso.java.Entidades.Profesor;
import com.curso.java.interfaces.DAO;
import com.curso.java.interfaces.conexionMariaDB;

public class ProfesorImplementacion implements DAO<Profesor,Documento>,conexionMariaDB{

	private Connection conexion = null;
	private PreparedStatement psInsertar = null;
	private PreparedStatement psEliminar = null;
	private PreparedStatement psActualizar = null;
	private PreparedStatement psBuscar = null;
	private PreparedStatement psListar = null;
	
	private static final String queryInsertar = 
			"insert into profesores(tipoDocumento,numeroDocumento,descripcion,fechaNacimiento,activo)"
			+ " values(?,?,?,?,?); ";
	private static final String queryEliminar =
			"delete from profesores where numeroDocumento = ? and tipoDocumento = ?";
	private static final String queryActualizar = 
			"update profesores set descripcion = ?, fechaNacimiento = ?,activo = ? where numeroDocumento = ? and tipoDocumento = ?";
	private static final String queryBuscar =
			"select tipoDocumento,numeroDocumento,descripcion,fechaNacimiento,activo,fechaCreacion from profesores where numeroDocumento = ? and tipoDocumento = ?";
	private static final String queryListar=
			"select tipoDocumento,numeroDocumento,descripcion,fechaNacimiento,activo,fechaCreacion from profesores";
	
	//Constructors
	public ProfesorImplementacion() {
		this.conexion = conectar();
	}
	
	//Getters & Setters
	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	//Methods
	@Override
	public void insertar(Profesor profesor) {
		try {
			if (null == psInsertar) {
				psInsertar = getConexion().prepareStatement(queryInsertar);
			}
			psInsertar.setString(1, profesor.getDocumento().getTipo());
			psInsertar.setString(2, profesor.getDocumento().getNumero());
			psInsertar.setString(3, profesor.getDescripcion());
			psInsertar.setDate(4,java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(profesor.getFechaNacimiento())));
			psInsertar.setBoolean(5, profesor.getActivo());
			
			psInsertar.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void actualizar(Profesor profesor) {
		try {
			if(null == psActualizar) {
				psActualizar = getConexion().prepareStatement(queryActualizar);
			}
			psActualizar.setString(1, profesor.getDescripcion());
			psActualizar.setDate(2, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(profesor.getFechaNacimiento())));
			psActualizar.setBoolean(3, profesor.getActivo());
			psActualizar.setString(4, profesor.getDocumento().getNumero());
			psActualizar.setString(5, profesor.getDocumento().getTipo());
			
			psActualizar.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(Profesor profesor) {
		try {
			if(null == psEliminar) {
				psEliminar = getConexion().prepareStatement(queryEliminar);
			}
			psEliminar.setString(1, profesor.getDocumento().getNumero());
			psEliminar.setString(2, profesor.getDocumento().getTipo());
			
			psEliminar.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Profesor buscar(Documento documento) {
		Profesor profAux = null;	
		try {
			if(null == psBuscar) {
				psBuscar = getConexion().prepareStatement(queryBuscar);
			}
			psBuscar.setString(1, documento.getNumero());
			psBuscar.setString(2, documento.getTipo());
			
			ResultSet rs = psBuscar.executeQuery();
			if(rs.next()) {
				profAux = new Profesor();
				profAux.setDocumento(documento);
				profAux.setDescripcion(rs.getString("descripcion"));
				profAux.setFechaNacimiento(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fechaNacimiento")));
				profAux.setActivo(rs.getBoolean("activo"));
				profAux.setFechaCreacion(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fechaCreacion")));
			}
		} catch (SQLException | ParseException e) {
			e.printStackTrace();
		}
		return profAux;
	}

	@Override
	public List<Profesor> listar() {
		List<Profesor> listaAux = new ArrayList<>();
		try {
			if (null == psListar) {
				psListar = getConexion().prepareStatement(queryListar);
			}
			ResultSet rs = psListar.executeQuery();
			while(rs.next()) {
				Profesor profeAux = new Profesor();
				profeAux.setDocumento(new Documento(rs.getString("tipoDocumento"),rs.getString("numeroDocumento")));
				profeAux.setDescripcion(rs.getString("descripcion"));
				profeAux.setActivo(rs.getBoolean("activo"));
				profeAux.setFechaNacimiento(java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("fechaNacimiento"))));
				profeAux.setFechaCreacion(java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("fechaCreacion"))));
				
				listaAux.add(profeAux);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaAux;
	}

}
