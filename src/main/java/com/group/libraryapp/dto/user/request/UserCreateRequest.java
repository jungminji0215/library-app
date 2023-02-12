package com.group.libraryapp.dto.user.request;

import com.group.libraryapp.domain.user.User;
import lombok.Data;

@Data
public class UserCreateRequest {
    private String name; // 필수

    private Integer age; // Integer : null 때문에

    public User toEntity(){
        return User.builder()
                .name(name)
                .age(age)
                .build();
    }
}
