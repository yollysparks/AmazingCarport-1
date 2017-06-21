/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Facades;



import Data.Connector;
import Data.PartsMapper;
import java.sql.Connection;

/**
 *
 * @author felesiah
 */
public class Partsfacade {
   
     PartsMapper pm = new PartsMapper();
       Connector con = new Connector();
    
       public PartsMapper Partsfacade() throws Exception{   
        pm.createProcedures((Connection) con);
        pm.retrieveParts();
        pm.selectPartsFromTable();
        return pm;
    }
    
}
