package com.group.libraryapp.controller;

import com.group.libraryapp.dto.book.request.BookCreateRequest;
import com.group.libraryapp.dto.user.request.UserLoanHistoryCreateRequest;
import com.group.libraryapp.service.book.BookService;
import com.group.libraryapp.utils.ResponseResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping("/book")
    public ResponseEntity<?> createBook(@Valid @RequestBody BookCreateRequest request){
        return ResponseEntity.ok().body(new ResponseResult<>(bookService.createBook(request)));
    }


    @PostMapping("/book/{bookId}/loan")
    public void loanBook(
            @Valid @RequestBody UserLoanHistoryCreateRequest request,
            @PathVariable Long bookId){
        bookService.loanBook(request, bookId);
    }

    @GetMapping("/book")
    public ResponseEntity<?> listBook(){
        return ResponseEntity.ok().body(new ResponseResult<>(bookService.listBook()));
    }
}