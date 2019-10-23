package top.liujingyanghui.assignmentupload.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import top.liujingyanghui.assignmentupload.dao.UserMapper;
import top.liujingyanghui.assignmentupload.entity.JwtUser;
import top.liujingyanghui.assignmentupload.entity.User;

import java.util.Collections;

@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public JwtUser loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getEmail, email));
        if (user == null) {
            log.info(email + "该用户不存在");
            throw new UsernameNotFoundException("用户名不存在");
        }
        return new JwtUser(user.getId(), user.getEmail(), user.getPassword(), user.getRole(),
                Collections.singleton(new SimpleGrantedAuthority(user.getRole())));
    }
}
