/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Facades;

/**
 *
 * @author felesiah
 */
public class ExceptionsThrown extends Exception {
    
   public ExceptionsThrown(){
       
   }
    public ExceptionsThrown(String message){
       super(message);
   }
    public ExceptionsThrown(Throwable cause){
       super(cause);
   }
    public ExceptionsThrown(String message,Throwable cause){
       super(message,cause);
   }
}
