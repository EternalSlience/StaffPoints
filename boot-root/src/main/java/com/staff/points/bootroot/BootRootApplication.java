package com.staff.points.bootroot;

import com.staff.points.tc.autoconfig.MysqlConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(MysqlConfig.class)
@ComponentScan("com.staff.points")
public class BootRootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootRootApplication.class, args);
    }

}
