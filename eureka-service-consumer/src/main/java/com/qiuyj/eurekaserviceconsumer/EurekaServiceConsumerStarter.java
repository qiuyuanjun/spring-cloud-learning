package com.qiuyj.eurekaserviceconsumer;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author qiuyj
 * @since 2018/3/26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaServiceConsumerStarter {

  @Bean
  @LoadBalanced
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  public static void main(String[] args) {
    SpringApplication sa = new SpringApplication(EurekaServiceConsumerStarter.class);
    sa.setBannerMode(Banner.Mode.OFF);
    sa.run(args);
  }
}
