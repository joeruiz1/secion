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
public class ServletN extends HttpServlet {

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
            
            String txtusuar = request.getParameter("usuario");
            String txtcontr = request.getParameter("contra");
            if(txtusuar==null||txtusuar.length()==0||txtcontr==null||txtcontr.length()==0){
            request.setAttribute("Mensaje", "No se pude ingresar satisfactoriamente");    
            }
            if(txtusuar=="fernandor"||txtusuar=="FabiolaC"||txtcontr=="local141"){
             request.setAttribute("mensaje", "bienvenido a la base de datos");
            }else{
                  request.setAttribute("Mensaje", "usuario o contraseña incorrecta ");
                        }
    }
            
            
        }
    
