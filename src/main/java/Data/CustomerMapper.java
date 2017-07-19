/*
 *  CRUD data mapper for the customer entity
 */
package Data;

import Business.DomainModel.Customer;
import Business.Facades.ExceptionsThrown;
import Business.Facades.invalidPasswordException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author felesiah
 */
public class CustomerMapper {
     
public  Customer getCustomerByPassword(String password)throws Exception{
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
            customer = new Customer(id, email, password, firstName, lastName, address, zip, phone);
            } 
        } catch (SQLException e) {    
            throw new ExceptionsThrown();
        } finally {
            if(con != null){
                try {
                    con.close();
                }catch (SQLException ex) {
                    throw new ExceptionsThrown();
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
                    throw new ExceptionsThrown();
                }
            }
        }
   }
}  
