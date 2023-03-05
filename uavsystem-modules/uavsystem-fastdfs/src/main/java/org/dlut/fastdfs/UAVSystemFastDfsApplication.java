package org.dlut.fastdfs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.dlut.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 文件服务
 * 
 * @author UAVSystem
 */
@EnableCustomSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class UAVSystemFastDfsApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(UAVSystemFastDfsApplication.class, args);
        System.out.println("文件服务模块启动成功");
    }
}
