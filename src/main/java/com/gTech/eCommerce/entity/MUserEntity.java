package com.gTech.eCommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author BangDolla08
 * @created 06/03/21-March-2021 @at 23.33
 * @project eCommerce
 */
@Setter
@Getter
@Entity
@Table(name = "m_user", schema = "gTechTest", catalog = "")
public class MUserEntity {
    @Id@GeneratedValue
    private Long id;
    @Id@Column(name = "user_id", nullable = false, length = 50)
    private String userId;
    @Basic@Column(name = "password", nullable = true, length = 100)
    private String password;
    @Basic@Column(name = "phone_number", nullable = true, length = 15)
    private String phoneNumber;
    @Basic@Column(name = "first_name", nullable = true, length = 50)
    private String firstName;
    @Basic@Column(name = "last_name", nullable = true, length = 50)
    private String lastName;
    @Basic@Column(name = "gender", nullable = true)
    private Integer gender;
    @Basic@Column(name = "date_of_birt", nullable = true)
    private Date dateOfBirt;
}
