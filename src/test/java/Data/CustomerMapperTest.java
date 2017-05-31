/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Business.DomainModel.Customer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felesiah
 */
public class CustomerMapperTest {
    
  CustomerMapper cm;
  
 @Before
    public void setUp() throws Exception {
        cm = new CustomerMapper();
    }
  
    /**
     * Test of getCustomerByID method, of class CustomerMapper.
     */
    @Test
    public void testGetCustomerByID() throws Exception {
        System.out.println("getCustomerByID");
        Customer c = cm.getCustomerByID(5);
        assertTrue("Get customer failed", c.getId() == 5);
       
    }

    /**
     * Test of getEmail method, of class CustomerMapper.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetEmail() throws Exception {
        System.out.println("getEmail");
        Customer c = cm.getEmail("test");
        assertTrue("Get Customer failed", "test".equals(c.getEmail()));
       
    }

    /**
     * Test of createCustomer method, of class CustomerMapper.
     * @throws java.lang.Exception
     */
    @Test
    public void testCreateCustomer() throws Exception {
        System.out.println("createCustomer");
        String email = "y";
        String password = "yolly";
        String firstName = "yolly";
        String lastName = "yolly";
        String address = "yolly";
        String zip = "yolly";
        String phone = "yolly";
        CustomerMapper instance = new CustomerMapper();
        instance.createCustomer(email, password, firstName, lastName, address, zip, phone);
        
    }
    
}
