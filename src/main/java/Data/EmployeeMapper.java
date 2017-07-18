/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


import Business.DomainModel.Employee;
import Business.Facades.ExceptionsThrown;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author felesiah
 */
public class EmployeeMapper {
    public  Employee getEmployeeByName(String name)throws Exception{
           Connection con = null;
           Employee employee = null;
        try {
            con = Connector.getConnection();
            ResultSet res = Connector.doQuery("SELECT * FROM salesRep WHERE `name` = '"+ name +"';");
            if(res.next()){
            int id = res.getInt(1);
            String email = res.getString(3);           
            String password = res.getString(4);
            int phone = res.getInt(5);
            int customerid = res.getInt(6);
             employee = new Employee(id,email,name,password, phone,customerid);
                
            }
                    
        } catch (SQLException e) {
            throw new Exception("Database exception:\n"+e.getMessage()+"!");
        } finally {
            if(con != null){
                try {
                    con.close();
                }catch (SQLException ex) {
                    throw new ExceptionsThrown();
                }
            }
        }
    return employee;
    }
     public  Employee getEmployeeByPassword(String pswd)throws Exception{
           Connection con = null;
           Employee employee = null;
        try {
            con = Connector.getConnection();
            ResultSet res = Connector.doQuery("SELECT * FROM salesRep WHERE `name` = '"+ pswd +"';");
            if(res.next()){
            int id = res.getInt(1);
            String email = res.getString(3);           
            String name = res.getString(4);
            int phone = res.getInt(5);
            int customerid = res.getInt(6);
             employee = new Employee(id,email,name,pswd, phone,customerid);
                
            }
                    
        } catch (SQLException e) {
            throw new Exception("Database exception:\n"+e.getMessage()+"!");
        } finally {
            if(con != null){
                try {
                    con.close();
                }catch (SQLException ex) {
                    throw new ExceptionsThrown();
                }
            }
        }
    return employee;
    }
}
