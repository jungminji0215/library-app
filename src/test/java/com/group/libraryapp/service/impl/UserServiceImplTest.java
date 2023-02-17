package com.group.libraryapp.service.impl;

import com.group.libraryapp.domain.user.User;
import com.group.libraryapp.domain.user.UserRepository;
import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @Test
    void 사용자_저장되었는지_확인() {
        // given
        String name = "정민지";
        Integer age = 28;

        UserCreateRequest userCreateRequest = new UserCreateRequest();
        userCreateRequest.setName(name);
        userCreateRequest.setAge(age);

        // when
        Long result = userService.createUser(userCreateRequest);

        // then
        List<User> user = userRepository.findAll();

        assertThat(user).hasSize(1);
        assertThat(result).isEqualTo(user.get(0).getId());
        assertThat(name).isEqualTo(user.get(0).getName());
        assertThat(age).isEqualTo(user.get(0).getAge());
    }
}