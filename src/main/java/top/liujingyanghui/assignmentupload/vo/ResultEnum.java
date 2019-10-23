package top.liujingyanghui.assignmentupload.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ResultEnum {

    SUCCESS(0,"请求成功"),
    ERROR(1,"请求失败")

    ;
    private int status;
    private String message;
}
