package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {
    private String name;

    private Integer age; // Integer : null 때문에

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
