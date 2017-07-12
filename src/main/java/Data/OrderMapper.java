/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Business.DomainModel.Order;
import Business.DomainModel.Parts;
import Business.Facades.ExceptionsThrown;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author felesiah
 */
public class OrderMapper {
      Connection con = null;   
public  Order getOrderByCustomerID(int customerid)throws SQLException, ExceptionsThrown{
       
             String querry =("SELECT * FROM carport.order WHERE `customerid` = '"+ customerid +"';");
             ResultSet res = null;
             Order order = null;
            try{
            con= Connector.getConnection();          
            res = Connector.doQuery(querry);
            
            if(res.next()){
            int idOrder = res.getInt("id");
            int payment = res.getInt("payment");
            String date = res.getString("date");
                      
            order = new Order(idOrder,payment,date,customerid);
            }                
          } catch (SQLException e) {
             System.out.println(e.getMessage());
          } finally {
             if(con != null){
                try {
                    con.close();
                  }catch (SQLException ex) {
                     throw new ExceptionsThrown("Error",ex);
                }
            }
        }
      return order;  
    }
 public Order getOrders() throws SQLException, ExceptionsThrown{
            String querry=("SELECT * FROM carport.`order` join customer where customer.email = ´test@gmail.com´order by id ;");
            Order order = null;
            try{
            con= Connector.getConnection();          
            ResultSet res = Connector.doQuery(querry);
            
            if(res.next()){
            int idOrder = res.getInt(1);
            int payment = res.getInt(2);
            String date = res.getString(3);
            int  customerid = res.getInt(4);
            order = new Order(idOrder,payment,date,customerid); 
            return order;
            }
            }catch (SQLException ex) {
	       System.out.println(ex.getMessage());
		} finally {
	           if(con != null){
                     try {
                       con.close();
                     }catch (SQLException ex) {
                         throw new ExceptionsThrown("Error",ex);
                     }
		   }
               }
     return order; 
    } 
 public ArrayList<Order> getList() throws SQLException, ExceptionsThrown {
        ResultSet rs = null;
        Order order= null;
        ArrayList<Order> list = new ArrayList(); 
        String getOrders = "SELECT * FROM carport.`order`;";
       try{      
        con= Connector.getConnection();          
        rs = Connector.doQuery(getOrders);
        
         while(rs.next()){
            int idOrder = rs.getInt(1);
            int payment = rs.getInt(2);
            String date = rs.getString(3);
            int  customerid = rs.getInt(4);
           
            order = new Order(idOrder,payment,date,customerid);
            list.add(order);
            }
          
        } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           } finally {
	           if(con != null){
                     try {
                       con.close();
                     }catch (SQLException ex) {
                         throw new ExceptionsThrown("Error",ex);
                     }
		   }
        }
        return list;
    }
}