/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

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
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            throw new Exception("Database exception:\n"+ex.getMessage()+"!");
        } finally {
            if(con != null){
                try {
                    con.close();
                }catch (SQLException ex) {
                    throw new ExceptionsThrown("Error",ex);
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
     return part; 
  }   
   
    public ArrayList<Parts> listParts() throws SQLException, ExceptionsThrown{
        
        Statement st = con.createStatement();
        String sql = ("SELECT * FROM carportitemsprice;");
        ArrayList<Parts> partslist = new ArrayList<Parts>();
        Parts part = null;     
     try{
       ResultSet rs = st.executeQuery(sql); 
       while(rs.next()) { 
            int id = rs.getInt(1);
            String name =rs.getString(2);
            int length= rs.getInt(3);
            int ammount =rs.getInt(4);
            part= new Parts(id,name,length,ammount);
          }
      } catch (SQLException ex) {
              throw new ExceptionsThrown("Error",ex); 
        } finally {
	           if(con != null){
                     try {
                       con.close();
                     }catch (SQLException ex) {
                         throw new ExceptionsThrown("Error",ex);
                     }
		   }
               }
          return partslist;
      }
}
    