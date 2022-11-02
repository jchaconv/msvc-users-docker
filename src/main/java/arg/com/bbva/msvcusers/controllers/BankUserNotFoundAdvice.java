package arg.com.bbva.msvcusers.controllers;

import arg.com.bbva.msvcusers.exception.BankUserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BankUserNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(BankUserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String bankUserNotFoundHandler(BankUserNotFoundException ex) {
        return ex.getMessage();
    }


}
