package com.huyanlong.redis.common.config;

import com.huyanlong.redis.entry.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

/**
 * @Author huyanlong
 * @Date 2021/2/28 0:12
 */
@Configuration(proxyBeanMethods = false)
public class WebConfig /*implements WebMvcConfigurer*/ {

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void configurePathMatch(PathMatchConfigurer configurer) {
                UrlPathHelper urlPathHelper = new UrlPathHelper();
                // 不移除：后面的内容。这样的化矩阵变量才能生效
                urlPathHelper.setRemoveSemicolonContent(false);
                configurer.setUrlPathHelper(urlPathHelper);
            }

            @Override
            public void addFormatters(FormatterRegistry registry) {
                registry.addConverter(new Converter<String, User>() {
                    @Override
                    public User convert(String source) {
                        if (source != null && source.split("-").length == 4) {
                            String[] split = source.split("-");
                            User user = new User();
                            user.setName(split[0]);
                            user.setAge(Integer.parseInt(split[1]));
                            user.setEmail(split[2]);
                            user.setIpAddr(split[3]);
                            return user;
                        }
                        return null;
                    }
                });
            }

            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedHeaders("*")
                        .allowedOrigins("http://localhost:8082")
                        .allowCredentials(true)
                        .allowedMethods("*")
                        .maxAge(2000);
//
//                registry.addMapping("/**")
//                        .allowedHeaders("*")
//                        .allowedMethods("*")
//                        .allowCredentials(true)
//                        .allowedOrigins("http://localhost:8082")
//                        .maxAge(2000);
            }
        };
    }
}
