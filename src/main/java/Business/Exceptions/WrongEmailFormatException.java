/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Exceptions;

/**
 *
 * @author caspergrosslarsen
 */
public class WrongEmailFormatException extends Exception {
    
    public WrongEmailFormatException(){
       
   }
    public WrongEmailFormatException(String message){
       super(message);
   }
    public WrongEmailFormatException(Throwable cause){
       super(cause);
   }
    public WrongEmailFormatException(String message,Throwable cause){
       super(message,cause);
   }
}