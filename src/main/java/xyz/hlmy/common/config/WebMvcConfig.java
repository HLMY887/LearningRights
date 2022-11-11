package xyz.hlmy.common.config;

import cn.dev33.satoken.context.SaHolder;
import cn.dev33.satoken.filter.SaServletFilter;
import cn.dev33.satoken.interceptor.SaInterceptor;
import cn.dev33.satoken.stp.StpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ProjectName: LearningRights
 * @ClassName: WebMvcConfig
 * @Author: lipenghui
 * @Description: 拦截器
 * @Date: 2022/11/11 16:22
 */
//@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private final Logger logger = LoggerFactory.getLogger(WebMvcConfig.class);

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册注解拦截器，并排除不需要注解鉴权的接口地址 (与登录拦截器无关)
        registry.addInterceptor(new SaInterceptor(handle -> StpUtil.checkLogin()))
                .addPathPatterns("/**")
                .excludePathPatterns("/login");
    }

    /**
     * 注册 [Sa-Token全局过滤器]
     */
    @Bean
    public SaServletFilter getSaServletFilter() {
        return new SaServletFilter().setBeforeAuth(r -> {
            SaHolder.getResponse()
                    // 服务器名称
                    .setServer("sa-server")
                    // 是否可以在iframe显示视图： DENY=不可以 | SAMEORIGIN=同域下可以 | ALLOW-FROM uri=指定域名下可以
                    .setHeader("X-Frame-Options", "SAMEORIGIN")
                    // 是否启用浏览器默认XSS防护： 0=禁用 | 1=启用 | 1; mode=block 启用, 并在检查到XSS攻击时，停止渲染页面
                    .setHeader("X-XSS-Protection", "1; mode=block")
                    // 禁用浏览器内容嗅探
                    .setHeader("X-Content-Type-Options", "nosniff");
        });
    }

    /**
     * 获取放行路由列表
     *
     * @return 路由集合
     */
//    public List<String> getExcludeList() {
//        List<String> excludes = satokenProperties.getExcludes();
//        logger.info("############# 放行路由START ##############");
//        if (excludes != null) {
//            excludes.forEach(logger::info);
//        }
//        logger.info("############# 放行路由END ##############");
//        return excludes;
//    }
}
