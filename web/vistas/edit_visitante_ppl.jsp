<%-- 
    Document   : edit_visitante_ppl
    Created on : 16/03/2022, 08:35:20 PM
    Author     : Ivan
--%>

<%@page import="Modelo.Visitante_Ppl"%>
<%@page import="ModeloDAO.Visitante_PplDAO"%>
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
            Visitante_PplDAO dao=new Visitante_PplDAO();
            int id=Integer.parseInt((String)request.getAttribute("idvisita"));
            Visitante_Ppl visitante_ppl=(Visitante_Ppl)dao.list(id);
            

            %>
            
            <h1>Modificar Visitas registradas</h1>
        
        <form class="form-group" action="Controlador_Visitantes_Ppl">
            
            ID VISITA:<br>
            <input class="form-control" type="text" name="txtIdVisita" value="<%=visitante_ppl.getId_visita()%>"><br>
            ID VISITANTE:<br>
            <input class="form-control"  type="text" name ="txtIdVisitante" value="<%=visitante_ppl.getId_visitante()%>"><br>
            ID PPl:<br>
            <input class="form-control"  type="text" name ="txtIdPpl" value="<%=visitante_ppl.getId_ppl()%>"><br>
            PARENTESCO:<br>
            <input class="form-control"  type="text" name ="txtParentesco" value="<%=visitante_ppl.getParentesco()%>"><br>
            <input class="btn btn-success"  type="submit" name ="accion" value="Actualizar">
            <a href="Controlador_Visitantes_Ppl?accion=listar">Regresar</a>
            
            
        </form>
            </div>
        </div>
    </body>
</html>
