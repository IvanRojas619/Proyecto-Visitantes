<%@page import="ModeloDAO.Visitante_PplDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Visitante_Ppl"%>

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
            <h1> CONSULTA DE VISITAS DE PPL</h1>
            <a  class="btn btn-success" href="Controlador_Visitantes_Ppl?accion=add">Agregar Nueva Visita</a><br><br>
            
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID VISITA</th>
                        <th class="text-center">ID VISITANTE</th>
                        <th class="text-center">ID PPL</th>
                        <th class="text-center">PARENTESCO</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                
                <%
                
Visitante_PplDAO dao = new Visitante_PplDAO();
List<Visitante_Ppl>list=dao.listar();
Iterator<Visitante_Ppl>iter=list.iterator();
Visitante_Ppl visitante_ppl=null;

while(iter.hasNext()){
    
    visitante_ppl=iter.next();

                
                
                
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%=visitante_ppl.getId_visita()%></td>
                        <td class="text-center"><%=visitante_ppl.getId_visitante()%></td>
                        <td class="text-center"><%=visitante_ppl.getId_ppl()%></td>
                        <td class="text-center"><%=visitante_ppl.getParentesco()%></td>
                        <td class="text-center"><a class="btn btn-warning" href="Controlador_Visitantes_Ppl?accion=editar&id=<%=visitante_ppl.getId_visita()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador_Visitantes_Ppl?accion=eliminar&id=<%=visitante_ppl.getId_visita()%>">Eliminar</a>   
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

            
            
        </div>
                
                <div>
         
              
                </div>
    </body>
</html>
