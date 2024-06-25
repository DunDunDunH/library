package com.dun.entity.query;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class GetUserByNameQuery {

    @NotBlank(message = "名称不能为空")
    private String name; // 名称
}
