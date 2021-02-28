package com.huyanlong.redis.entry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("tbl_user")
public class User /*implements Serializable*/ {
    // id
    @TableId(type = IdType.AUTO)
    private Integer id;

    // 中文名称
    private String name;

    // 年龄
    private Integer age;

    // 电子邮件
    private String email;


    //    @TableField(condition = SqlCondition.LIKE, value = "ipAddr")
    private String ipAddr;

    /**
     * 组别 表中不存在的字段 如果插入的时候有值的话mp 依然会映射，导致插入数据库失败。
     * 处理方法：1.增加标识：transient (非序列化) 2.直接静态的 3.@TableField(exist=false)代表不是数据库中的字段
     */
    @TableField(exist = false)
    private transient String group;
}
