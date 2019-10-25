package top.liujingyanghui.assignmentupload.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户表
 */
@Data
public class User {

    private Long id;

    /**
     * 密码
     */
    private String password;

    /**
     *  邮箱
     */
    private String email;

    /**
     *  角色
     */
    private String role;

    /**
     *  姓名
     */
    private String name;

    /**
     *  用户详细信息ID
     */
    private Long infoId;

    /**
     * 注册时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 最后登录时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastLoginTime;
}
