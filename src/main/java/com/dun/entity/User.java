package com.dun.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@Data
public class User {

    private String id; // ID
    private String name; // 名称
    private String password; // 密码
    private String phone; // 手机
    private Integer age; // 年龄
    private String sex; // 性别。1：男；2：女
    private String email; // 邮箱
    private String address; // 住址
    private boolean isAdmin; // 是否管理员
    private Date createTime; // 创建时间
    private Date updateTime; // 修改时间
    @TableLogic(value = "0", delval = "1")
    private boolean isDeleted; // 是否删除。0：否；1：是

    public User(String name, String password, String phone, Integer age, String sex, String email, String address) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.address = address;
        this.isAdmin = false;
        this.createTime = new Date();
        this.isDeleted = false;
    }

    private void admin() {
        this.isAdmin = true;
    }

    private void deleted() {
        this.isDeleted = true;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name +
                ", password=" + password +
                ", phone=" + phone +
                ", age=" + age +
                ", sex=" + sex +
                ", email=" + email +
                ", address=" + address +
                ", isAdmin=" + isAdmin +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
