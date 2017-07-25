package Controller;

import Business.Exceptions.InvalidCredentialsException;
import Business.DomainModel.Customer;
import Business.DomainModel.Order;
import Business.Exceptions.EmailAlreadyExsistsException;
import Business.Exceptions.StorageException;
import Business.Exceptions.UnsafePasswordException;
import Business.Exceptions.WrongEmailFormatException;
import Business.Facades.CustomerFacade;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author caspergrosslarsen
 */
public class CustomerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, WrongEmailFormatException, UnsafePasswordException, EmailAlreadyExsistsException, StorageException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("currentCustomer");
        String formName = request.getParameter("formName");
        switch (formName) {
            case "CustomerInformation":
                customerGetInfo(request, session, response);
                break;
        }
    }
    
      private void customerGetInfo(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws IOException, ServletException, WrongEmailFormatException, UnsafePasswordException, EmailAlreadyExsistsException, StorageException {
        try {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            Customer updatedCustomer = new Customer(email, password, firstName, lastName, address, phone);
            Customer oldCustomer = (Customer) session.getAttribute("currentCustomer");
            CustomerFacade.getFacade().updateCustomerInformation(updatedCustomer, oldCustomer);
            session.setAttribute("currentCustomer", updatedCustomer);
            request.getRequestDispatcher("loggedInHome.jsp").forward(request, response);
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
            request.setAttribute("Error", "errorMessageEmailAlreadyExists");
            request.getRequestDispatcher("customerInfo.jsp").forward(request, response);
        } catch (UnsafePasswordException ex) {
            System.out.println(ex.getMessage());
            request.setAttribute("Error", "InsecurePasswordException");
            request.setAttribute("email", request.getParameter("email"));
            request.setAttribute("firstName", request.getParameter("firstName"));
            request.setAttribute("lastName", request.getParameter("lastName"));
            request.setAttribute("address", request.getParameter("address"));
            request.setAttribute("phone", request.getParameter("phone"));
            request.getRequestDispatcher("customerInfo.jsp").forward(request, response);
        } catch (WrongEmailFormatException e) {
            System.out.println(e.getMessage());
            request.setAttribute("Error", "IncorrectEmailFormattingException");
            request.getRequestDispatcher("customerInfo.jsp").forward(request, response);
        } catch (EmailAlreadyExsistsException ex) {
            System.out.println(ex.getMessage());
            request.setAttribute("Error", "EmailAlreadyInUseException");
            request.getRequestDispatcher("customerInfo.jsp").forward(request, response);
        } catch (StorageException e) {
             request.getRequestDispatcher("error.jsp").forward(request, response);
        
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
        } catch (WrongEmailFormatException ex) {
            Logger.getLogger(CustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsafePasswordException ex) {
            Logger.getLogger(CustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EmailAlreadyExsistsException ex) {
            Logger.getLogger(CustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (StorageException ex) {
            Logger.getLogger(CustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (WrongEmailFormatException ex) {
            Logger.getLogger(CustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsafePasswordException ex) {
            Logger.getLogger(CustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EmailAlreadyExsistsException ex) {
            Logger.getLogger(CustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (StorageException ex) {
            Logger.getLogger(CustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
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

