package com.qiuyj.feignserviceconsumer.controller;

import com.qiuyj.feignserviceconsumer.service.FeignServiceCall;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiuyj
 * @since 2018/3/27
 */
@RestController
public class ConsumerController {

  private FeignServiceCall feignServiceCall;

  public ConsumerController(FeignServiceCall feignServiceCall) {
    this.feignServiceCall = feignServiceCall;
  }

  @GetMapping("consumer")
  public String feignConsumer() {
    return feignServiceCall.serviceCall() + " from feign";
  }
}
