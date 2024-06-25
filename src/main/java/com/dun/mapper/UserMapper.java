package com.dun.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dun.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    User getById(@Param("id") String id);

    List<User> getAll();

    User getByName(@Param("name") String name);

    void deleteById(@Param("id") String id);

    User getByPhone(String phone);

}
