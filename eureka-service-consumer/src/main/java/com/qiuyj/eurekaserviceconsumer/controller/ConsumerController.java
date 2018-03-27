package com.qiuyj.eurekaserviceconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author qiuyj
 * @since 2018/3/26
 */
@RestController
public class ConsumerController {

  private RestTemplate restTemplate;

  @Autowired
  public void setRestTemplate(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @GetMapping("consumer")
  public String serviceConsumer() {
    return restTemplate.getForObject("http://eureka-service-provider-demo/dc", String.class) + " from service consumer";
  }
}