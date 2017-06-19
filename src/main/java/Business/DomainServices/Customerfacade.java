/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DomainServices;
import Data.CustomerMapper;


/**
 *
 * @author felesiah
 */
public class Customerfacade {
CustomerMapper cm= new CustomerMapper();

  
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
