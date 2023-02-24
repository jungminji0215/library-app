package com.group.libraryapp.domain.user;

import com.group.libraryapp.domain.book.Book;
import com.group.libraryapp.domain.user.loan.UserLoanHistory;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Integer age;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) // cascade 없어서 userLoanHistory 저장 안됐었음
    private List<UserLoanHistory> userLoanHistoryList = new ArrayList<>();

    @ColumnDefault("false")
    private boolean quit;

    @Builder
    public User(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void loonBook(Book book){
        this.userLoanHistoryList.add(new UserLoanHistory(this, book));
    }
}