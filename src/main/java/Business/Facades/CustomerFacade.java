/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Facades;
import Business.DomainModel.Customer;
import Business.Exceptions.EmailAlreadyExsistsException;
import Business.Exceptions.InvalidCredentialsException;
import Business.Exceptions.StorageException;
import Business.Exceptions.UnsafePasswordException;
import Business.Exceptions.WrongEmailFormatException;
import Data.Connector;
import Data.CustomerMapper;
import java.sql.Connection;
import java.sql.SQLException;



/**
 *
 * @author Casper
 */
public class CustomerFacade {
    
    private static CustomerFacade facade;
    
    public static CustomerFacade getFacade() {
        if (facade == null) {
            facade = new CustomerFacade();
        }
        return facade;
    }
    
    public static void setFacade(CustomerFacade newFacade) {
        facade = newFacade;
    }
       
    public Customer getCustomer(String email, String password) throws InvalidCredentialsException, StorageException, SQLException {
        Connection con = Connector.getConnection();
        CustomerMapper cm = new CustomerMapper(con);
        return cm.customerLogin(email, password);
    }

    public void createCustomer(String email, String password, String firstName, String lastName, String address, String phone) throws WrongEmailFormatException, UnsafePasswordException, EmailAlreadyExsistsException, StorageException, InvalidCredentialsException, SQLException {
        Connection con = Connector.getConnection();
        CustomerMapper cm = new CustomerMapper(con);
        cm.customerSignup(email, password, firstName, lastName, address, phone);
    }
}
    
    
    
    /*CustomerMapper cm= new CustomerMapper();

  
    public CustomerMapper newCustomer(String email,String password,String firstName,String lastName,String address,String zip,String phone) throws Exception{   
    cm.createCustomer(email, password, firstName, lastName, address, zip, phone);   
    return cm;
 } 
   
    public String customer(String email,String password) throws Exception{
    cm.getCustomerByPassword(password);
    cm.getEmail(email);
    return cm.toString();
 }
}
*/