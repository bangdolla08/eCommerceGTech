package com.gTech.eCommerce.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author BangDolla08
 * @created 07/03/21-March-2021 @at 14.53
 * @project eCommerce
 */
@Data
@Builder
@AllArgsConstructor
public class ResponseAuth {
    private String username;
    private String expired;
    private String accessToken;
}