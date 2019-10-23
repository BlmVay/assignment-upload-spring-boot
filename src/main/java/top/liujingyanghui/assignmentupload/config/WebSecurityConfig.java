package top.liujingyanghui.assignmentupload.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity // 开启WebSecurity支持
@EnableGlobalMethodSecurity(prePostEnabled = true) // 开启prePostEnabled注解支持
public class WebSecurityConfig {
}
