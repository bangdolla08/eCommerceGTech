package com.gTech.eCommerce.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author BangDolla08
 * @created 06/03/21-March-2021 @at 23.33
 * @project eCommerce
 */
@Entity
@Table(name = "m_brand", schema = "gTechTest", catalog = "")
public class MBrandEntity {
    private Long id;
    private String name;
    private Collection<TProductDetailEntity> tProductDetailsById;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MBrandEntity that = (MBrandEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "mBrandByIdBrand")
    public Collection<TProductDetailEntity> gettProductDetailsById() {
        return tProductDetailsById;
    }

    public void settProductDetailsById(Collection<TProductDetailEntity> tProductDetailsById) {
        this.tProductDetailsById = tProductDetailsById;
    }
}
