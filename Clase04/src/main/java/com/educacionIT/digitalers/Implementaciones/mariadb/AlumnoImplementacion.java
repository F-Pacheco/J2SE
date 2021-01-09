package com.educacionIT.digitalers.Implementaciones.mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.educacionIT.digitalers.Entidades.Alumno;
import com.educacionIT.digitalers.Entidades.Documento;
import com.educacionIT.digitalers.Entidades.Persona;
import com.educacionIT.digitalers.Entidades.Usuario;
import com.educacionIT.digitalers.Interfaces.ConexionMariaDB;
import com.educacionIT.digitalers.Interfaces.DAO;

public class AlumnoImplementacion implements DAO<Persona, Documento>, ConexionMariaDB{
	private Connection conexion = null;
	private PreparedStatement psInsertar = null;
	private PreparedStatement psActualizar = null;
	private PreparedStatement psEliminar = null;
	private PreparedStatement psBuscar = null;
	private PreparedStatement psListar = null;
	private static final String QUERY_INSERTAR = "insert into Alumnos (tipoDocumento, numeroDocumento, descripcion, direccion, activo,fechaNacimiento) "
			+ "values(?, ?, ?, ?, ?,?)";
	private static final String QUERY_ACTUALIZAR ="update alumnos set descripcion = ?, direccion = ?, activo = ?. fechaNacimiento = ? where tipoDocumento = ? and numeroDocumento = ?";
	private static final String QUERY_ELIMINAR ="delete from alumnos where tipoDocumento = ? and numeroDocumento = ?";
	private static final String QUERY_BUSCAR ="select tipoDocumento, numeroDocumento, descripcion, direccion, activo,fechaNacimiento, fechaCreacion from alumnos where tipoDocumento = ? and numeroDocumento = ?";
	private static final String QUERY_LISTAR ="select tipoDocumento, numeroDocumento, descripcion, direccion, activo,fechaNacimiento, fechaCreacion from alumnos";
	
	//Constructors
	public AlumnoImplementacion(){
		try {
			conexion = crearConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Methods
	@Override
	public void insertar(Persona elemento) {
		try {
			if (psInsertar == null) {
				psInsertar = conexion.prepareStatement(QUERY_INSERTAR);
			}
			psInsertar.setString(1, elemento.getDocumento().getTipoDocumento());
			psInsertar.setString(2, elemento.getDocumento().getNumeroDocumento());
			psInsertar.setString(3, elemento.getDescripcion());
			psInsertar.setString(4, elemento.getDireccion());
			psInsertar.setBoolean(5, elemento.getActivo());
			
			// manejo de DATES 
			psInsertar.setDate(6, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(elemento.getFechaNacimiento())));
			
			psInsertar.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Override
	public void eliminar(Persona elemento) {
		try {
			if(psEliminar == null) {
				psEliminar = conexion.prepareStatement(QUERY_ELIMINAR);
			}
			psEliminar.setString(1, elemento.getDocumento().getTipoDocumento());
			psEliminar.setString(2, elemento.getDocumento().getNumeroDocumento());
			psEliminar.execute();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}

	@Override
	public void actualizar(Persona elemento) {
		try {
			if(psActualizar == null) {
				psActualizar = conexion.prepareStatement(QUERY_ACTUALIZAR);
			}
			psActualizar.setString(1, elemento.getDescripcion());
			psActualizar.setString(2, elemento.getDireccion());
			psActualizar.setBoolean(3, elemento.getActivo());
			psActualizar.setDate(4, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(elemento.getFechaNacimiento())));
			psActualizar.setString(5, elemento.getDocumento().getTipoDocumento());
			psActualizar.setString(6, elemento.getDocumento().getNumeroDocumento());
			
			psActualizar.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Persona buscarPorId(Documento key) {
		Alumno alumnoAux = null;
		try {
			if (psBuscar == null) {
				psBuscar = conexion.prepareStatement(QUERY_BUSCAR);
			}
			psBuscar.setString(1, key.getTipoDocumento());
			psBuscar.setString(2, key.getNumeroDocumento());
		
			ResultSet rs = psBuscar.executeQuery();
			if (rs.next()) {
				alumnoAux = new Alumno();
				alumnoAux.setDescripcion(rs.getString("descripcion"));
				alumnoAux.setDireccion(rs.getString("direccion"));
				alumnoAux.setActivo(rs.getBoolean("activo"));
				alumnoAux.setDocumento(key);
				alumnoAux.setFechaNacimiento(java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("fechaNacimiento"))));
				alumnoAux.setFechaCreacion(java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("fechaCreacion"))));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alumnoAux;
	}

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
