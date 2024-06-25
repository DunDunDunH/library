package com.dun.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dun.entity.Book;
import com.dun.entity.History;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper extends BaseMapper<Book> {

    Book getById(@Param("id") String id);

    List<Book> getAll();

    List<Book> getByName(@Param("name") String name);

    void deleteById(@Param("id") String id);
}
