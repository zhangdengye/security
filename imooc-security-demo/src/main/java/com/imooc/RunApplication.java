package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 在外部tomcat中运行，注意用外部的tomcat运行时，application.yml代码中配置的serverPath 和端口号 将失效，以外部tomcat配置为准
 */

@SpringBootApplication
// session 数据存储在redis中
@EnableRedisHttpSession
public class RunApplication extends SpringBootServletInitializer {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(RunApplication.class, args);
    }

}


