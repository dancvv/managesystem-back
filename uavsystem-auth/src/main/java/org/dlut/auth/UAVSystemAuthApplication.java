package org.dlut.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.dlut.common.security.annotation.EnableUAVFeignClients;

/**
 * 认证授权中心
 * 
 * @author UAVSystem
 */
@EnableUAVFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class UAVSystemAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(UAVSystemAuthApplication.class, args);
        System.out.println("认证授权中心启动成功");
    }
}
