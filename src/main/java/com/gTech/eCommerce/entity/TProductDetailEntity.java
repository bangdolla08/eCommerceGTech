package com.gTech.eCommerce.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author BangDolla08
 * @created 06/03/21-March-2021 @at 23.33
 * @project eCommerce
 */
@Data
@Entity
@Table(name = "t_product_detail", schema = "gTechTest", catalog = "")
public class TProductDetailEntity {
    @Id@GeneratedValue
    private Long id;
    @Id@Column(name = "id_product", nullable = false)
    private int idProduct;
    @Basic@Column(name = "name", nullable = true, length = 50)
    private String name;
    @Basic@Column(name = "price", nullable = true)
    private Integer price;
    @Basic@Column(name = "description", nullable = true, length = 100)
    private String description;
    @Basic@Column(name = "id_brand", nullable = true)
    private Integer idBrand;
    @Basic@Column(name = "id_category", nullable = true)
    private Integer idCategory;
    @Basic@Column(name = "id_store", nullable = true)
    private Integer idStore;
    @ManyToOne@JoinColumn(name = "id_brand", referencedColumnName = "id")
    private MBrandEntity mBrandByIdBrand;
    @ManyToOne@JoinColumn(name = "id_category", referencedColumnName = "id")
    private MCategoryEntity mCategoryByIdCategory;
    @ManyToOne@JoinColumn(name = "id_store", referencedColumnName = "id")
    private MStoreEntity mStoreByIdStore;

}
