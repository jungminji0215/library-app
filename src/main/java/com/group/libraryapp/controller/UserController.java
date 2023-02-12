package com.group.libraryapp.controller;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// getter없으면 반환 안됨

@RestController
public class UserController {

    @PostMapping("/user")
    public void saveUser(@RequestBody UserCreateRequest request){

    }
}
