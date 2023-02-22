package org.dlut.managedrone;

import org.dlut.common.security.annotation.EnableCustomConfig;
import org.dlut.common.security.annotation.EnableUAVFeignClients;
import org.dlut.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableCustomConfig
@EnableCustomSwagger2
@EnableUAVFeignClients
@SpringBootApplication
public class UAVSystemManageDrone {
    public static void main(String[] args) {
        SpringApplication.run(UAVSystemManageDrone.class, args);
    }
}
