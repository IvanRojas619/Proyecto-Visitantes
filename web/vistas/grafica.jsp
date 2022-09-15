<%-- 
    Document   : grafica
    Created on : 5/04/2022, 08:52:59 PM
    Author     : Ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*"%>
<%@page import="org.jfree.chart.*"%>
<%@page import="org.jfree.chart.plot.*"%>
<%@page import="org.jfree.data.general.*"%>


 


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Graficas Estadísticas por Sexo</h1>
  
        
        
        <p>Numero Hombres:<%=request.getAttribute("numeroHombres")%> </p><br>
         <p>Numero Mujeres:<%=request.getAttribute("numeroMujeres")%> </p>
         
         
         
         <%
             int hombres =(Integer)request.getAttribute("numeroHombres");
             int mujeres = (Integer)request.getAttribute("numeroMujeres");
            
         DefaultPieDataset datos= new DefaultPieDataset();
         datos.setValue("Visitantes Hombre",hombres);
         datos.setValue("Visitantes Mujeres",mujeres);
         
         
         //Genero el gráfico
  JFreeChart grafico= ChartFactory.createPieChart("Estadisticas de visitantes",datos,true,true,true);
  //medio por el cual se visualziara el gráfico
  response.setContentType("image/JPEG");
         OutputStream sa=response.getOutputStream();
         
//Impresion del gráfico

//ChartUtilities.writeChartAsJPEG(sa,grafico,500,500);
         
         
         
         %>
         
         <div>
             <%
                 ChartUtilities.writeChartAsJPEG(sa,grafico,500,500);
             %>
             
         </div><br>
         <div>
             <%ChartUtilities.writeChartAsJPEG(sa,grafico,500,500);
             %>
         </div>
         
        
    </body>
</html>
