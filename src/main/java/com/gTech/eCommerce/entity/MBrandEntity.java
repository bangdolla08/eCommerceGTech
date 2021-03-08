package com.gTech.eCommerce.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author BangDolla08
 * @created 06/03/21-March-2021 @at 23.33
 * @project eCommerce
 */
@Data
@Entity
@Table(name = "m_brand", schema = "gTechTest", catalog = "")
public class MBrandEntity {
    @Id@GeneratedValue@Column(name = "id", nullable = false)
    private Integer id;
    @Basic@Column(name = "name", nullable = true, length = 50)
    private String name;
    @OneToMany(mappedBy = "mBrandByIdBrand")
    private Collection<TProductDetailEntity> tProductDetailsById;
}
