package ar.com.comafi.exception;

public class ConnectionException extends RuntimeException{

    private int code;

    public ConnectionException(String message, int code){
        super(message);
        this.code = code;
    }

    public int getCode(){
        return this.code;
    }

}
