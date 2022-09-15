<%-- 
    Document   : listar
    Created on : 14/03/2022, 12:44:45 PM
    Author     : Ivan
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
        <div class="container overflow-auto">
            <h1>PPLS</h1>
            <a class="btn btn-success" href="Controlador?accion=add">Agregar Nuevo</a>
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
                
PplDAO dao = new PplDAO();
List<Ppl>list=dao.listar();
Iterator<Ppl>iter=list.iterator();
Ppl ppl=null;

while(iter.hasNext()){
    
    ppl=iter.next();

                
                
                
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%=ppl.getId_ppl()%></td>
                        <td class="text-center"><%=ppl.getNombre()%></td>
                        <td class="text-center"><%=ppl.getApellido_paterno()%></td>
                        <td class="text-center"><%=ppl.getApellido_materno()%></td>
                        <td class="text-center"><%=ppl.getEdad()%></td>
                        <td class="text-center"><%=ppl.getSexo()%></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="Controlador?accion=editar&id=<%=ppl.getId_ppl()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%=ppl.getId_ppl()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

            
            
        </div>
    </body>
</html>
