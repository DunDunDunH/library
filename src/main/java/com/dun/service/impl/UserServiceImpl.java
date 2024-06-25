package com.dun.service.impl;

import com.dun.entity.User;
import com.dun.mapper.UserMapper;
import com.dun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getByName(String name) {
        return userMapper.getByName(name);
    }

    @Override
    public void deleteById(String id) {
        userMapper.deleteById(id);
    }

    @Override
    public boolean isExistName(String name, String id) {
        User user = userMapper.getByName(name);
        return user!=null && !user.getId().equals(id);
    }

    @Override
    public boolean isExistPhone(String phone, String id) {
        User user = userMapper.getByPhone(phone);
        return user!=null && !user.getId().equals(id);
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
}
