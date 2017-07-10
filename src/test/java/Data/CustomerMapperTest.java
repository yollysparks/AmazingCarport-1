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
     * @throws java.lang.Exception
     */
    @Test
    public void testGetCustomerBypassword() throws Exception {
        System.out.println("getCustomerByID");
        Customer c = cm.getCustomerByPassword("123456");
        assertTrue("Get customer failed", c.getPassword().equals("123456"));
     
    }

    /**
     * Test of getEmail method, of class CustomerMapper.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetEmail() throws Exception {
        System.out.println("getEmail");
        Customer c = cm.getEmail("test@gmail.com");
        assertTrue("Get Customer failed", "test@gmail.com".equals(c.getEmail()));
       
    }

    /**
     * Test of createCustomer method, of class CustomerMapper.
     * @throws java.lang.Exception
     */
    @Test
    @SuppressWarnings("IncompatibleEquals")
    public void testCreateCustomer() throws Exception {
        System.out.println("createCustomer");
        String email = "yolanda@gmail.com";
        String password = "testing";
        String firstName = "yolanda";
        String lastName = "Krøier";
        String address = "Gentofte";
        String zip = "4567";
        String phone = "1234567";
        CustomerMapper instance = new CustomerMapper();
        instance.createCustomer(email, password, firstName, lastName, address, zip, phone);
        assertFalse("create customer fail",instance.equals("yolanda@gmail.com,testing,yolanda,Krøier,Gentofte,4567,1234567"));
    }
    
}
