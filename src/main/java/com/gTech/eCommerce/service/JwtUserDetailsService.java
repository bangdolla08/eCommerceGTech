package com.gTech.eCommerce.service;

import java.util.ArrayList;
import java.util.Optional;

import com.gTech.eCommerce.entity.MUserEntity;
import com.gTech.eCommerce.repository.MUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author BangDolla08
 * @created 08/03/21-March-2021 @at 11.30
 * @project eCommerce
 */
@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private MUserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MUserEntity> userEntity = userRepo.findById(username);
        if (userEntity.isPresent()) {
            return new User(userEntity.get().getUserId(), userEntity.get().getPassword(),
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}