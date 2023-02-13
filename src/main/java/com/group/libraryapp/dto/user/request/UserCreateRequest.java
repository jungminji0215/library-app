package com.group.libraryapp.dto.user.request;

import com.group.libraryapp.domain.user.User;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserCreateRequest {
    @NotBlank(message = "이름이 있어야 합니다.")
    private String name; // 필수

    private Integer age; // Integer : null 때문에

    public User toEntity(){
        return User.builder()
                .name(name)
                .age(age)
                .build();
    }
}
