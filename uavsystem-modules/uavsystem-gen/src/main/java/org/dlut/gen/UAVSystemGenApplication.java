package org.dlut.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.dlut.common.security.annotation.EnableCustomConfig;
import org.dlut.common.security.annotation.EnableUAVFeignClients;
import org.dlut.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 * 
 * @author UAVSystem
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableUAVFeignClients
@SpringBootApplication
public class UAVSystemGenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(UAVSystemGenApplication.class, args);
        System.out.println("代码生成模块启动成功");
    }
}
