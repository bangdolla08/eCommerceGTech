package com.gTech.eCommerce.service;

import com.gTech.eCommerce.entity.MUserEntity;
import com.gTech.eCommerce.exception.NotAllowed;
import com.gTech.eCommerce.exception.NotFoundException;
import com.gTech.eCommerce.model.request.UserRegisterReq;
import com.gTech.eCommerce.model.response.UserDetail;
import com.gTech.eCommerce.model.response.UserRegisterResponse;
import com.gTech.eCommerce.repository.MUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author BangDolla08
 * @created 08/03/21-March-2021 @at 11.42
 * @project eCommerce
 */
@Service
public class UserService {

    @Autowired
    private MUserRepo mUserRepo;

    public UserRegisterResponse registerUser(UserRegisterReq userRegisterReq) {
        Optional<MUserEntity> mUserEntity = mUserRepo.findById(userRegisterReq.getUserId());
        if (mUserEntity.isPresent()) {
            throw new NotAllowed("User sudah terdaftar");
        }
        MUserEntity userEntity = MUserEntity.builder()
                .userId(userRegisterReq.getUserId())
                .password(new BCryptPasswordEncoder().encode(userRegisterReq.getPassword()))
                .build();
        mUserRepo.save(userEntity);
        return UserRegisterResponse.builder()
                .userId(userEntity.getUserId())
                .notification("Silahkan edit user anda di alamat yang sudah di sediakan //")
                .build();
    }

    public UserDetail getUserDetail(String userName) {
        return mUserRepo.findById(userName).map(this::toUserDetail).orElseThrow(() -> new NotFoundException("User anda tidak ditemukan"));
    }

    public UserDetail editUserDetail(UserDetail userDetail, String userName) {
        MUserEntity userEntity = mUserRepo.findById(userName).orElseThrow(() -> new NotFoundException("User anda tidak ditemukan"));
        userEntity.setFirstName(userDetail.getFirstName());
        userEntity.setLastName(userDetail.getLastName());
        userEntity.setGender(userDetail.getGenderId());
        userEntity.setDateOfBirt(userDetail.getDayOfBirt());
        mUserRepo.save(userEntity);
        return toUserDetail(userEntity);//.map(this::toUserDetail).orElseThrow(() -> new NotFoundException("User anda tidak ditemukan"));
    }

    private UserDetail toUserDetail(MUserEntity mUserEntity) {
        return UserDetail.builder().userId(mUserEntity.getUserId())
                .dayOfBirt(mUserEntity.getDateOfBirt())
                .firstName(mUserEntity.getFirstName())
                .lastName(mUserEntity.getLastName())
                .gender(mUserEntity.getGender() == null ? null : mUserEntity.getGender() == 1 ? "Male" : "Female")
                .build();
    }

}
