package com.dun.service;

import com.dun.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    List<Book> getAll();

    List<Book> getByName(String name);

    void deleteById(String id);
}
