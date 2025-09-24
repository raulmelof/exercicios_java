package br.ifsp.contacts.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleValidationException(MethodArgumentNotValidException ex) {
        String erro = ex.getBindingResult()
            .getFieldErrors()
            .stream()
            .findFirst()
            .map(fieldError -> fieldError.getDefaultMessage())
            .orElse("Dados inválidos");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(Map.of("erro", erro));
    }
}