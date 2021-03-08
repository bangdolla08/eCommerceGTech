package com.gTech.eCommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

/**
 * @author BangDolla08
 * @created 06/03/21-March-2021 @at 23.33
 * @project eCommerce
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "m_user", schema = "gTechTest", catalog = "")
public class MUserEntity {
    @Id
    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    private Integer gender;
    private LocalDateTime dateOfBirt;
}
