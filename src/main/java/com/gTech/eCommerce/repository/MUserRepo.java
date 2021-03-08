package com.gTech.eCommerce.repository;

import com.gTech.eCommerce.entity.MUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author BangDolla08
 * @created 07/03/21-March-2021 @at 00.02
 * @project eCommerce
 */
public interface MUserRepo extends JpaRepository<MUserEntity,String> {
}
