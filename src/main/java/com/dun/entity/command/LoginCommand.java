package com.dun.entity.command;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginCommand {

    @NotBlank(message = "名称不能为空")
    private String name; // 名称
    @NotBlank(message = "密码不能为空")
    private String password; // 密码
}
