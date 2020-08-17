package com.nopava.whodo;

import com.nopava.whodo.service.IUserService;
import com.nopava.whodo.service.Impl.IUserServiceImpl;
import javafx.application.Application;
import org.apache.catalina.core.ApplicationContext;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan("com.nopava.whodo.mapper")
@SpringBootApplication
public class WhoDoApplication {

    private static Logger log = LoggerFactory.getLogger(WhoDoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WhoDoApplication.class, args);
        log.info("<----- whoDo-server is running------>");
    }

}
