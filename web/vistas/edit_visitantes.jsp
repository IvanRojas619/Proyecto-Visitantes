<%@page import="Modelo.Visitante"%>
<%@page import="ModeloDAO.VisitanteDAO"%>
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
            
            <div>
            <%
            VisitanteDAO dao=new VisitanteDAO();
            int id=Integer.parseInt((String)request.getAttribute("idvis"));
            Visitante visitante=(Visitante)dao.list(id);
            

            %>
            
            <h1>Modificar Visitantes</h1>
        
        <form class="form-group" action="ControladorVisitantes">
            
            <input class="form-control" type="hidden" name="txtId" value="<%=visitante.getId_visitante()%>"><br>
            NOMBRE:<br>
            <input class="form-control" type="text" name ="txtNombre" value="<%=visitante.getNombre()%>"><br>
            APELLIDO PATERNO:<br>
            <input class="form-control" type="text" name ="txtApellidoPaterno" value="<%=visitante.getApellido_paterno()%>"><br>
            APELLIDO MATERNO:<br>
            <input class="form-control" type="text" name ="txtApellidoMaterno" value="<%=visitante.getApellido_materno()%>"><br>
            EDAD:<br>
            <input class="form-control" type="text" name ="txtEdad" value="<%=visitante.getEdad()%>"><br>
            SEXO:<br>
            <input class="form-control" type="text" name ="txtSexo" value="<%=visitante.getSexo()%>"><br>
           
           <input class="btn btn-primary" type="submit" name ="accion" value="Actualizar"><br>
           <a href="Controlador?accion=listar">Regresar</a>
            
            
        </form>
            </div>
        </div>
    </body>
</html>
