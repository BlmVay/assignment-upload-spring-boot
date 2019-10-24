package top.liujingyanghui.assignmentupload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.liujingyanghui.assignmentupload.entity.User;
import top.liujingyanghui.assignmentupload.service.UserService;
import top.liujingyanghui.assignmentupload.vo.Result;

@RestController
@RequestMapping("api")
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public String test() {
        return "测试";
    }

    @PostMapping("auth/register")
    public Result register(@RequestBody User user) {
        return Result.success(userService.register(user));
    }
}
