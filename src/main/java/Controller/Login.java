/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.Facades.Customerfacade;
import Business.Facades.ExceptionsThrown;
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
        
        Customerfacade cf = new  Customerfacade();
         try {
             cf.customer(email, password);
               out.println(cf.customer(email, password));
               response.sendRedirect("success.jsp");
            } catch (Exception ex) {
                System.out.println("error" + ex +"!");
                request.setAttribute("loginfailed","ExceptionsThrown");
                request.getRequestDispatcher("invalidLogin.jsp").forward(request, response);   //this is where an exception is handled
            }                                                                                    //and the invalidLogin page is displayed
        try {
            if( email.equals(cf.customer(email, password)) && password.equals(cf.customer(email, password))){
                session.setAttribute("customer", cf.customer(email, password));
                response.sendRedirect("success.jsp");
                System.out.println("Unable to retrieve customer!");
//                ex.printStackTrace();
            }
            else if(email.equals(cf.customer(email, password)) || password.equals(cf.customer(email, password))){
                request.setAttribute("loginfailed", "invalid email");
                response.sendRedirect("success.jsp");    
            }
        } catch (Exception ex) {           
            System.out.println("error" + ex +"!");
                request.setAttribute("loginfailed","ExceptionsThrown");
                request.getRequestDispatcher("invalidLogin.jsp");
        }
  
        
    }  

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
