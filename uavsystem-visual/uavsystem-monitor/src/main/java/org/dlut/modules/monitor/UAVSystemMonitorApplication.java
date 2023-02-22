package org.dlut.modules.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 监控中心
 * 
 * @author UAVSystem
 */
@EnableAdminServer
@SpringBootApplication
public class UAVSystemMonitorApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(UAVSystemMonitorApplication.class, args);
        System.out.println("监控中心启动成功");
    }
}
