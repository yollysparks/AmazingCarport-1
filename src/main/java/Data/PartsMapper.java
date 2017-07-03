/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Business.DomainModel.Parts;
import Business.Facades.ExceptionsThrown;
import com.mysql.cj.api.Session;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author felesiah
 */
public class PartsMapper {
    
    Connection con = null;
    ExceptionsThrown e = new ExceptionsThrown();
    public  Parts getParts(int PartId)throws Exception{
           
        try {
            con = Connector.getConnection();
            ResultSet res = Connector.doQuery("SELECT * FROM carport.carportitemsprice WHERE `ItemID` = '"+ PartId +"';");
            if(!res.next()) throw new Exception("Empty ResultSet!");
            int itemid = res.getInt("ItemID");
            String name = res.getString("Name");
            int length = res.getInt("Length");
             int ammount = res.getInt("Ammount");
           
            Parts parts = new Parts(itemid, name,length,ammount);
                        return parts;
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
   
   public Parts retrieveParts() throws SQLException, ExceptionsThrown{

            String querry=("select * from carportitemsprice;" );
            Parts part = null;
            try{
            con= Connector.getConnection();          
            ResultSet res = Connector.doQuery(querry);
            if(!res.next());
          int  itemid = res.getInt(1);
          String  name = res.getString(2);
          int  length = res.getInt(3);
          int  ammount = res.getInt(4);
           
             part = new Parts(itemid, name,length,ammount);
             return part;
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
     return part; 
  }
     
        
    
//        public List <Parts> partslist ()throws SQLException {
//
//		Connection dbConnection = null;
//		PreparedStatement preparedStatement = null;
//
//		String selectSQL = "SELECT * FROM list,carport.order where list.id = ? and carport.order.customerid=list.customerid;";
//                
//		Parts parts = null;
//                try{
//			dbConnection = Connector.getConnection();
//			preparedStatement = dbConnection.prepareStatement(selectSQL);
//			preparedStatement.setInt(1, 1001);
//
//			// execute select SQL stetement
//			ResultSet rs = preparedStatement.executeQuery();
//                  
//			while (!rs.next()) {
//
//				int item = rs.getInt(1);
//                                String name = rs.getString(5);
//				int length = rs.getInt(2);
//				int ammount = rs.getInt(3);
//                             
//                        
//			    parts = new Parts(item,name,length,ammount);
//                             return (List<Parts>) parts;
//                        }
//                        
//		} catch (SQLException e) {
//
//			System.out.println(e.getMessage());
//
//		} finally {
//
//			if (preparedStatement != null) {
//				preparedStatement.close();
//			}
//
//			if (dbConnection != null) {
//				dbConnection.close();
//			}
//
//		  }
//        return  (List<Parts>) parts;
//	}
        
      
  }

