package com.qiuyj.feignserviceconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qiuyj
 * @since 2018/3/27
 */
@FeignClient("eureka-service-provider-demo")
public interface FeignServiceCall {

  @GetMapping("dc")
  String serviceCall();
}
