/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.DomainModel.Employee;
import Business.Facades.Carportfacade;
import Business.Facades.Customerfacade;
import Business.Facades.StorageException;
import Data.EmployeeMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author felesiah
 */
@WebServlet(name = "EmployeeServlet", urlPatterns = {"/EmployeeServlet"})
public class EmployeeServlet extends HttpServlet {

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
            throws ServletException, IOException, Exception {
            response.setContentType("text/html;charset=UTF-8");
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(EmployeeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String name = request.getParameter("name");  
        String password = request.getParameter("password"); 
        
        Carportfacade cf = new Carportfacade();
         try {
              cf.employee(name, password);
               out.println(cf.employee(name, password));
               response.sendRedirect("LoggedIn.jsp");
            } catch (Exception ex) {              
                out.println("error" + ex +"!");
                request.setAttribute("loginfailed","ExceptionsThrown");
                request.getRequestDispatcher("employee.jsp").forward(request, response); //this is where an exception is handled
            }                                                                                //and the invalidLogin page is displayed instead of the 
                                                                                             //the page to crush.
        try {
            if(name.equals(cf.employee(name, password)) && password.equals(cf.employee(name, password))){
                session.setAttribute("customer", cf.employee(name, password));
                response.sendRedirect("success.jsp");
                System.out.println("Unable to retrieve customer!");
//                ex.printStackTrace();
            }
            else if(name.equals(cf.employee(name, password)) || password.equals(cf.employee(name, password))){
                request.setAttribute("loginfailed", "invalid email");
                response.sendRedirect("invalidLogin.jsp");    
            }
        } catch (StorageException ex){           
            System.out.println("error" + ex +"!");
                request.setAttribute("loginfailed","ExceptionsThrown");
                request.getRequestDispatcher("invalidLogin.jsp");
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        
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
