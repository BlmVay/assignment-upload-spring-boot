package top.liujingyanghui.assignmentupload.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

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
     *  学号
     */
    private String studentId;

    /**
     *  性别
     */
    private String sex;

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
