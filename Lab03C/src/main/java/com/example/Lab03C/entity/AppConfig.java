package com.example.Lab03C.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Book> getbooks(){
        List<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setId(1L);
        book1.setTitle("Lập Trình Web Spring MVC");
        book1.setAuthor("Ánh Nguyễn");
        book1.setPrice(10.99);
        book1.setCategory("Công Nghệ Thông tin");
        books.add(book1);

        Book book2 = new Book();
        book2.setId(2L);
        book2.setTitle("Lập trình Ứng dụng Spring");
        book2.setAuthor("Huy Cường");
        book2.setPrice(12.99);
        book2.setCategory("Công Nghệ Thông tin");
        books.add(book2);

        Book book3 = new Book();
        book3.setId(3L);
        book3.setTitle("Lập Trình Ứng dụng Java");
        book3.setAuthor("Xuân Nhân");
        book3.setPrice(15.99);
        book3.setCategory("Công Nghệ Thông tin");
        books.add(book3);

        Book book4 = new Book();
        book4.setId(4L);
        book4.setTitle("Lập Trình Ứng dụng Java");
        book4.setAuthor("Đăng Khoa");
        book4.setPrice(15.99);
        book4.setCategory("Công Nghệ Thông tin");
        books.add(book4);

        return books;
    }
}


