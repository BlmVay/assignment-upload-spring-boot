package top.liujingyanghui.assignmentupload.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.liujingyanghui.assignmentupload.entity.User;
import top.liujingyanghui.assignmentupload.vo.LoginVo;

public interface UserService extends IService<User> {

    /**
     * 注册
     * @param user
     * @return
     */
    LoginVo register(User user);
}
