package top.liujingyanghui.assignmentupload.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ResultEnum {

    SUCCESS(0,"请求成功"),
    ERROR(1,"未知错误"),

    USER_IS_EXIST(2,"用户已存在")

    ;
    private int status;
    private String message;
}
