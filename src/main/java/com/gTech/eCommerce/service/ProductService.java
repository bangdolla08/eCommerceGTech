package com.gTech.eCommerce.service;

import com.gTech.eCommerce.entity.TProductDetailEntity;
import com.gTech.eCommerce.exception.NotFoundException;
import com.gTech.eCommerce.model.response.ProductRes;
import com.gTech.eCommerce.repository.TProductDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author BangDolla08
 * @created 08/03/21-March-2021 @at 11.01
 * @project eCommerce
 */
@Service
public class ProductService {
    @Autowired
    private TProductDetailRepo productDetailRepo;

    /**
     * To Get the product list
     */
    public List<ProductRes> getProductList(String stringFilter, Integer storeId, Integer brandId, Integer categoryId) {
        return productDetailRepo.findAllToGetData(stringFilter, storeId, brandId, categoryId).stream().map(this::getProductRes).collect(Collectors.toList());
    }

    public ProductRes getDetailProductRes(Integer idProduct) {
        TProductDetailEntity tProductDetailEntity = this.productDetailRepo.findById(idProduct).orElseThrow(() -> new NotFoundException("Data Tidak ditemukan"));
        ProductRes productRes = this.getProductRes(tProductDetailEntity);
        ProductRes.DetailProduct detailProduct = ProductRes.DetailProduct.builder()
                .idBrand(tProductDetailEntity.getMBrandByIdBrand().getId())
                .idCategory(tProductDetailEntity.getMCategoryByIdCategory().getId())
                .idStore(tProductDetailEntity.getMStoreByIdStore().getId())
                .build();
        productRes.setDetailProduct(detailProduct);
        return productRes;
    }

    private ProductRes getProductRes(TProductDetailEntity tProductDetailEntity) {
        return ProductRes.builder()
                .name(tProductDetailEntity.getName())
                .description(tProductDetailEntity.getDescription())
                .brand(tProductDetailEntity.getMBrandByIdBrand().getName())
                .store(tProductDetailEntity.getMStoreByIdStore().getName())
                .price(tProductDetailEntity.getPrice().toString())
                .idProduct(tProductDetailEntity.getIdProduct())
                .category(tProductDetailEntity.getMCategoryByIdCategory().getName())
                .build();
    }

}
