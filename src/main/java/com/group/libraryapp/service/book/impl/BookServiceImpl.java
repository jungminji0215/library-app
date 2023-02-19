package com.group.libraryapp.service.book.impl;

import com.group.libraryapp.domain.book.Book;
import com.group.libraryapp.domain.book.BookRepository;
import com.group.libraryapp.dto.book.request.BookCreateRequest;
import com.group.libraryapp.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    @Transactional
    public Long create(BookCreateRequest request) {
        Book book = request.toEntity();
        return bookRepository.save(book).getId();
    }
}