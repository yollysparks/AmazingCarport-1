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
@WebServlet(name = "ReceiptServlet", urlPatterns = {"/ReceiptServlet"})
public class ReceiptServlet extends HttpServlet {

   
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        OrderMapper om = new OrderMapper();
        Order order = null;
        
        try {
            order = om.getOrderByCustomerID(1);
            out.println(order.toString());
           HttpSession session = request.getSession(); 
            session.setAttribute("Order", om.getOrderByCustomerID(1));
            request.getRequestDispatcher("receipt.jsp"); 
            
        } catch (Exception ex) {
            Logger.getLogger(PartsServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        processRequest(request, response);
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
         HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        OrderMapper om = new OrderMapper();
        Order order = null;
        
        try {
            order = om.getOrderByCustomerID(1);
            out.println(order.toString());
            session.setAttribute("Order", om.getOrderByCustomerID(1));
            request.getRequestDispatcher("receipt.jsp"); 
            
        } catch (Exception ex) {
            Logger.getLogger(PartsServlet.class.getName()).log(Level.SEVERE, null, ex);
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
