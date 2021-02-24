package ar.com.comafi.dto;

public class ErrorDTO {
    private String message;
    private int code;


    public ErrorDTO(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
