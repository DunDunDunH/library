package com.dun.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class History {

    private String id; // ID
    private String userId; // 用户ID
    private String bookId; // 书ID
    private Date borrowTime; // 借阅时间
    private Date returnTime; // 归还时间
    private String status; // 状态。0：未归还；1：已归还
    @TableLogic(value = "0", delval = "1")
    private boolean isDeleted; // 是否删除。0：否；1：是
}
