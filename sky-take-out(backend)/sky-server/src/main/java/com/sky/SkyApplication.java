package com.sky;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //开启注解方式的事务管理
@Slf4j
public class SkyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SkyApplication.class, args);
        log.info("\n" +
                "      _            _        _                      _   \n" +
                "     | |          | |      | |                    | |  \n" +
                "  ___| | ___   _  | |_ __ _| | _____    ___  _   _| |_ \n" +
                " / __| |/ / | | | | __/ _` | |/ / _ \\  / _ \\| | | | __|\n" +
                " \\__ \\   <| |_| | | || (_| |   <  __/ | (_) | |_| | |_ \n" +
                " |___/_|\\_\\\\__, |  \\__\\__,_|_|\\_\\___|  \\___/ \\__,_|\\__|\n" +
                "            __/ |                                      \n" +
                "           |___/                                       " +
                "\n" +
                "server started");
    }
}
