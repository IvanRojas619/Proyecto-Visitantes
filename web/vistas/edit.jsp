<%-- 
    Document   : edit
    Created on : 14/03/2022, 12:45:16 PM
    Author     : Ivan
--%>

<%@page import="Modelo.Ppl"%>
<%@page import="ModeloDAO.PplDAO"%>
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
            
            <div class="col-lg-6">
                <%
            PplDAO dao=new PplDAO();
            int id=Integer.parseInt((String)request.getAttribute("idper"));
            Ppl ppl=(Ppl)dao.list(id);
            

            %>
            
            <h1>Modificar Ppl(Persona privada de la libertad)</h1>
        
        <form action="Controlador">
            
            <input class="form-control" type="hidden" name="txtId" value="<%=ppl.getId_ppl()%>"><br>
            NOMBRE:<br>
            <input class="form-control" type="text" name ="txtNombre" value="<%=ppl.getNombre()%>"><br>
            APELLIDO PATERNO:<br>
            <input class="form-control"  type="text" name ="txtApellidoPaterno" value="<%=ppl.getApellido_paterno()%>"><br>
            APELLIDO MATERNO:<br>
            <input class="form-control"  type="text" name ="txtApellidoMaterno" value="<%=ppl.getApellido_materno()%>"><br>
            EDAD:<br>
            <input class="form-control"  type="text" name ="txtEdad" value="<%=ppl.getEdad()%>"><br>
            SEXO:<br>
            <input class="form-control"  type="text" name ="txtSexo" value="<%=ppl.getSexo()%>"><br>
            <input class="btn btn-primary" type="submit" name ="accion" value="Actualizar"><br>
            <a href="Controlador?accion=listar">Regresar</a>
            
            
        </form>
                
            </div>
            
        </div>
    </body>
</html>
