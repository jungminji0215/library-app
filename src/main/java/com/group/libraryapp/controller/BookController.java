package com.group.libraryapp.controller;

import com.group.libraryapp.dto.book.request.BookCreateRequest;
import com.group.libraryapp.service.book.BookService;
import com.group.libraryapp.utils.ResponseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping("/book")
    public ResponseEntity<?> create(@Valid @RequestBody BookCreateRequest request){
        return ResponseEntity.ok().body(new ResponseResult<>(bookService.create(request)));
    }
}