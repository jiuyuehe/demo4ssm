package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName welcome
 */
@TableName(value ="welcome")
@Data
public class Welcome implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 名人名言
     */
    @TableField(value = "wise")
    private String wise;

    /**
     * 展示频率
     */
    @TableField(value = "frequency")
    private Integer frequency;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}