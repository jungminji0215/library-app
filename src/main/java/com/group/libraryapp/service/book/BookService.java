package com.group.libraryapp.service.book;

import com.group.libraryapp.dto.book.request.BookCreateRequest;
import com.group.libraryapp.dto.book.response.BookResponse;
import com.group.libraryapp.dto.user.request.UserLoanHistoryCreateRequest;

import java.util.List;

public interface BookService {
    Long createBook(BookCreateRequest request);

    void loanBook(UserLoanHistoryCreateRequest request, Long bookId);

    List<BookResponse> listBook();
}