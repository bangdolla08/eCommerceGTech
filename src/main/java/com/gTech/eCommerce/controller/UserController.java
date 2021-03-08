package com.gTech.eCommerce.controller;

import com.gTech.eCommerce.model.request.UserRegisterReq;
import com.gTech.eCommerce.model.response.ProductRes;
import com.gTech.eCommerce.model.response.UserDetail;
import com.gTech.eCommerce.model.response.UserRegisterResponse;
import com.gTech.eCommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * @author BangDolla08
 * @created 08/03/21-March-2021 @at 11.37
 * @project eCommerce
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping(value = "/register")
    public ResponseEntity<UserRegisterResponse> registerUser(@RequestBody UserRegisterReq userRegisterReq) {
        return ResponseEntity.ok(userService.registerUser(userRegisterReq));
    }
    @GetMapping(value = "/api/user")
    public ResponseEntity<UserDetail> getUser(Principal principal) {
        System.out.println(principal.getName());
        return ResponseEntity.ok(userService.getUserDetail(principal.getName()));
    }
    @PostMapping(value = "/api/user")
    public ResponseEntity<UserDetail> editUser(@RequestBody UserDetail userDetail,Principal principal) {
        return ResponseEntity.ok(userService.editUserDetail(userDetail,principal.getName()));
    }
//    @GetMapping(value = "/user")

}
