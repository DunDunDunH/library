package com.dun.service.impl;

import com.dun.entity.Book;
import com.dun.mapper.BookMapper;
import com.dun.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAll() {
        return bookMapper.getAll();
    }

    @Override
    public List<Book> getByName(String name) {
        return bookMapper.getByName(name);
    }

    @Override
    public void deleteById(String id) {
        bookMapper.deleteById(id);
    }
}
