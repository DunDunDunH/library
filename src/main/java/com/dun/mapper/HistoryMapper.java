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
public interface HistoryMapper extends BaseMapper<History> {

    History getById(@Param("id") String id);

    List<History> getByBookId(@Param("bookId") String bookId);

    List<History> getByUserId(@Param("userId") String userId);

    void deleteById(@Param("id") String id);

}
