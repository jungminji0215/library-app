package com.group.libraryapp.domain.book;

import com.group.libraryapp.domain.book.loan.BookLoan;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "book")
    @JoinColumn(name = "book_loan_id")
    private BookLoan bookLoan;

    @Builder
    public Book(String name){
        this.name = name;
    }

    public void addBookLoan(BookLoan bookLoan) {
        this.bookLoan = bookLoan;
        bookLoan.addBook(this);
    }
}