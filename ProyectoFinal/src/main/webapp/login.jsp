<%@page import="com.curso.java.Entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="css/main.css">
    
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>    
    
        <title>Inicio de sesion</title>
        
        
        <%
        	Usuario usuario = (Usuario) session.getAttribute("usuario");
        	if (null != usuario){
        		response.sendRedirect("index.jsp");
        	}
        
        %>
        
        
        
        
    </head>
    <body>
        <main class="contenedor">
    
       
            <div class="container text-center flex-item">
    
                
                <div class="cl-sm-12 login">
    
                    <div class="modal-content border border-0">
                        <div class="col-12 user-img">
                            <img src="img/avatar-login.svg" alt="avatar-profesor" >
                        </div>
    
                        <form action="inicioSesion" method="post">
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">
                                        <i class="fas fa-user-astronaut"></i>
                                    </span>
                                </div>
                                <input class="form-control" type="email" name="descripcion" id="descripcion" required placeholder="tucorreo@dominio.com">
                            </div>
    
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">
                                        <i class="fas fa-key"></i>
                                    </span>
                                </div>
                                <input class="form-control" type="password" name="clave" id="clave" required placeholder="password">
                            </div>
    
                            <div>
                                <button class="btn btn-primary" type="submit">Enviar</button>
                                <button class="btn btn-warning" type="reset">Limpiar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
    
    </main>
        
    </body>
    </html>