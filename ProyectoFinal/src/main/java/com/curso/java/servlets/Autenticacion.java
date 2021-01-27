package com.curso.java.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.curso.java.Entidades.Profesor;
import com.curso.java.Entidades.Usuario;
import com.curso.java.Implementaciones.mariaDb.ProfesorImplementacion;
import com.curso.java.Implementaciones.mariaDb.UsuarioImplementacion;

/**
 * Servlet implementation class Autenticacion
 */

@WebServlet(name = "login", urlPatterns = "/inicioSesion")

public class Autenticacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Autenticacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Boolean accion = Boolean.valueOf(request.getParameter("accion")); //casteo a boolean
		
		if (accion && null != request.getSession().getId()) {
			request.getSession().invalidate();
			request.setAttribute("ALERTA", "SESION_CERRADA");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String descripcion = request.getParameter("descripcion");
		String clave = request.getParameter("clave");
		Usuario userSession = null;
		UsuarioImplementacion usImp = new UsuarioImplementacion();
		String[] credencialesBusq = {descripcion, clave};
		
		userSession = usImp.buscar(credencialesBusq);
		
		if(!(null == userSession)) {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("usuario", userSession);
			
			sesion.setAttribute("Profesores", getListaProfesores());
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}else {
			request.setAttribute("ALERTA", "ERROR_CREDENCIALES");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
	
	private List<Profesor> getListaProfesores(){
		return new ProfesorImplementacion().listar();
	}

}
