package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName customer
 */
@TableName(value ="customer")
@Data
public class Customer implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 客户姓名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 客户年龄
     */
    @TableField(value = "age")
    private Integer age;

    /**
     * 客户性别 页面为下拉框 1男 0女
     */
    @TableField(value = "gender")
    private Integer gender;

    /**
     * 电话号码
     */
    @TableField(value = "tel")
    private String tel;

    /**
     * 
     */
    @TableField(value = "qq")
    private String qq;

    /**
     * 
     */
    @TableField(value = "job")
    private Integer job;

    /**
     * 客户来源
     */
    @TableField(value = "source")
    private Integer source;

    /**
     * 负责人 填写为当前登录用户
     */
    @TableField(value = "seller")
    private Integer seller;

    /**
     *  创建人 填写为当前登录用户
     */
    @TableField(value = "inputUser")
    private Integer inputuser;

    /**
     * 
     */
    @TableField(value = "inputTime")
    private Date inputtime;

    /**
     * -2:流失 -1:开发失败 0:潜在客户 1:正式客户 2:资源池客户
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 转正时间
     */
    @TableField(value = "positiveTime")
    private Date positivetime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}