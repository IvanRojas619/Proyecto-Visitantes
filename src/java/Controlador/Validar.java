/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import ModeloDAO.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ivan
 */
public class Validar extends HttpServlet {

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
            out.println("<title>Servlet Validar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Validar at " + request.getContextPath() + "</h1>");
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    UsuarioDAO usuarioDao= new UsuarioDAO();
    Usuario usuario = new Usuario();
    String prueba_login ="/vistas/index_1.jsp";
    String login="index.jsp";
    String salir="index.jsp";
    String acceso="";
    String nombre_usuario="";
    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion=request.getParameter("accion");
       
        
     
        
        if(accion.equalsIgnoreCase("Ingresar")){
            
            String user=request.getParameter("txtUsername");
            String password=request.getParameter("txtPassword");
            usuario=usuarioDao.validar(user, password);
             acceso=prueba_login;
      
            
            if(usuario.getUserName()!=null){
                
                System.out.println(" MENSAJE: logeado");
                
               
               
                  //request.setAttribute("usuario", nombre_usuario);
                request.setAttribute("usuario", usuario);
                
                
               RequestDispatcher vista = request.getRequestDispatcher(acceso);  
                vista.forward(request, response);
                //request.getRequestDispatcher("ControladorDirecciones?accion=listar").forward(request, response);
                
                
            }else{
                acceso=login;
                 System.out.println(" MENSAJE: No logueado");
                  RequestDispatcher vista = request.getRequestDispatcher(acceso);  
                vista.forward(request, response);
                //request.getRequestDispatcher("vistas/login.jsp").forward(request, response);
            }
            
        }else{
             acceso=login;
                 System.out.println(" MENSAJE: No logueado");
                  RequestDispatcher vista = request.getRequestDispatcher(acceso);  
                vista.forward(request, response);
             //request.getRequestDispatcher("vistas/login.jsp").forward(request, response);
        }
    
        
// processRequest(request, response);
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
