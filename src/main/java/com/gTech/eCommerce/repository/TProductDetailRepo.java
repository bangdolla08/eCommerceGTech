package com.gTech.eCommerce.repository;

import com.gTech.eCommerce.entity.TProductDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author BangDolla08
 * @created 08/03/21-March-2021 @at 11.03
 * @project eCommerce
 */
@Repository
public interface TProductDetailRepo extends JpaRepository<TProductDetailEntity, Integer> {

    @Query("SELECT T FROM TProductDetailEntity T WHERE " +
            "(?1 IS NULL OR (T.name like %?1% OR T.description like %?1%)) " +
            "AND (?2 IS NULL OR (T.mStoreByIdStore.id=?2)) " +
            "AND (?3 IS NULL OR (T.mBrandByIdBrand.id=?3)) " +
            "AND (?4 IS NULL OR (T.mCategoryByIdCategory.id=?4))")
    List<TProductDetailEntity> findAllToGetData(String stringFilter, Integer storeId, Integer brandId, Integer categoryId);
}
