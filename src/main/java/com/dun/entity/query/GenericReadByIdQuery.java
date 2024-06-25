package com.dun.entity.query;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class GenericReadByIdQuery {

    @NotBlank(message = "ID不能为空")
    private String id; // ID
}
