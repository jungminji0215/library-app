package com.group.libraryapp.controller;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.service.UserService;
import com.group.libraryapp.utils.ResponseResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// dto에 getter 없으면 반환 안됨

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<?> saveUser(@RequestBody UserCreateRequest request){
        return ResponseEntity.ok().body(new ResponseResult<>(userService.createUser(request)));
    }
}
