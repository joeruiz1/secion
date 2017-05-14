package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernando stiven
 */
public class crear extends HttpServlet {

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
            String txtnombre = request.getParameter("nombre");
            String txtusuar = request.getParameter("usuario");
            String txtedad = request.getParameter("edad");
            String txtcorrep = request.getParameter("correo");
            String txtcontra = request.getParameter("contra");
            String txtcontr2 = request.getParameter("contra2");


            
          if(txtnombre!=null||txtusuar!=null||txtedad!=null||txtcorrep!=null||txtcontra!=null||txtcontr2!=null){
              request.setAttribute("Mensaje", "creacion exitosa");
              
          }else{
              request.setAttribute("mensaje","insercion no realizada intentelo de nuevo ");
          }
    }
}