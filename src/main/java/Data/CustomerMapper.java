/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Business.DomainModel.Customer;
import Business.Exceptions.EmailAlreadyExsistsException;
import Business.Exceptions.StorageException;
import Business.Exceptions.InvalidCredentialsException;
import Business.Exceptions.UnsafePasswordException;
import Business.Exceptions.WrongEmailFormatException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
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
    
    public boolean emailExists(String email) throws StorageException {
        String str = "SELECT email FROM Customer;";
        try (final PreparedStatement st = con.prepareStatement(str)) {
            boolean emailExists = false;
            try (final ResultSet rs = st.executeQuery()) {
                String emailCounter;
                while (rs.next()) {
                    emailCounter = rs.getString("email");
                    if (emailCounter.equals(email)) {
                        emailExists = true;
                    }
                }
            }
            return emailExists;
        } catch (SQLException ex) {
            throw new StorageException();
        } 
    }

    public void setCustomerId(Customer customer) throws StorageException {
        String getCustomerIdString = "SELECT idCustomer FROM Customer WHERE email = ? AND password = ? ;";
        try (final PreparedStatement getCustomerId = con.prepareStatement(getCustomerIdString)) {
            int id = 0;
            getCustomerId.setString(1, customer.getEmail());
            getCustomerId.setString(2, customer.getPassword());
            try (final ResultSet rs = getCustomerId.executeQuery()) {
                if (rs.next()) {
                    id = rs.getInt(1);
                }
                customer.setId_customer(id);
            }
        } catch (SQLException ex) {
            throw new StorageException();
        } 
    }
    public void updateCustomerInformation(Customer updatedCustomer, Customer oldCustomer) throws UnsafePasswordException, WrongEmailFormatException, StorageException, UnsafePasswordException, EmailAlreadyExsistsException {
        String str = "UPDATE Customer SET email = ?, password = ?, firstName = ?, lastName = ?, address = ?, phone = ? WHERE idCustomer = ?;";
        try (final PreparedStatement updateCustomerInformation = con.prepareStatement(str)) {
            con.setAutoCommit(false);
            if (emailExists(updatedCustomer.getEmail()) && updatedCustomer.getEmail().equals(oldCustomer.getEmail())) {
                updateCustomerInformation.setString(1, oldCustomer.getEmail());
            } else if (emailExists(updatedCustomer.getEmail()) && !updatedCustomer.getEmail().equals(oldCustomer.getEmail())) {
                throw new EmailAlreadyExsistsException();
            } else {
                updateCustomerInformation.setString(1, updatedCustomer.getEmail());
            }
            updateCustomerInformation.setString(2, updatedCustomer.getPassword());
            updateCustomerInformation.setString(3, updatedCustomer.getFirstName());
            updateCustomerInformation.setString(4, updatedCustomer.getLastName());
            updateCustomerInformation.setString(5, updatedCustomer.getAddress());
            updateCustomerInformation.setString(6, updatedCustomer.getPhone());
            updateCustomerInformation.setInt(7, oldCustomer.getId_customer());
            boolean valid = org.apache.commons.validator.routines.EmailValidator.getInstance().isValid(updatedCustomer.getEmail());
            if (!valid) {
                throw new WrongEmailFormatException();
            }
            if (updatedCustomer.getPassword().length() < 7) {
                throw new UnsafePasswordException();
            }
            int rowAffected = updateCustomerInformation.executeUpdate();
            if (rowAffected == 1) {
                con.commit();
            } else {
                con.rollback();
            }
        } catch (SQLException e) {
            throw new StorageException();
        } 
    }
}


