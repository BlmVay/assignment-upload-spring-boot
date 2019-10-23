package top.liujingyanghui.assignmentupload.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import top.liujingyanghui.assignmentupload.vo.ResultEnum;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MyException extends RuntimeException {

    private ResultEnum exceptionEnum;

}