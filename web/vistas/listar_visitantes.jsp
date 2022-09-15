<%-- 
    Document   : listar_visitantes
    Created on : 15/03/2022, 01:49:57 PM
    Author     : Ivan
--%>

<%@page import="ModeloDAO.VisitanteDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Visitante"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

        <title>Lista de Visitantes Registrados</title>
    </head>
    <body>
        <div class="container">
            <h1> CONSULTA VISITANTES REGISTRADOS</h1>
            <a class="btn btn-success" href="ControladorVisitantes?accion=add">Agregar Nuevo Visitante</a>
            <br>
            <br>
            
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">NOMBRE</th>
                        <th class="text-center">APELLIDO PATERNO</th>
                        <th class="text-center">APELLIDO MATERNO</th>
                        <th class="text-center">EDAD</th>
                        <th class="text-center">SEXO</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                
                <%
                
VisitanteDAO dao = new VisitanteDAO();
List<Visitante>list=dao.listar();
Iterator<Visitante>iter=list.iterator();
Visitante visitante=null;

while(iter.hasNext()){
    
    visitante=iter.next();

                
                
                
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%=visitante.getId_visitante()%></td>
                        <td class="text-center"><%=visitante.getNombre()%></td>
                        <td class="text-center"><%=visitante.getApellido_paterno()%></td>
                        <td class="text-center"><%=visitante.getApellido_materno()%></td>
                        <td class="text-center"><%=visitante.getEdad()%></td>
                        <td class="text-center"><%=visitante.getSexo()%></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="ControladorVisitantes?accion=editar&id=<%=visitante.getId_visitante()%>">Editar</a>
                            <a class="btn btn-danger" href="ControladorVisitantes?accion=eliminar&id=<%=visitante.getId_visitante()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

            
            
        </div>
    </body>
</html>
