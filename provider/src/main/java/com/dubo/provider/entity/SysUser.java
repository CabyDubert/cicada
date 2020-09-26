package com.dubo.provider.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    /**
     * 用户id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 登录名，不可改
     */
    @TableField(value = "user_name")
    private String userName;
    /**
     * 用户昵称，可改
     */
    @TableField(value = "nick_name")
    private String nickName;
    /**
     * 已加密的登录密码
     */
    private String password;
    /**
     * 加密盐值
     */
    private String salt;
    /**
     * 是否禁用
     */
    @TableField(value = "forbidden_status")
    private Boolean forbiddenStatus;
    /**
     * 创建时间
     */
    private Date ct;
    /**
     * 修改时间
     */
    private Date mt;

    @Override
    protected Serializable pkVal() {
        return id;
    }

}
