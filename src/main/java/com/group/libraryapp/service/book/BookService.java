package com.group.libraryapp.service.book;

import com.group.libraryapp.dto.book.request.BookCreateRequest;
import com.group.libraryapp.dto.user.request.UserLoanHistoryCreateRequest;

public interface BookService {
    Long createBook(BookCreateRequest request);

    Long loanBook(UserLoanHistoryCreateRequest request, Long bookId);
}