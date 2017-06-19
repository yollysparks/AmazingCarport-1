/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DomainServices;



import Data.PartsMapper;

/**
 *
 * @author felesiah
 */
public class Partsfacade {
   
     PartsMapper pm = new PartsMapper();
    
    public PartsMapper Partsfacade() throws Exception{    
        pm.retrieveParts();
       return pm;
    }
    
}
