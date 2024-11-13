package com.securityAPI1.securityAPI1.config;

import io.jsonwebtoken.security.SignatureException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.file.AccessDeniedException;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(SignatureException.class)
    @ResponseBody
    public String exception(SignatureException e) {
        return "{\"status\":\"access denied\"}";
    }
}
