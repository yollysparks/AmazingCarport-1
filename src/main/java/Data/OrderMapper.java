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
public  Order getOrderByCustomerID(int customerid)throws SQLException{
       
           String querry =("SELECT * FROM carport.order WHERE `customerid` = '"+ customerid +"';");
           Order order =null;
        try {
            con = Connector.getConnection();
            ResultSet res = Connector.doQuery(querry);
            if(!res.next());
            int idOrder = res.getInt("idOrder");
            int payment = res.getInt("payment");
            String date = res.getString("date");
                      
            order = new Order(idOrder,payment,date,customerid);
            return order;                
          } catch (SQLException e) {
             System.out.println(e.getMessage());
          } finally {
             if(con != null){
                try {
                    con.close();
                  }catch (SQLException ex) {
                }
            }
        }
      return order;  
    }
  }