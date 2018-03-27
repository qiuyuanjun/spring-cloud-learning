package com.qiuyj.cloudconfigserver;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author qiuyj
 * @since 2018/3/27
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerStarter {

  public static void main(String[] args) {
    SpringApplication sa = new SpringApplication(CloudConfigServerStarter.class);
    sa.setBannerMode(Banner.Mode.OFF);
    sa.run(args);
  }
}
