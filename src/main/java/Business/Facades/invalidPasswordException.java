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
public class invalidPasswordException extends Exception{

    public invalidPasswordException() {
    }

    public invalidPasswordException(String message) {
        super(message);
    }

    public invalidPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public invalidPasswordException(Throwable cause) {
        super(cause);
    }
    
}
