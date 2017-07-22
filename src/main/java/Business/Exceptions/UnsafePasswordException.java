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
public class UnsafePasswordException extends Exception {
      
    public UnsafePasswordException() {
    }
    public UnsafePasswordException(String message) {
        super(message);
    }
    public UnsafePasswordException(Throwable cause) {
        super(cause);
        
    }
    public UnsafePasswordException(String message,Throwable cause) {
        super(message,cause);
        
    }
        
}


