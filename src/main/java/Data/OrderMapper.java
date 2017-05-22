/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Business.DomainModel.Order;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author felesiah
 */
public class OrderMapper {
        
public static Order getOrderByID(int id)throws Exception{
           Connection con = null;
        try {
            con = Connector.getConnection();
            ResultSet res = Connector.doQuery("SELECT * FROM carport.order WHERE `idOrder` = '"+ id +"';");
            if(!res.next()) throw new Exception("Empty ResultSet!");
            int idOrder = res.getInt("idOrder");
            int payment = res.getInt("payment");
            String date = res.getString("date");
            int customerid = res.getInt("CustomerId");
            
            Order order = new Order(idOrder,payment,date,customerid);
                        return order;
                        
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new Exception("Database exception:\n"+e.getMessage()+"!");
        } finally {
            if(con != null){
                try {
                    con.close();
                }catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
  
}