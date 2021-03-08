package com.gTech.eCommerce.model.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author BangDolla08
 * @created 07/03/21-March-2021 @at 00.24
 * @project eCommerce
 */
@Data
@Builder
public class UserDto {
    private String userId;
    private String name;
    private String dob;
}
