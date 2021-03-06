package com.gTech.eCommerce.entity;

import javax.persistence.*;

/**
 * @author BangDolla08
 * @created 06/03/21-March-2021 @at 23.33
 * @project eCommerce
 */
@Entity
@Table(name = "t_product_detail", schema = "gTechTest", catalog = "")
public class TProductDetailEntity {
    private Long id;
    private int idProduct;
    private String name;
    private Integer price;
    private String description;
    private Integer idBrand;
    private Integer idCategory;
    private Integer idStore;
    private MBrandEntity mBrandByIdBrand;
    private MCategoryEntity mCategoryByIdCategory;
    private MStoreEntity mStoreByIdStore;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "id_product", nullable = false)
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price", nullable = true)
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "id_brand", nullable = true)
    public Integer getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(Integer idBrand) {
        this.idBrand = idBrand;
    }

    @Basic
    @Column(name = "id_category", nullable = true)
    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    @Basic
    @Column(name = "id_store", nullable = true)
    public Integer getIdStore() {
        return idStore;
    }

    public void setIdStore(Integer idStore) {
        this.idStore = idStore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TProductDetailEntity that = (TProductDetailEntity) o;

        if (idProduct != that.idProduct) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (idBrand != null ? !idBrand.equals(that.idBrand) : that.idBrand != null) return false;
        if (idCategory != null ? !idCategory.equals(that.idCategory) : that.idCategory != null) return false;
        if (idStore != null ? !idStore.equals(that.idStore) : that.idStore != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProduct;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (idBrand != null ? idBrand.hashCode() : 0);
        result = 31 * result + (idCategory != null ? idCategory.hashCode() : 0);
        result = 31 * result + (idStore != null ? idStore.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_brand", referencedColumnName = "id")
    public MBrandEntity getmBrandByIdBrand() {
        return mBrandByIdBrand;
    }

    public void setmBrandByIdBrand(MBrandEntity mBrandByIdBrand) {
        this.mBrandByIdBrand = mBrandByIdBrand;
    }

    @ManyToOne
    @JoinColumn(name = "id_category", referencedColumnName = "id")
    public MCategoryEntity getmCategoryByIdCategory() {
        return mCategoryByIdCategory;
    }

    public void setmCategoryByIdCategory(MCategoryEntity mCategoryByIdCategory) {
        this.mCategoryByIdCategory = mCategoryByIdCategory;
    }

    @ManyToOne
    @JoinColumn(name = "id_store", referencedColumnName = "id")
    public MStoreEntity getmStoreByIdStore() {
        return mStoreByIdStore;
    }

    public void setmStoreByIdStore(MStoreEntity mStoreByIdStore) {
        this.mStoreByIdStore = mStoreByIdStore;
    }
}
