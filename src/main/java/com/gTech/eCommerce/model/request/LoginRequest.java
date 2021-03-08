package com.gTech.eCommerce.model.request;

import lombok.Data;

/**
 * @author BangDolla08
 * @created 07/03/21-March-2021 @at 00.19
 * @project eCommerce
 */
@Data
public class LoginRequest {
    private String username;
    private String password;
}
