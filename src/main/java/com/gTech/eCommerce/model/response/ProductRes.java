package com.gTech.eCommerce.model.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

/**
 * @author BangDolla08
 * @created 08/03/21-March-2021 @at 11.07
 * @project eCommerce
 */
@Data
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ProductRes {
    private Integer idProduct;
    private String name;
    private String code;
    private String price;
    private String store;
    private String brand;
    private String category;
    private String description;
    private DetailProduct detailProduct;

    @Data
    @Builder
    public static class DetailProduct{
        private Integer idStore;
        private Integer idBrand;
        private Integer idCategory;
    }
}
