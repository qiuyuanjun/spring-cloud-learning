package com.qiuyj.feignserviceconsumer;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qiuyj
 * @since 2018/3/27
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignServiceConsumerStarter {

  public static void main(String[] args) {
    SpringApplication sa = new SpringApplication(FeignServiceConsumerStarter.class);
    sa.setBannerMode(Banner.Mode.OFF);
    sa.run(args);
  }
}