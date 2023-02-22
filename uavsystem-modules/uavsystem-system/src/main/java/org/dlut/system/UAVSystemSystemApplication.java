package org.dlut.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.dlut.common.security.annotation.EnableCustomConfig;
import org.dlut.common.security.annotation.EnableUAVFeignClients;
import org.dlut.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 * 
 * @author UAVSystem
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableUAVFeignClients
@SpringBootApplication
public class UAVSystemSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(UAVSystemSystemApplication.class, args);
        System.out.println("系统模块启动成功");
    }
}
