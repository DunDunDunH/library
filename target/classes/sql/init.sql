CREATE TABLE `user` (
  `id` VARCHAR(50) NOT NULL COMMENT 'ID',
  `name` VARCHAR(50) NOT NULL COMMENT '名称',
  `password` VARCHAR(30) NOT NULL COMMENT '密码',
  `phone` VARCHAR(30) NOT NULL COMMENT '手机号',
  `age` INTEGER DEFAULT NULL COMMENT '类型',
  `sex` INTEGER DEFAULT 1 COMMENT '性别。1：男；2：女',
  `email` VARCHAR(50) DEFAULT NULL COMMENT '邮箱',
  `address` VARCHAR(100) DEFAULT NULL COMMENT '住址',
  `is_admin` INTEGER DEFAULT 0 COMMENT '是否管理员。0：否；1：是',
  `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
  `update_time` DATETIME DEFAULT NULL COMMENT '修改时间',
  `is_deleted` INTEGER DEFAULT 0 COMMENT '是否删除。0：否；1：是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='用户';
INSERT INTO user(id, name, password, phone, age, sex, email, address, is_admin, create_time, update_time, is_deleted) VALUES
('1', 'admin', '123456', '13534846217', NULL, 1, NULL, NULL, 1, '2024-06-14 00:00:00', NULL, 0),
('2', '1', '1', '1', NULL, 1, NULL, NULL, 1, '2024-06-14 00:00:00', NULL, 0);


CREATE TABLE `book` (
  `id` VARCHAR(50) NOT NULL COMMENT 'ID',
  `code` VARCHAR(50) NOT NULL COMMENT '编号',
  `name` VARCHAR(50) NOT NULL COMMENT '名称',
  `author` VARCHAR(50) NOT NULL COMMENT '作者',
  `type` VARCHAR(50) NOT NULL COMMENT '类型',
  `price` DOUBLE NOT NULL COMMENT '价格',
  `count` INTEGER NOT NULL COMMENT '数量',
  `days` INTEGER DEFAULT NULL COMMENT '天数',
  `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
  `update_time` DATETIME DEFAULT NULL COMMENT '修改时间',
  `is_deleted` INTEGER DEFAULT 0 COMMENT '是否删除。0：否；1：是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='书';


CREATE TABLE `history` (
  `id` VARCHAR(50) NOT NULL COMMENT 'ID',
  `user_id` VARCHAR(50) NOT NULL COMMENT '用户ID',
  `book_id` VARCHAR(50) NOT NULL COMMENT '书ID',
  `borrow_time` DATETIME DEFAULT NULL COMMENT '借阅时间',
  `return_time` DATETIME DEFAULT NULL COMMENT '归还时间',
  `status` VARCHAR(5) DEFAULT 0 COMMENT '状态。0：未归还；1：已归还',
  `is_deleted` INTEGER DEFAULT 0 COMMENT '是否删除。0：否；1：是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='记录';