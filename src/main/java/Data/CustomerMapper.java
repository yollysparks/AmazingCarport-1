/*
 *  CRUD data mapper for the customer entity
 */
package Data;

import Business.DomainModel.Customer;
import Business.Exceptions.EmailAlreadyExsistsException;
import Business.Exceptions.ExceptionsThrown;
import Business.Exceptions.StorageException;
import Business.Exceptions.InvalidCredentialsException;
import Business.Exceptions.UnsafePasswordException;
import Business.Exceptions.WrongEmailFormatException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import org.apache.commons.validator.EmailValidator;

/**
 *
 * @author felesiah
 */
public class CustomerMapper {
    
    Connection con;

    public CustomerMapper(Connection con) {
        this.con = con;
    }
    
    
    public void customerSignup(String email, String password, String firstName, String lastName, String address, String phone) throws UnsafePasswordException, InvalidCredentialsException, StorageException, EmailAlreadyExsistsException, WrongEmailFormatException {
        String str = "INSERT INTO carport.customer(email, password, firstName, lastName, address, phone) VALUES (?,?,?,?,?,?);";
        try (final PreparedStatement customerSignup = con.prepareStatement(str)) {
            con.setAutoCommit(false);
            if (!emailExists(email)) {
                customerSignup.setString(1, email);
            } else {
                throw new EmailAlreadyExsistsException();
            }
            customerSignup.setString(2, password);
            customerSignup.setString(3, firstName);
            customerSignup.setString(4, lastName);
            customerSignup.setString(5, address);
            customerSignup.setString(6, phone);
            boolean valid = EmailValidator.getInstance().isValid(email);
            if (!valid) {
                throw new WrongEmailFormatException();
            }
            if (password.length() < 5) {
                throw new UnsafePasswordException();
            }
            int rowAffected = customerSignup.executeUpdate();
            if (rowAffected == 1) {
                con.commit();
            } else {
                con.rollback();
            }
        } catch (SQLException e) {
            throw new StorageException();
        } 
    }
     
    
public Customer customerLogin(String email, String password) throws StorageException, InvalidCredentialsException {
        String getCustomerString = "SELECT * FROM carport.customer WHERE email = ? AND password = ? ;";
        try (final PreparedStatement getCustomer = con.prepareStatement(getCustomerString)) {
            Customer customer = null;
            getCustomer.setString(1, email);
            getCustomer.setString(2, password);
            try (final ResultSet rs = getCustomer.executeQuery()) {
                if (rs.next()) {
                    customer = new Customer(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                } else {
                    throw new InvalidCredentialsException();
                }
            }
            return customer;
        } catch (SQLException ex) {
            throw new StorageException();
        } 
    }
/*public  Customer getCustomerByPassword(String password)throws Exception{
           Connection con = null;
           Customer customer = null;
        try {
            con = Connector.getConnection();
            ResultSet res = Connector.doQuery("SELECT * FROM carport.customer WHERE `password` = '"+ password +"';");
            if(res.next()){
            int id = res.getInt("customerid");
            String email = res.getString("email");
            String firstName = res.getString("firstName");
            String lastName = res.getString("lastName");
            String address = res.getString("address");
            String zip = res.getString("zip");
            String phone = res.getString("phone");
             customer = new Customer(id, email, password, firstName, lastName, address, zip, phone);
                
            }
                    
        } catch (SQLException e) {
            throw new Exception("Database exception:\n"+e.getMessage()+"!");
        } finally {
            if(con != null){
                try {
                    con.close();
                }catch (SQLException ex) {
                    throw new invalidPasswordException();
                }
            }
        }
    return customer;
    }
 
   public  Customer getEmail(String email)throws Exception{
            Connection con = null;
            ResultSet res = null;
            Statement st= null;
            Customer customer = null;
            String querry ="SELECT * FROM carport.customer WHERE `email` = '"+ email +"';";
        try {
           con= Connector.getConnection();          
           res = Connector.doQuery(querry);
            if(res.next()){
            int id = res.getInt("customerid");
            String password = res.getString("password");
            String firstName = res.getString("firstName");
            String lastName = res.getString("lastName");
            String address = res.getString("address");
            String zip = res.getString("zip");
            String phone = res.getString("phone");
            // customer = new Customer(id, email, password, firstName, lastName, address, zip, phone);
            } 
        } catch (SQLException e) {    
            throw new ExceptionsThrown();
        } finally {
            if(con != null){
                try {
                    con.close();
                }catch (SQLException ex) {
                    throw new StorageException();
                }
            }
        }
    return customer;
  }
   
   public void createCustomer(String email, String password, String firstName, String lastName,
           String address, String zip, String phone) throws Exception 
        {
            Connection con = null;
            PreparedStatement preparedStatement = null;

            String insertTableSQL = "INSERT INTO customer"
		+ "(email, password, firstName, lastName, address, zip, phone) VALUES"
		+ "(?,?,?,?,?,?,?)";
       try{
                con = Connector.getConnection();
                preparedStatement = con.prepareStatement(insertTableSQL);
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, password);
                preparedStatement.setString(3, firstName);
                preparedStatement.setString(4, lastName);
                preparedStatement.setString(5, address);
                preparedStatement.setString(6, zip);
                preparedStatement.setString(7, phone);
                // execute insert SQL stetement
                preparedStatement.executeUpdate();
       }  catch (SQLException e) {
                System.out.println(e.getMessage());
                } finally {
            if(con != null){
                try {
                    con.close();
                }catch (SQLException ex) {
                    throw new StorageException();
                }
            }
        }
   }

    private boolean emailExists(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}  
