package org.dlut.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 * 
 * @author UAVSystem
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class UAVSystemGatewayApplication
{
    public static void main(String[] args) {
        SpringApplication.run(UAVSystemGatewayApplication.class, args);
        System.out.println("网关系统启动成功");
    }
}
