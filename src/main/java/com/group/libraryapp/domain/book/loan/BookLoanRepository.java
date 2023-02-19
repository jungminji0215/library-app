package com.group.libraryapp.domain.book.loan;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookLoanRepository extends JpaRepository<BookLoan, Long> {
    Optional<BookLoan> findByBookId(Long bookId);
}