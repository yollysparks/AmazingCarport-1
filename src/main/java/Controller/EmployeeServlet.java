/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.DomainModel.Employee;
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
            PrintWriter out = response.getWriter();
            HttpSession session = request.getSession();
           
            EmployeeMapper em = new EmployeeMapper(); 
            String name= request.getParameter("name");  
            String password = request.getParameter("password"); 
            Employee emp = em.getEmployeeByName(name);
            
        try{ 
            em.getEmployeeByName(name);
            em.getEmployeeByPassword(password);
            out.print(em.getEmployeeByName(name));
            out.print(em.getEmployeeByPassword(password));
            
            if(name.equals(em.getEmployeeByName(name))&&password.equals(em.getEmployeeByPassword(password))){
                session.setAttribute("Login",em.getEmployeeByName(name));
               response.sendRedirect("order.jsp");
            }else if(!name.equals(em.getEmployeeByName(name))|| password.equals(em.getEmployeeByPassword(password))){
                request.setAttribute("Loginfailed",em.getEmployeeByName(name));
                response.sendRedirect("employee.jsp");
            }
          
        }catch (Exception ex) {              
                out.println("error" + ex +"!");
                request.setAttribute("loginfailed","ExceptionsThrown");
                request.getRequestDispatcher("Login.jsp").forward(request, response); //this is where an exception is handled
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(EmployeeServlet.class.getName()).log(Level.SEVERE, null, ex);
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
