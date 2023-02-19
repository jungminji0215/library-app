package com.group.libraryapp.service.book;

import com.group.libraryapp.dto.book.request.BookCreateRequest;

public interface BookService {
    Long create(BookCreateRequest request);
}