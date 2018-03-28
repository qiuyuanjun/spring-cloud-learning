package com.qiuyj.cloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author qiuyj
 * @since 2018/3/28
 */
@SpringBootApplication
public class CloudConfigClientStarter {

  @Value("${qiuyj.spring.cloud.msg}")
  private String msg;

  public static void main(String[] args) {
    ConfigurableApplicationContext wac = new SpringApplicationBuilder(CloudConfigClientStarter.class)
        .bannerMode(Banner.Mode.OFF)
        .run(args);
    String msg = wac.getBean(CloudConfigClientStarter.class).msg;
    System.out.println(msg);
  }
}
