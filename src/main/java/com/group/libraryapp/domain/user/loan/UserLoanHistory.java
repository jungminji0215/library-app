package com.group.libraryapp.domain.user.loan;

import com.group.libraryapp.domain.book.Book;
import com.group.libraryapp.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class UserLoanHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Book book;

    @ColumnDefault("false")
    private boolean isReturn;

    public UserLoanHistory(User user, Book book) {
        this.user = user;
        this.book = book;
    }
}
