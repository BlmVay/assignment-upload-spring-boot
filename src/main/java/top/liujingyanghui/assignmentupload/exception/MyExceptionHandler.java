package top.liujingyanghui.assignmentupload.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import top.liujingyanghui.assignmentupload.vo.Result;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public Result handleException(MyException e) {
        return Result.error(e.getExceptionEnum().getStatus(), e.getExceptionEnum().getMessage());
    }

}