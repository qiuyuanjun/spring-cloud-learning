package com.qiuyj.eurekaserviceprovider;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qiuyj
 * @since 2018/3/25
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaServiceProviderStarter {

  public static void main(String[] args) {
    SpringApplication sa = new SpringApplication(EurekaServiceProviderStarter.class);
    sa.setBannerMode(Banner.Mode.OFF);
    sa.run(args);
  }
}