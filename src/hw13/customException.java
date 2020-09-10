package hw13;

public class customException extends RuntimeException{
    public customException(){
        super();
    }
    public customException(String message, Throwable cause){
        super(message, cause);
    }
    public customException(String message) {
        super(message);
    }
    public customException(Throwable cause) {
        super(cause);
    }
}
