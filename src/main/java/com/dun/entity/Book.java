package com.dun.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@Data
public class Book {

    private String id; // ID
    private String code; // 编号
    private String name; // 名称
    private String author; // 作者
    private String type; // 类型
    private double price; // 价格
    private Integer count; // 数量
    private Integer days; // 天数
    private Date createTime; // 创建时间
    private Date updateTime; // 修改时间
    @TableLogic(value = "0", delval = "1")
    private boolean isDeleted; // 是否删除。0：否；1：是。

    public Book(String code, String name,String author, String type,double price, Integer count,Integer days) {
        this.id = UUID.randomUUID().toString().replace("-","");
        this.code = code;
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
        this.count = count;
        this.days = days;
        this.createTime = new Date();
        this.isDeleted = false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", code='" + code +
                ", name='" + name +
                ", author=" + author +
                ", type=" + type +
                ", price=" + price +
                ", count=" + count +
                ", days='" + days +
                ", createTime='" + createTime +
                ", updateTime='" + updateTime +
                ", isDeleted='" + isDeleted +
                '}';
    }
}
