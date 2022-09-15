/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Config.Conexion;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ivan
 */
public class Controlador_graficas extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador_graficas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador_graficas at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
     String listar ="vistas/listar.jsp";
    String add="vistas/add.jsp";
    String edit="vistas/edit.jsp";
    String graficas="vistas/grafica.jsp";
    String total_poblacion="vistas/totalpoblacion.jsp";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String acceso="";
        String action=request.getParameter("accion");
        
        if (action.equalsIgnoreCase("grafica")){
            
            Conexion cn=new Conexion();
    Connection  con;
    PreparedStatement ps;
    ResultSet rs;
    Connection con2;
    PreparedStatement ps2;
    ResultSet rs2;
    
    String sql="select count(*)from visitantes where Sexo='Femenino'";
    String sql2="select count(*)from visitantes where Sexo='Masculino'";
    int numero_mujeres=0;
    int numero_hombres=0;
    
    try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
           
            
          if (rs.next()){ // nos devuelve algo
              
              numero_mujeres=rs.getInt(1);
             
              
               //acceso=graficas;
          
          System.out.println("El numero de mujeres es :"+numero_mujeres);
          
          
         con.close();
          
          }
            
            }catch(Exception e){
                
                
            }
    
    try{
         Conexion cn2=new Conexion();
        con2=cn2.getConnection();
            ps2=con2.prepareStatement(sql2);
            rs2=ps2.executeQuery();
            
            if (rs2.next()){ // nos devuelve algo
              
              numero_hombres=rs2.getInt(1);
             
              
              // acceso=graficas;
          
          System.out.println("El numero de hombres es :"+numero_hombres);
          
          
         con2.close();
          
          }
            
        
    }catch(Exception e){
        
        
    }
    
    request.setAttribute("numeroHombres", numero_hombres);
    request.setAttribute("numeroMujeres", numero_mujeres);
    
    acceso=graficas;
            
        }else if(action.equalsIgnoreCase("poblaciontotal")){
            
    String sql="select count(*)from ppl where Sexo='Femenino'";
    String sql2="select count(*)from ppl where Sexo='Masculino'";
      Conexion cn=new Conexion();      
     Connection  con;
    PreparedStatement ps;
    ResultSet rs;
     Connection con2;
    PreparedStatement ps2;
    ResultSet rs2;
    
    int numero_mujeresppl=0;
    int numero_hombresppl=0;
    
    try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
           
            
          if (rs.next()){ // nos devuelve algo
              
              numero_mujeresppl=rs.getInt(1);
             
              
               //acceso=graficas;
          
          System.out.println("El numero de mujeres es :"+numero_mujeresppl);
          
          
         con.close();
          
          }
            
            }catch(Exception e){
                
                
            }
    
        try{
         Conexion cn2=new Conexion();
        con2=cn2.getConnection();
            ps2=con2.prepareStatement(sql2);
            rs2=ps2.executeQuery();
            
            if (rs2.next()){ // nos devuelve algo
              
              numero_hombresppl=rs2.getInt(1);
             
              
              // acceso=graficas;
          
          System.out.println("El numero de hombres es :"+numero_hombresppl);
          
          
         con2.close();
          
          }
            
        
    }catch(Exception e){
        
        
    }
        acceso=total_poblacion;
         request.setAttribute("numeroHombresPpl", numero_hombresppl);
    request.setAttribute("numeroMujeresPpl", numero_mujeresppl);
            
        }
        
             RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        //processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
