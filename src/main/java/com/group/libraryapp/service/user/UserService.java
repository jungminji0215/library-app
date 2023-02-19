package com.group.libraryapp.service.user;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserLoanHistoryCreateRequest;

public interface UserService {
    Long createUser(UserCreateRequest request);
}
