package ar.com.comafi.controller.advice;


import ar.com.comafi.dto.ErrorDTO;
import ar.com.comafi.exception.ConnectionException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class UserControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ConnectionException.class)
    public ResponseEntity<ErrorDTO> connectionException(ConnectionException e){
        e.printStackTrace();
        return new ResponseEntity<ErrorDTO>(new ErrorDTO(e.getMessage(), e.getCode()), HttpStatus.CONFLICT);
    }

}
