/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.DomainModel.Customer;
import Business.DomainModel.Order;
import Business.DomainServices.CarportCalculator;
import Data.OrderMapper;
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
@WebServlet(name = "ReceiptServlet", urlPatterns = {"/ReceiptServlet"})
public class ReceiptServlet extends HttpServlet {

   
  

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
        doPost(request, response);
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
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
         
        
        Order order = null;
        CarportCalculator calc = null;
        
         try {
                order =  OrderMapper.getOrderByID(1);
                session.setAttribute("orderid", order.getIdOrder());
                session.setAttribute("date",order.getDate());
                session.setAttribute("finalPrice",calc.calculatePrice());
                session.setAttribute("customerId",order.getCustomerId());
                response.sendRedirect("Receiptfog.jsp");
                
            } catch (Exception ex) {
                out.println("Unable to retrieve customer!");
                ex.printStackTrace();
                System.exit(0);
            }
//         
//         if( email.equals(customer.) || password.equals(customer.getPassword())){
//             session.setAttribute("customer", customer);
//             response.sendRedirect("success.jsp");
//         }
//         else{
//             request.setAttribute("login", "failed");
//             response.sendRedirect("index.jsp");
//         }
//
        
//    }  
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
