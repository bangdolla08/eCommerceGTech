package com.gTech.eCommerce.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author BangDolla08
 * @created 06/03/21-March-2021 @at 23.33
 * @project eCommerce
 */
@Data
@Entity
@Table(name = "m_user", schema = "gTechTest", catalog = "")
public class MUserEntity {
    @Id
    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    private Integer gender;
    private Date dateOfBirt;
}
