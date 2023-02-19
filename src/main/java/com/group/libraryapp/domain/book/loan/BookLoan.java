package com.group.libraryapp.domain.book.loan;

import com.group.libraryapp.domain.book.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class BookLoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ColumnDefault("true")
    private boolean isLoan;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public void addBook(Book book) {
        this.book = book;
    }

    public void loan() {
        this.isLoan = true;
    }
}