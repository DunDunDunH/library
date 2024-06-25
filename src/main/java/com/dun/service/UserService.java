package com.dun.service;

import com.dun.entity.User;
import com.dun.entity.command.LoginCommand;
import com.dun.entity.command.RegisterCommand;
import com.dun.entity.query.GenericReadByIdQuery;
import com.dun.entity.query.GetUserByNameQuery;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getByName(String name);

    void deleteById(String id);

    boolean isExistName(String name,String id);

    boolean isExistPhone(String phone, String id);

    void insert(User user);
}
