
import Business.DomainModel.Order;
import Business.Facades.Customerfacade;
import Business.Facades.ExceptionsThrown;
import Data.Connector;
import Data.CustomerMapper;
import Data.OrderMapper;
import Data.PartsMapper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felesiah
 */
public class testing {
    public static void main(String[] args) throws SQLException, ExceptionsThrown, Exception {
        PartsMapper pm = new PartsMapper();
        OrderMapper om = new OrderMapper();
        Customerfacade cm = new Customerfacade();
        String password = null;
        String email = null;
        Connection con = null;
         String querry =("SELECT * FROM carport.order;");
             ResultSet res = null;
             Order order = null;
        try{
            con= Connector.getConnection();          
            res = Connector.doQuery(querry);
            
            if(res.next()){
            int idOrder = res.getInt("id");
            int payment = res.getInt("payment");
            String date = res.getString("date");
            int  customerid = res.getInt(4);          
            order = new Order(idOrder,payment,date,customerid);
                System.out.println("id: "+idOrder);
                System.out.println("payment: "+ payment);
                System.out.println("date: "+date);
                System.out.println("customerid: "+customerid);
            }                
         cm.customer(email, password);
            System.out.println("user"+cm.customer(email, password));
            ;
             pm.getList();
            System.out.println("fetching parts"+ pm.getList());
        
    }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
}
    }
}