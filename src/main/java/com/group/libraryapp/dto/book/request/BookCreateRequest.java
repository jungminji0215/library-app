package com.group.libraryapp.dto.book.request;

import com.group.libraryapp.domain.book.Book;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class BookCreateRequest {
    @NotBlank(message = "책 이름이 있어야 합니다.")
    private String name;

    public Book toEntity(){
        return Book.builder().name(name).build();
    }
}