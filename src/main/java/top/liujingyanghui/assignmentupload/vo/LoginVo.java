package top.liujingyanghui.assignmentupload.vo;

import lombok.Data;

/**
 * 登录Vo
 */
@Data
public class LoginVo {

    /**
     * 姓名
     */
    private String name;

    /**
     * 角色
     */
    private String role;

    /**
     * token
     */
    private String token;
}
