package com.gTech.eCommerce.controller;

import com.gTech.eCommerce.model.response.ProductRes;
import com.gTech.eCommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author BangDolla08
 * @created 08/03/21-March-2021 @at 11.26
 * @project eCommerce
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/product")
    public ResponseEntity<List<ProductRes>> getAllProduct(String stringFilter, Integer storeId, Integer brandId, Integer categoryId) {
        return ResponseEntity.ok(this.productService.getProductList(stringFilter, storeId, brandId, categoryId));
    }

    @GetMapping(value = "product/{productId}")
    public ResponseEntity<ProductRes> getProduct(@PathVariable Integer productId) {
        return ResponseEntity.ok(this.productService.getDetailProductRes(productId));
    }
}
