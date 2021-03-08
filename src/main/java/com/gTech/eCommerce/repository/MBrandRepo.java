package com.gTech.eCommerce.repository;

import com.gTech.eCommerce.entity.MBrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author BangDolla08
 * @created 06/03/21-March-2021 @at 23.45
 * @project eCommerce
 */
@Repository
public interface MBrandRepo extends JpaRepository<MBrandEntity, Integer> {
}
