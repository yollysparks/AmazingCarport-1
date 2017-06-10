/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.DomainModel.Customer;
import Data.CustomerMapper;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    
    @Override
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String email = request.getParameter("email");  
        String password = request.getParameter("password"); 
        
        Customer customer = null;
         try {
                customer =  CustomerMapper.getEmail(email);
                System.out.println(customer.toString());
            } catch (Exception ex) {
                System.out.println("Unable to retrieve customer!");
                ex.printStackTrace();
            }
         
         if( email.equals(customer.getEmail()) || password.equals(customer.getPassword())){
             session.setAttribute("customer", customer.getEmail());
             response.sendRedirect("success.jsp");
         }
         else{
             request.setAttribute("login", "failed");
             response.sendRedirect("Login.jsp");
         }
  
        
    }  

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
