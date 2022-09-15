/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Ppl;
import ModeloDAO.PplDAO;
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
public class Controlador extends HttpServlet {

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
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
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
    Ppl ppl=new Ppl();
    PplDAO dao=new PplDAO();
    int Id_ppl;
    int id;
    Validar validar= new Validar();
    
    
    
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
            
            String id_ppl=request.getParameter("txtId");
            String nombre=request.getParameter("txtNombre");
            String apellido_paterno=request.getParameter("txtApellidoPaterno");
            String apellido_materno=request.getParameter("txtApellidoMaterno");
            String edad=request.getParameter("txtEdad");
            String sexo=request.getParameter("txtSexo");
            ppl.setId_ppl(Integer.parseInt(id_ppl));
            ppl.setNombre(nombre);
            ppl.setNombre(nombre);
            ppl.setApellido_paterno(apellido_paterno);
            ppl.setApellido_materno(apellido_materno);
            ppl.setEdad(Integer.parseInt(edad));
            ppl.setSexo(sexo);
            dao.add(ppl);
            acceso=listar;
            
        }else if(action.equalsIgnoreCase("editar")){
            
            request.setAttribute("idper",request.getParameter("id"));
            acceso=edit;  
        }else if(action.equalsIgnoreCase("Actualizar")){
            
             id=Integer.parseInt(request.getParameter("txtId"));
            //String id_ppl=request.getParameter("txtId");
            String nombre=request.getParameter("txtNombre");
            String apellido_paterno=request.getParameter("txtApellidoPaterno");
            String apellido_materno=request.getParameter("txtApellidoMaterno");
            String edad=request.getParameter("txtEdad");
            String sexo=request.getParameter("txtSexo");
            ppl.setId_ppl(id);
            ppl.setNombre(nombre);
            ppl.setApellido_paterno(apellido_paterno);
            ppl.setApellido_materno(apellido_materno);
            ppl.setEdad(Integer.parseInt(edad));
            ppl.setSexo(sexo);
            dao.edit(ppl);
            acceso=listar;
                    
        }else if(action.equalsIgnoreCase("eliminar")){
            
            id=Integer.parseInt(request.getParameter("id"));
            ppl.setId_ppl(id);
            dao.eliminar(id);
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
