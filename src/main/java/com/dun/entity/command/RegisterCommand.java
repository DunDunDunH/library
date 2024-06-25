package com.dun.entity.command;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class RegisterCommand {

    @NotBlank(message = "名称不能为空")
    private String name; // 名称
    @NotBlank(message = "密码不能为空")
    private String password; // 密码
    @NotBlank(message = "确认密码不能为空")
    private String confirmPassword; // 确认密码
    @NotBlank(message = "手机不能为空")
    private String phone; // 手机
    private Integer age; // 年龄
    private String sex = "1"; // 性别。1：男；2：女
    private String email; // 邮箱
    private String address; // 住址
    private boolean isAdmin = false; // 是否管理员
    private Date createTime = new Date(); // 创建时间
}
