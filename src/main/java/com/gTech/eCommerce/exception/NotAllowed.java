package com.gTech.eCommerce.exception;

import org.springframework.beans.factory.BeanCreationNotAllowedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author BangDolla08
 * @created 08/03/21-March-2021 @at 11.46
 * @project eCommerce
 */
@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
public class NotAllowed extends RuntimeException {
    public NotAllowed(String s) {
        super(s);
    }

    public NotAllowed() {
        this("Not Allowed");
    }
}
