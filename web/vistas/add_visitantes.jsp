<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
        <h1>Agregar Visitantes</h1>
         <div class="col-lg-6 ">
        <form class="form-group" action="ControladorVisitantes">
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
           </select><br><br>
           <!-- SEXO:<br>
            <input type="text" name ="txtSexo"><br>-->
            <input class="btn btn-success" type="submit" name ="accion" value="Agregar">
               <a href="ControladorVisitantes?accion=listar">Regresar</a>
            
            
        </form>
         </div>
        </div>
    </body>
</html>
