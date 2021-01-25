<%@page import="com.curso.java.Entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html lang="en">
      <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>    
    
        <title>Proyecto Java</title>
      </head>
      <body>
        <header style="margin-bottom: 0" class="jumbotron text-center">
          <h1>Proyecto Java Full Stack</h1>
          <h4>Clase 01</h4>
        </header>
        

        <%
        	Usuario usuario = (Usuario) session.getAttribute("usuario");
         	if (null == usuario){
         		response.sendRedirect("login.jsp");
         	}
        	
        %>
        
        <nav class="navbar navbar-expand-sm bg-primary navbar-dark">
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav justify-content-end">
                    <li class="nav-item">
                        <a href="#" class="nav-link">Profesores</a>
                    </li>
                </ul>
            </div>
    
            <div class="dropdown">
                <a style="color:white;" class="nav-link dropdown-toggle" data-toggle ="dropdown" href="">
                    Cerrar sesion
                </a>
                <div class="dropdown-menu  text-center">
                    <a>
                        <img src="img/avatar-profesor.png" alt="avatar-profesor" width="50" height="50">
                    </a>
                    <br>
                   
                    <a>
                    <%= session.getId() %>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="login?accion=true">Salir</a>
                </div>
            </div> 
        </nav> 
    
        <main>
          <div class="container">
            <div>
              <a style="margin: 10px" class="btn btn-success" role="button" href="#">
                <i class="fas fa-user-plus"></i>
            </a>
            </div>
            <table class="table table-inverse table-responsive table-hover">
              <thead class="thead-inverse">
                <tr>
                  <th>Tipo Documento</th>
                  <th>Numero Documento</th>
                  <th>Descripcion</th>
                  <th>Fecha Nacimiento</th>
                  <th>Activo</th>
                  <th>Fecha de creacion</th>
                  <th>Acción</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>DNI</td>
                  <td>511515</td>
                  <td>FP</td>
                  <td>18/10/1993</td>
                  <td>Activo</td>
                  <td>19/85/24</td>
                  <td>
                    <a class="btn btn-warning" role="button" href="#"><i class="far fa-edit"></i></a>
                    <a class="btn btn-danger" role="button" href="#"><i class="far fa-trash-alt"></i></a>
                  </td>
                </tr>
                <tr>
                  <td>DNI</td>
                  <td>511515</td>
                  <td>FP</td>
                  <td>18/10/1993</td>
                  <td>Activo</td>
                  <td>19/85/24</td>
                  <td>
                    <a class="btn btn-warning" role="button" href="#"><i class="far fa-edit"></i></a>
                    <a class="btn btn-danger" role="button" href="#"><i class="far fa-trash-alt"></i></a>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </main>
        <footer style="margin-bottom: 0;" class="jumbotron text-center">
          <h6>Educacion IT</h6>
        </footer> 
      </body>
    </html>
    