package com.dun.controller;

import com.dun.entity.Book;
import com.dun.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("getAll")
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("getByName")
    public List<Book> getByName(@RequestParam("name") String name) {
        return bookService.getByName(name);
    }

    @PostMapping("deleteById")
    public void deleteById(@RequestParam("id") String id) {
        bookService.deleteById(id);
    }
}
