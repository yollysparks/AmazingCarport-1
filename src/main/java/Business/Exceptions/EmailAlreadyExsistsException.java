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
     
   public class EmailAlreadyExsistsException extends Exception{

    public EmailAlreadyExsistsException() {
    }

    public EmailAlreadyExsistsException(String message) {
        super(message);
    }

    public EmailAlreadyExsistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmailAlreadyExsistsException(Throwable cause) {
        super(cause);
    }
    
}
