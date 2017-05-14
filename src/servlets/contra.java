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
public class contra extends HttpServlet {

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
            
             String txtusuar = request.getParameter("usuarion");
            String txtcontr = request.getParameter("contran");
             String txtcontra2 = request.getParameter("contra2");
            
             if(txtusuar!=null||txtcontr!=null||txtcontra2!=null){
                
                 request.setAttribute("Mensaje","su contraseña a sido restaurada");
             }else{
                 request.setAttribute("Mensaje", "su contraseña no a podido ingresarse intentelo de nuevo ");
             }
            
            
            
            
            
            
            
            
    }
}
