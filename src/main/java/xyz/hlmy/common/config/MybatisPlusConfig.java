package xyz.hlmy.common.config;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import xyz.hlmy.common.customize.CustomIdGenerator;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @ProjectName: LearningRights
 * @ClassName: MybatisPlusConfig
 * @Author: lipenghui
 * @Description: MybaitsPlus配置
 * @Date: 2022/11/11 14:42
 */
@Configuration
@MapperScan("xyz.hlmy.modules.*.mapper")
@EnableTransactionManagement
public class MybatisPlusConfig {
    @Resource
    private DataSource dataSource;


    /**
     * 配置事物管理器
     *
     * @return DataSourceTransactionManager
     */
    @Bean(name = "transactionManager")
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }


    /**
     * 配置自定义ID
     *
     * @return IdentifierGenerator
     */
    @Bean
    public IdentifierGenerator identifierGenerator() {
        return new CustomIdGenerator();
    }

}
