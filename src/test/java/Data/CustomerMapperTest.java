/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


import Business.Exceptions.EmailAlreadyExsistsException;
import Business.Exceptions.InvalidCredentialsException;
import Business.Exceptions.StorageException;
import Business.Exceptions.UnsafePasswordException;
import Business.Exceptions.WrongEmailFormatException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomerMapperTest {

    private Connection CustomerfogTest;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String ID = "root";
    private static final String PW = "casp6672";
    private static final String DBNAME = "CarportTest";
    // private static final String HOST = "188.166.91.15"; <-- For later use
    private CustomerMapper cm;

    public CustomerMapperTest() {

    }

    @Before
    public void setUp() {
        try {
            String url = String.format("jdbc:mysql://%s:3306/%s", DBNAME); // <-- Insert host later before DBNAME
            Class.forName(DRIVER);
            CustomerfogTest = DriverManager.getConnection(url, ID, PW);
            try (Statement stmt = CustomerfogTest.createStatement()) {
                stmt.execute("DROP TABLE IF EXISTS Customer");
                stmt.execute("CREATE TABLE Customer LIKE CustomerCopyTest");
                stmt.execute("INSERT INTO Customer SELECT * FROM CustomerCopyTest");
            }
            cm = new CustomerMapper(CustomerfogTest);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Could not open connection to database: " + e.getMessage());
        }
    }
    
    @After
    public void tearDown() {
        try {
            CustomerfogTest.close();
        } catch (SQLException ex) {
            System.out.println("Failed to close fogTest - " + ex.getMessage());
        }
    }

    @Test(expected = WrongEmailFormatException.class)
    public void customerSignupWrongEmailFormat() throws UnsafePasswordException, WrongEmailFormatException, StorageException, EmailAlreadyExsistsException, InvalidCredentialsException {
        String email = "test@test.comadsgds";
        String password = "1234567";
        String firstName = "EmailFormatTester";
        String lastName = "EmailFormatTester";
        String address = "Testingstreet 007";
        String phone = "99999999";
        cm.customerSignup(email, password, firstName, lastName, address, phone);
    }

    @Test(expected = UnsafePasswordException.class)
    public void customerSignupUnsafePassword() throws UnsafePasswordException, WrongEmailFormatException, StorageException, EmailAlreadyExsistsException, InvalidCredentialsException {
        String email = "test@test.com";
        String password = "1234";
        String firstName = "UnsafePasswordTester";
        String lastName = "UnsafePasswordTester";
        String address = "Testingstreet 007";
        String phone = "99999999";
        cm.customerSignup(email, password, firstName, lastName, address, phone);
    }

    @Test(expected = EmailAlreadyExsistsException.class)
    public void customerSignupEmailAlreadyInUse() throws UnsafePasswordException, WrongEmailFormatException, StorageException, EmailAlreadyExsistsException, InvalidCredentialsException {
        String email = "casper@mail.com"; // Needs to be inserted into DB before test can be executed 100%
        String password = "1234567";
        String firstName = "EmailExsistingTester";
        String lastName = "EmailExsistingTester";
        String address = "Testingstreet 007";
        String phone = "99999999";
        cm.customerSignup(email, password, firstName, lastName, address, phone);
    }
}
    
//    @Test (expected = WrongCustomerIDException.class)
//    public void retrieveNonExistingCustomerDetails() throws UnsafePasswordException, WrongEmailFormatException, StorageException, EmailAlreadyExsistsException, InvalidCredentialsException { {
//        cm = new CustomerMapper(fogTest);
//        int idCustomer = 500;
//        cm.retrieveCustomerDetails(idCustomer);
//    }
    
///*
//public class CustomerMapperTest {
//    
//  CustomerMapper cm;
//  
// @Before
//    public void setUp() throws Exception {
//        cm = new CustomerMapper();
//    }
//  
//    /**
//     * Test of getCustomerByID method, of class CustomerMapper.
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testGetCustomerBypassword() throws Exception {
//        System.out.println("getCustomerByID");
//        Customer c = cm.getCustomerByPassword("123456");
//        assertTrue("Get customer failed", c.getPassword().equals("123456"));
//     
//    }
//
//    /**
//     * Test of getEmail method, of class CustomerMapper.
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testGetEmail() throws Exception {
//        System.out.println("getEmail");
//        Customer c = cm.getEmail("test@gmail.com");
//        assertTrue("Get Customer failed", "test@gmail.com".equals(c.getEmail()));
//       
//    }
//
//    /**
//     * Test of createCustomer method, of class CustomerMapper.
//     * @throws java.lang.Exception
//     */
//    @Test
//    @SuppressWarnings("IncompatibleEquals")
//    public void testCreateCustomer() throws Exception {
//        System.out.println("createCustomer");
//        String email = "yolanda@gmail.com";
//        String password = "testing";
//        String firstName = "yolanda";
//        String lastName = "Krøier";
//        String address = "Gentofte";
//        String zip = "4567";
//        String phone = "1234567";
//        CustomerMapper instance = new CustomerMapper();
//        instance.createCustomer(email, password, firstName, lastName, address, zip, phone);
//        assertFalse("create customer fail",instance.equals("yolanda@gmail.com,testing,yolanda,Krøier,Gentofte,4567,1234567"));
//    }
//    
//}
///*