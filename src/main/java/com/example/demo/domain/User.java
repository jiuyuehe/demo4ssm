package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "name")
    private String name;

    /**
     * 
     */
    @TableField(value = "password")
    private String password;

    /**
     * 
     */
    @TableField(value = "email")
    private String email;

    /**
     * 
     */
    @TableField(value = "age")
    private Integer age;

    /**
     * 
     */
    @TableField(value = "dept")
    private Integer dept;

    /**
     * 入职时间
     */
    @TableField(value = "hireDate")
    private Date hiredate;

    /**
     * 状态 1正常 0离职
     */
    @TableField(value = "state")
    private Integer state;

    /**
     * 超级管理员身份 1超管 0普通
     */
    @TableField(value = "admin")
    private Integer admin;

    /**
     * 
     */
    @TableField(value = "login_time")
    private Date loginTime;

    /**
     * 
     */
    @TableField(value = "register_time")
    private Date registerTime;

    /**
     * 企业Id
     */
    @TableField(value = "ent_id")
    private Integer entId;



    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private String createTime;


    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private String updateTime;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}