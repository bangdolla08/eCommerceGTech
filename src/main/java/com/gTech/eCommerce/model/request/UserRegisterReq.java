package com.gTech.eCommerce.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author BangDolla08
 * @created 08/03/21-March-2021 @at 11.43
 * @project eCommerce
 */
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRegisterReq {
    private String userId;
    private String password;
}
