package org.dlut.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.dlut.common.security.annotation.EnableCustomConfig;
import org.dlut.common.security.annotation.EnableUAVFeignClients;
import org.dlut.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 * 
 * @author UAVSystem
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableUAVFeignClients
@SpringBootApplication
public class UAVSystemJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(UAVSystemJobApplication.class, args);
        System.out.println("定时任务模块启动成功");
    }
}
