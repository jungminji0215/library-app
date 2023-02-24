package com.group.libraryapp.service.book.impl;

import com.group.libraryapp.domain.book.Book;
import com.group.libraryapp.domain.book.BookRepository;
import com.group.libraryapp.domain.book.loan.BookLoan;
import com.group.libraryapp.domain.book.loan.BookLoanRepository;
import com.group.libraryapp.domain.user.User;
import com.group.libraryapp.domain.user.UserRepository;
import com.group.libraryapp.domain.user.loan.UserLoanHistory;
import com.group.libraryapp.domain.user.loan.UserLoanHistoryRepository;
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
    private final UserRepository userRepository;
    private final UserLoanHistoryRepository userLoanHistoryRepository;

    @Override
    @Transactional
    public Long createBook(BookCreateRequest request) {
        Book book = request.toEntity();
        book.addBookLoan(new BookLoan());
        return bookRepository.save(book).getId();
    }


    @Override
    @Transactional
    public void loanBook(UserLoanHistoryCreateRequest request, Long bookId) {
        BookLoan bookLoan = bookLoanRepository.findByBookId(bookId)
                .orElseThrow(IllegalArgumentException::new);
        if(bookLoan.isLoan()) throw new IllegalArgumentException("대출중인 책입니다.");
        bookLoan.loan();

        // userLoanHistory
        User user = userRepository.findById(request.getUserId())
                .orElseThrow(IllegalArgumentException::new);

        Book book = bookRepository.findById(bookId)
                .orElseThrow(IllegalArgumentException::new);

        userLoanHistoryRepository.save(new UserLoanHistory(user, book));
    }
}