package com.demo.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getBooks() {
        return Arrays.asList(new Book[]{
                new Book(1, "name", "author"),
                new Book(2, "kara kapli defter", "necati enistem"),
//                new Book(3, "ciko", "ciko tanesi")
        });
    }

}
