package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/**
 * 在外部tomcat中运行，注意用外部的tomcat运行时，application.yml代码中配置的serverPath 和端口号 将失效，以外部tomcat配置为准
 */

@SpringBootApplication
public class RunApplication extends SpringBootServletInitializer {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(RunApplication.class, args);
    }

}


