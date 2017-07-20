/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Exceptions;

/**
 *
 * @author felesiah
 */
public class StorageException extends Exception{

    public StorageException() {
    }
    public StorageException(String message) {
        super(message);
    }
    public StorageException(Throwable cause) {
        super(cause);
        
    }
    public StorageException(String message,Throwable cause) {
        super(message,cause);
        
    }
        
}
