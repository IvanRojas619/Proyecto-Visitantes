

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.io.*"%>
<%@page import="org.jfree.chart.*"%>
<%@page import="org.jfree.chart.plot.*"%>
<%@page import="org.jfree.data.category.*"%>
<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
             int hombres =(Integer)request.getAttribute("numeroHombresPpl");
             int mujeres = (Integer)request.getAttribute("numeroMujeresPpl");         
         DefaultCategoryDataset datos= new DefaultCategoryDataset();
         datos.setValue(hombres,"Poblacion Internos","Hombres");
         datos.setValue(mujeres,"Poblacion Internas","Mujeres");
         
   //Genero el gráfico
  JFreeChart grafico= ChartFactory.createBarChart("Poblacion total de Personas privadas de la libertad","Poblacion","Poblacionsec",datos,PlotOrientation.VERTICAL,true,true,true);
        
  
  //medio por el cual se visualziara el gráfico
  response.setContentType("image/JPEG");
         OutputStream sa=response.getOutputStream();
        %>
        <h1>Total poblacion!</h1>
        
        <p>La poblacion total de personas privadas de la libertad hombres es : <%=request.getAttribute("numeroHombresPpl")%></p><br>
         <p>La poblacion total de personas privadas de la libertad mujeres es : <%=request.getAttribute("numeroMujeresPpl")%> </p>
         <div>
             <% ChartUtilities.writeChartAsJPEG(sa,grafico,500,500);%>
         </div>
    </body>
</html>
