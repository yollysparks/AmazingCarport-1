/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.Facades.Carportfacade;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Jack
 */
import Business.Facades.ExceptionsThrown;
import java.io.PrintWriter;
public class CarportInput extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
    
    /*
    This process calculates all the needed parts and their total price
    and then puts then as session objects, so that they would be used later.
    */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        int width = Integer.parseInt(request.getParameter("width"));
        int length = Integer.parseInt(request.getParameter("length"));
        
        try{
        //CarportCalculator calculator = new CarportCalculator(width, length, true);
        Carportfacade cf = new Carportfacade(width, length,true); 
        HttpSession session = request.getSession();
         session.setAttribute("price", cf.price(width,length));
         session.setAttribute("draw", cf.Draw(width,length));
//         session.setAttribute("order",cf.Order());   
//        session.setAttribute("sideDraw",svg.drawSide());
//        session.setAttribute("topDraw", svg.getTop());
//        session.setAttribute("finalPrice", calculator.calculatePrice());
//        session.setAttribute("numberOfParts", calculator.calculateAllParts());
        response.sendRedirect("CarportPriceAndScetch.jsp");
        }
        catch (Exception ex ) {
         PrintWriter out = response.getWriter();    
             request.setAttribute("an error occured","error");
             request.getRequestDispatcher("CarportInput.jsp");
        
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
