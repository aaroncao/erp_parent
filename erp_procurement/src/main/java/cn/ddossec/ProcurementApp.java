package cn.ddossec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 采购模块
 * 唐疑豪
 */
// 启动类注解
@SpringBootApplication
// mapper接口的扫描
@MapperScan(basePackages = {"cn.ddossec.mapper"})
// 服务发现
@EnableDiscoveryClient
// 开启FeignAPI调用
@EnableFeignClients
public class ProcurementApp {

    public static void main(String[] args) {
        SpringApplication.run(ProcurementApp.class, args);
    }
}