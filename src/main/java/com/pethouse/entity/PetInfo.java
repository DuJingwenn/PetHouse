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
@TableName("petInfo")
public class PetInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "petId", type = IdType.AUTO)
    private Integer petId;

    @TableField("petOwnnerName")
    private String petOwnnerName;

    @TableField("petOwnnerId")
    private String petOwnnerId;

    @TableField("petType")
    private String petType;

    @TableField("petPic")
    private String petPic;

    @TableField("petAge")
    private Integer petAge;

    @TableField("petSex")
    private String petSex;

    @TableField("petCity")
    private String petCity;

    @TableField("petDelete")
    private Integer petDelete;

    private LocalDate submissionDate;


}
