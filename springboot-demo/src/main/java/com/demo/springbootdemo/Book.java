package com.demo.springbootdemo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private long id;
    private String name;
    private String author;

    public Book(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("Book [id=%s name=%s author=%s]", id, name, author);
    }
}
