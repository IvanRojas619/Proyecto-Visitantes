/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Visitante;
import ModeloDAO.VisitanteDAO;
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
public class ControladorVisitantes extends HttpServlet {

  
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
            out.println("<title>Servlet ControladorVisitantes</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorVisitantes at " + request.getContextPath() + "</h1>");
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
    
    String listar ="vistas/listar_visitantes.jsp";
    String add="vistas/add_visitantes.jsp";
    String edit="vistas/edit_visitantes.jsp";
    Visitante visitante=new Visitante();
    VisitanteDAO dao=new VisitanteDAO();
    int id;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String acceso="";
        String action=request.getParameter("accion");
        
         if(action.equalsIgnoreCase("listar")){
            
            acceso=listar;
            
         }else if(action.equalsIgnoreCase("add")){
            
             acceso=add;
         }else if(action.equalsIgnoreCase("Agregar")){
            String id_visitante=request.getParameter("txtId");
            String nombre=request.getParameter("txtNombre");
            String apellido_paterno=request.getParameter("txtApellidoPaterno");
            String apellido_materno=request.getParameter("txtApellidoMaterno");
            String edad=request.getParameter("txtEdad");
            String sexo=request.getParameter("txtSexo");
            visitante.setId_visitante(Integer.parseInt(id_visitante));
            visitante.setNombre(nombre);
            visitante.setNombre(nombre);
            visitante.setApellido_paterno(apellido_paterno);
            visitante.setApellido_materno(apellido_materno);
            visitante.setEdad(Integer.parseInt(edad));
            visitante.setSexo(sexo);
            dao.add(visitante);
            acceso=listar;
         }else if(action.equalsIgnoreCase("editar")){
             
             request.setAttribute("idvis",request.getParameter("id"));
            acceso=edit;  
         }else if(action.equalsIgnoreCase("Actualizar")){
             
             id=Integer.parseInt(request.getParameter("txtId"));
            //String id_ppl=request.getParameter("txtId");
            String nombre=request.getParameter("txtNombre");
            String apellido_paterno=request.getParameter("txtApellidoPaterno");
            String apellido_materno=request.getParameter("txtApellidoMaterno");
            String edad=request.getParameter("txtEdad");
            String sexo=request.getParameter("txtSexo");
            visitante.setId_visitante(id);
            visitante.setNombre(nombre);
            visitante.setApellido_paterno(apellido_paterno);
            visitante.setApellido_materno(apellido_materno);
            visitante.setEdad(Integer.parseInt(edad));
            visitante.setSexo(sexo);
            dao.edit(visitante);
            acceso=listar;
         }else if(action.equalsIgnoreCase("eliminar")){
             
            id=Integer.parseInt(request.getParameter("id"));
            visitante.setId_visitante(id);
            dao.eliminar(id);
            acceso=listar;
         }
         
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        
       // processRequest(request, response);
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
