/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Business.DomainModel.Order;
import Business.DomainServices.ExceptionsThrown;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author felesiah
 */
public class OrderMapper {
      Connection con = null;   
public  Order getOrderByCustomerID(int customerid)throws Exception{
           
           Order order =null;
        try {
            con = Connector.getConnection();
            ResultSet res = Connector.doQuery("SELECT * FROM carport.order WHERE `customerid` = '"+ customerid +"';");
            if(!res.next()) throw new Exception("Empty ResultSet!");
            int idOrder = res.getInt("idOrder");
            int payment = res.getInt("payment");
            String date = res.getString("date");
                      
            order = new Order(idOrder,payment,date,customerid);
                        return order;
                        
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            throw new ExceptionsThrown("Database exception:\n"+e.getMessage()+"!");
        } finally {
            if(con != null){
                try {
                    con.close();
                }catch (SQLException ex) {
                }
            }
        }
        
    }
  
}