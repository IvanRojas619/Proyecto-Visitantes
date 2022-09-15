/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Visitante_Ppl;
import ModeloDAO.Visitante_PplDAO;
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
public class Controlador_Visitantes_Ppl extends HttpServlet {

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
            out.println("<title>Servlet Controlador_Visitantes_Ppl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador_Visitantes_Ppl at " + request.getContextPath() + "</h1>");
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
        String listar ="vistas/listar_visitante_ppl.jsp";
    String add="vistas/add_visitante_ppl.jsp";
    String edit="vistas/edit_visitante_ppl.jsp";
    Visitante_Ppl visitante_ppl=new Visitante_Ppl();
    Visitante_PplDAO dao=new Visitante_PplDAO();
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
            String id_visita=request.getParameter("txtIdVisita");
            String id_visitante=request.getParameter("txtIdVisitante");
            String id_ppl=request.getParameter("txtIdPpl");
            String parentesco=request.getParameter("txtParentesco");
            
            visitante_ppl.setId_visita(Integer.parseInt(id_visita));
            visitante_ppl.setId_visitante(Integer.parseInt(id_visitante));
            visitante_ppl.setId_ppl(Integer.parseInt(id_ppl));
            visitante_ppl.setParentesco(parentesco);

            dao.add(visitante_ppl);
            acceso=listar;
         }else if(action.equalsIgnoreCase("editar")){
             
             request.setAttribute("idvisita",request.getParameter("id"));
            acceso=edit;  
         }
         else if(action.equalsIgnoreCase("Actualizar")){
             
             id=Integer.parseInt(request.getParameter("txtIdVisita"));
            //String id_ppl=request.getParameter("txtId");
            String id_visitante=request.getParameter("txtIdVisitante");
            String id_ppl=request.getParameter("txtIdPpl");
            String parentesco=request.getParameter("txtParentesco");
          
            visitante_ppl.setId_visita(id);
            visitante_ppl.setId_visitante(Integer.parseInt(id_visitante));
            visitante_ppl.setId_ppl(Integer.parseInt(id_ppl));
            visitante_ppl.setParentesco(parentesco);
         
            dao.edit(visitante_ppl);
            acceso=listar;
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
