/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.DomainModel.Customer;
import Business.Exceptions.EmailAlreadyExsistsException;
import Business.Exceptions.InvalidCredentialsException;
import Business.Exceptions.StorageException;
import Business.Exceptions.UnsafePasswordException;
import Business.Exceptions.WrongEmailFormatException;
import Business.Facades.CustomerFacade;
import java.sql.SQLException;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author caspergrosslarsen
 */
public class ConsumerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, UnsafePasswordException, WrongEmailFormatException, EmailAlreadyExsistsException, StorageException, InvalidCredentialsException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        String formName = request.getParameter("formName");
        switch (formName) {
            case "CustomerRegistrationForm":
                customerRegister(request, response);
                break;
            case "CustomerLoginForm":
                customerLogin(request, session, response);
                break;
            
        }
    }
        
        private void customerLogin(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws ServletException, IOException, SQLException {
        try {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            Customer customer = CustomerFacade.getFacade().getCustomer(email, password);
            CustomerFacade.getFacade().setCustomerId(customer);
            session.setAttribute("currentCustomer", customer);
            request.getRequestDispatcher("LoggedIn.jsp").forward(request, response);
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
            request.setAttribute("Error", "errorMessageUserNotFound");
            request.getRequestDispatcher("loginCustomer.jsp").forward(request, response);
        } catch (StorageException ex) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
    
    }
        }
        
    private void customerRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, UnsafePasswordException, WrongEmailFormatException, EmailAlreadyExsistsException, StorageException, InvalidCredentialsException, SQLException {
        try {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            CustomerFacade.getFacade().createCustomer(email, password, firstName, lastName, address, phone);
            request.getRequestDispatcher("loginCustomer.jsp").forward(request, response);
        } catch (UnsafePasswordException ex) {
            System.out.println(ex.getMessage());
            request.setAttribute("Error", "UnsafePasswordException");
            request.setAttribute("email", request.getParameter("email"));
            request.setAttribute("firstName", request.getParameter("firstName"));
            request.setAttribute("lastName", request.getParameter("lastName"));
            request.setAttribute("address", request.getParameter("address"));
            request.setAttribute("phone", request.getParameter("phone"));
            request.getRequestDispatcher("regCustomer.jsp").forward(request, response);
        } catch (WrongEmailFormatException e) {
            System.out.println(e.getMessage());
            request.setAttribute("Error", "WrongEmailFormatException");
            request.getRequestDispatcher("regCustomer.jsp").forward(request, response);
        } catch (EmailAlreadyExsistsException ex) {
            System.out.println(ex.getMessage());
            request.setAttribute("Error", "EmailAlreadyExsistsException");
            request.getRequestDispatcher("regCustomer.jsp").forward(request, response);
        } catch (StorageException e) {
             request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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