package com.curso.educacionIt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.educacionIt.Entidades.Usuario;

/**
 * Servlet implementation class Validacion
 */
public class Validacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Usuario usuarioPrueba = new Usuario("Fede", "1234");
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validacion() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String nombre = request.getParameter("nombre");
		String clave = request.getParameter("clave");
		
		System.out.println(nombre+" "+clave);
		response.sendRedirect("bienvenido.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String descripcion = request.getParameter("descripcion");
		String clave = request.getParameter("clave");
		RequestDispatcher rd = null;
		
		if(descripcion.equalsIgnoreCase(usuarioPrueba.getDescripcion())&& clave.equalsIgnoreCase(usuarioPrueba.getClave())) {
			request.setAttribute("usuario", usuarioPrueba);
			rd = request.getRequestDispatcher("bienvenido.jsp");
			rd.forward(request, response);
			
		}else {
			request.setAttribute("error", "credenciales incorrectas");
			rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
		
		/*
		PrintWriter out = response.getWriter();	
		out.print("<html>");
		out.print("<h1>");
		out.print(descripcion);
		out.print("</h1>");
		out.print("<br>");
		out.print("<h2> bienvenidos</h2>");
		out.print("</html>");
		out.flush();
		out.close();
		*/
	}

}
