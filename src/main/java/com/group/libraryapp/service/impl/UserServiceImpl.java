package com.group.libraryapp.service.impl;

import com.group.libraryapp.domain.user.User;
import com.group.libraryapp.domain.user.UserRepository;
import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    @Transactional
    public Long createUser(UserCreateRequest request) {
//        if(!StringUtils.hasText(request.getName())){
//            System.out.println("이름 필수예요");
//        }

        User user = request.toEntity();
        return userRepository.save(user).getId();
    }
}