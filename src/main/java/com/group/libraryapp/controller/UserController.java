package com.group.libraryapp.controller;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.service.user.UserService;
import com.group.libraryapp.utils.ResponseResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<?> create(@Valid @RequestBody UserCreateRequest request){
        return ResponseEntity.ok().body(new ResponseResult<>(userService.createUser(request)));
    }
}
