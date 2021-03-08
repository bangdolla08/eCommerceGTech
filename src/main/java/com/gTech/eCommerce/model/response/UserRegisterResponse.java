package com.gTech.eCommerce.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author BangDolla08
 * @created 08/03/21-March-2021 @at 11.43
 * @project eCommerce
 */
@Data
@AllArgsConstructor
@Builder
@JsonInclude(value= JsonInclude.Include.NON_NULL)
public class UserRegisterResponse {
    private String userId;
    private String notification;
}
