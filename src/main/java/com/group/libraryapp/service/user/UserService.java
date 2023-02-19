package com.group.libraryapp.service.user;

import com.group.libraryapp.dto.user.request.UserCreateRequest;

public interface UserService {
    Long createUser(UserCreateRequest request);
}
