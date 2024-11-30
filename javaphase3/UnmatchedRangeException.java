
package javaphase3;

//user defind excption

import java.io.Serializable;

public class UnmatchedRangeException extends RuntimeException implements Serializable {
    
    public UnmatchedRangeException (String message){
        super(message);
    }
}