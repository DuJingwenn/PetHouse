package com.pethouse.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Daven
 * @since 2021-10-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("userInfo")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "userId", type = IdType.AUTO)
    private Integer userId;

    @TableField("userName")
    private String userName;

    @TableField("userAge")
    private Integer userAge;

    @TableField("userSex")
    private String userSex;

    @TableField("petId")
    private Integer petId;

    @TableField("petCount")
    private Integer petCount;

    @TableField("userCity")
    private String userCity;

    @TableField("userDelete")
    private Integer userDelete;

    private LocalDate submissionDate;

    @TableField("weChat")
    private String weChat;

}
