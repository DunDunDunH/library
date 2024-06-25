package com.dun.controller;

import com.dun.entity.User;
import com.dun.entity.command.LoginCommand;
import com.dun.entity.command.RegisterCommand;
import com.dun.entity.query.GenericReadByIdQuery;
import com.dun.entity.query.GetUserByNameQuery;
import com.dun.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取所有用户数据
     *
     * @return
     */
    @GetMapping("getAll")
    public List<User> getAll() {
        return userService.getAll();
    }

    /**
     * 根据名称获取用户数据
     *
     * @param query
     * @return
     */
    @GetMapping("getByName")
    public User getByName(@RequestBody @Valid GetUserByNameQuery query) {
        return userService.getByName(query.getName());
    }

    /**
     * 根据ID删除用户数据
     *
     * @param query
     */
    @PostMapping("deleteById")
    public void deleteById(@RequestBody @Valid GenericReadByIdQuery query) {
        userService.deleteById(query.getId());
    }

    /**
     * 登录
     *
     * @param command
     * @param session
     * @throws Exception
     */
    @PostMapping("login")
    public void login(@RequestBody @Valid LoginCommand command, HttpSession session) throws Exception {
        // 根据名称获取用户数据
        User user = userService.getByName(command.getName());
        // 校验
        if (user == null || !user.getPassword().equals(command.getPassword())) {
            throw new Exception("用户名或密码错误");
        }

        // 保存session
        session.setAttribute("userName", user.getName());
    }

    /**
     * 注册
     *
     * @param command
     * @throws Exception
     */
    @PostMapping("register")
    public void register(@RequestBody @Valid RegisterCommand command) throws Exception {
        // 校验
        if (!command.getPassword().equals(command.getConfirmPassword())) {
            throw new Exception("两次输入密码不一致");
        }
        if (userService.isExistName(command.getName(), null)) {
            throw new Exception("用户名已存在");
        }
        if (userService.isExistPhone(command.getPhone(), null)) {
            throw new Exception("手机号已注册");
        }

        // 保存
        User user = new User(command.getName(), command.getPassword(), command.getPhone(), command.getAge(), command.getSex(), command.getEmail(), command.getAddress());
        userService.insert(user);
    }


}