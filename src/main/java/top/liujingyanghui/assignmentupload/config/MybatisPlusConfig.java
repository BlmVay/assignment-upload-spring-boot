package top.liujingyanghui.assignmentupload.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * mybatis plus 配置
 *
 * @author wdh
 */
@EnableTransactionManagement
@Configuration
@MapperScan("top.liujingyanghui.assignmentupload.dao")
public class MybatisPlusConfig {

    /**
     * 分页插件
     *
     * @returns
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
