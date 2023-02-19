package com.group.libraryapp.service.book.impl;

import com.group.libraryapp.domain.book.Book;
import com.group.libraryapp.domain.book.BookRepository;
import com.group.libraryapp.domain.book.loan.BookLoan;
import com.group.libraryapp.domain.book.loan.BookLoanRepository;
import com.group.libraryapp.dto.book.request.BookCreateRequest;
import com.group.libraryapp.dto.user.request.UserLoanHistoryCreateRequest;
import com.group.libraryapp.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    private final BookLoanRepository bookLoanRepository;

    @Override
    @Transactional
    public Long createBook(BookCreateRequest request) {
        Book book = request.toEntity();
        book.addBookLoan(new BookLoan());
        return bookRepository.save(book).getId();
    }


    @Override
    @Transactional
    public Long loanBook(UserLoanHistoryCreateRequest request, Long bookId) {
        BookLoan bookLoan = bookLoanRepository.findByBookId(bookId).orElseThrow(IllegalArgumentException::new);
        if(bookLoan.isLoan()) throw new IllegalArgumentException("대출중인 책입니다.");

        bookLoan.loan();

        // todo 사용자와 연관관계

        return null;
    }
}