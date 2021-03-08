package com.gTech.eCommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author BangDolla08
 * @created 07/03/21-March-2021 @at 00.32
 * @project eCommerce
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{
    public NotFoundException(String s) {
        super(s);
    }

    public NotFoundException() {
        this("Not Found");
    }
}
