package com.example.infrastructure.book.entity;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "book")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(exclude = {"id"})
public class BookJpaEntity {
    @Id @GeneratedValue
    private Long id;
    private String author;
    private String title;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String contents;

    public BookJpaEntity(String author, String title, String contents) {
        this.author = author;
        this.title = title;
        this.contents = contents;
    }
}
