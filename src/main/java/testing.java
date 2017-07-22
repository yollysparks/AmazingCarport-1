
import Business.DomainModel.Employee;
import Business.DomainModel.Order;
import Business.Facades.Customerfacade;
import Business.Exceptions.ExceptionsThrown;
import Data.Connector;
import Data.CustomerMapper;
import Data.EmployeeMapper;
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
        EmployeeMapper em = new EmployeeMapper();
        String password = null;
        String email = null;
        String name = "claus";
        Connection con = null;
         String querry =("SELECT * FROM carport.order;");
         String querry2 =("SELECT * FROM salesRep WHERE `name` = '"+ name +"';");
             ResultSet res = null;
             Order order = null;
             Employee employee = null;
//        try{
//            con= Connector.getConnection();          
//            res = Connector.doQuery(querry);
//            
//            if(res.next()){
//            int idOrder = res.getInt("id");
//            int payment = res.getInt("payment");
//            String date = res.getString("date");
//            int  customerid = res.getInt(4);          
//            order = new Order(idOrder,payment,date,customerid);
//                System.out.println("id: "+idOrder);
//                System.out.println("payment: "+ payment);
//                System.out.println("date: "+date);
//                System.out.println("customerid: "+customerid);
//            }                
//            cm.customer(email, password);
//            System.out.println("user"+cm.customer(email, password));
//             pm.getList();
//            System.out.println("fetching parts"+ pm.getList());
//            em.getEmployeeByName(name);
//            System.out.println("getting employee"+em.getEmployeeByName(name));
        try {
            con = Connector.getConnection();
             res = Connector.doQuery(querry2);
            if(res.next()){
            int id = res.getInt(1);
//          String name =res.getString(2);
            email = res.getString(3); 
          
            password = res.getString(4);
            int phone = res.getInt(5);
            int customerid = res.getInt(6);
             employee = new Employee(id,email,name,password, phone,customerid);
                System.out.println("id:"+id); 
                System.out.println("email"+email);
                System.out.println("name"+ name); 
                System.out.println("password"+password); 
                System.out.println("phone"+phone); 
                System.out.println("customerid"+customerid); 
                
            }
                    
        }catch (SQLException e) {
            throw new Exception("Database exception:\n"+e.getMessage()+"!");
    }
            //Handle errors for JDBC     
    }
   }
