<%-- 
    Document   : add
    Created on : 14/03/2022, 12:45:07 PM
    Author     : Ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
       <!-- <link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
       <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
     
         <nav class="barra">
        <ul class="navegacion">
            <li class="enlace" id="ppl">
                <a href="#ppl" class="padre">
                    <i class="far fa-user"></i>PPL
                </a>
                <div class="submenu">
                    <a href="#">Altas</a>
                    <a href="#">Bajas</a>
                    <a href="Controlador?accion=listar">Consultas</a>
                    <a href="#">Cambios</a>
                </div>
            </li>
            <li class="enlace" id="visitas">
                <a href="#visitas" class="padre">
                    <i class="far fa-user"></i>Visitantes
                </a>
                <div class="submenu">
                    <a  href="#">Altas</a>
                    <a href="#">Bajas</a>
                    <a href="ControladorVisitantes?accion=listar">Consultas</a>
                    <a href="#">Cambios</a>
                    <a href="Controlador_Visitantes_Ppl?accion=listar">Registrar Visita</a>
                </div>
            </li>
            <li class="enlace" id="consultas">
                <a href="#consultas" class="padre">
                    <i class="fas fa-users"></i>Consultas
                </a>
                <div class="submenu">
                    <a href="#">Población total</a>
                    <a href="#">Visitas Total</a>
                    <a href="#">Estadísticas por sexo</a>
                </div>
            </li>
            
          
           <!-- 
            <li class="enlace" id="logout">
                <a href="#salir" class="padre">
                    <i class="fas fa-sign-out-alt"></i>Salir
                </a>
                
            </li>-->
   <div class="dropdown ">
  <button style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-expanded="false">
   Usuario Ingresado: ${usuario.getUserName()}
  </button>
  <div class="dropdown-menu text-center" aria-labelledby="dropdownMenuButton">
    <a class="dropdown-item" href="#"> 
        
        <img src="img/avatar-login.png" alt="60" width="60"/>
    
    </a>
    
    <a class="dropdown-item" href="#">Id Usuario: ${usuario.getId()} </a>
    <a class="dropdown-item" href="#">Usuario: ${usuario.getUserName()} </a>
    
     <div class="dropdown-divider">
       
     </div>
    <form action="Validar" method="post">
        <button name="accion" value="Salir"class="dropdown-item" href="#"><i class="fas fa-sign-out-alt"></i>Salir </button> 
         </form>
  </div>
         
</div>
  
        </ul>
            
 
    </nav>
       
    <br><br><br>
        <div class="container">
        <h1>Agregar Ppl(Persona privada de la libertad)</h1>
        
        <div class="col-lg-6 ">
        <form action="Controlador">
            <div class="form-group">
            ID:<br>
            <input class="form-control" type="text" name="txtId"><br>
            NOMBRE:<br>
            <input class="form-control" type="text" name ="txtNombre"><br>
            APELLIDO PATERNO:<br>
            <input class="form-control" type="text" name ="txtApellidoPaterno"><br>
            APELLIDO MATERNO:<br>
            <input class="form-control" type="text" name ="txtApellidoMaterno"><br>
           EDAD:<br>
            <input class="form-control" type="text" name ="txtEdad"><br>
            SEXO:<br>
           <select class="form-control" name="txtSexo">
               <option value="Masculino">Masculino</option>
               <option value="Femenino">Femeninio</option>
           </select><br>
           <!-- SEXO:<br>
            <input type="text" name ="txtSexo"><br>-->
            <input class="btn btn-primary" type="submit" name ="accion" value="Agregar">
            <a href="Controlador?accion=listar">Regresar</a>
            </div>
           
        </form>
            
            </div>
         </div>
     <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
    </body>
</html>
