package com.example.demo;

import com.example.demo.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(BasicApplication.class, args);
        System.out.println();
        System.out.println();
        System.out.println();

        var searcher = context.getBean(BinarySearchImpl.class);
        var searcher1= context.getBean(BinarySearchImpl.class);
        System.out.println(searcher);
        System.out.println(searcher1);
        if(searcher == searcher1){
            System.out.println("same beans are retrieved.");
        }
        else{
            System.out.println("different beans are retrieved.");
        }
        var result = searcher.search(new int[]{1, 2, 3, 4}, 3);

        System.out.println("=====> " + result + " <=====");
        System.out.println("basic");
    }

}
