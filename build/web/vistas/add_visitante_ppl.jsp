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
        <h1>Asignación de visitas</h1>
        <div class="col-lg-6">
        <form class="form-group" action="Controlador_Visitantes_Ppl">
            ID VISITA:<br>
            <input class="form-control" type="text" name="txtIdVisita"><br>
            ID VISITANTE:<br>
            <input class="form-control" type="text" name ="txtIdVisitante"><br>
            ID PPl:<br>
            <input class="form-control" type="text" name ="txtIdPpl"><br>
            PARENTESCO:<br>
            <input class="form-control" type="text" name ="txtParentesco"><br>
         
            <input class="btn btn-success" type="submit" name ="accion" value="Agregar">
            
            <a href="Controlador_Visitantes_Ppl?accion=listar">Regresar</a>
             
        </form>
            </div>
        </div>
    </body>
</html>