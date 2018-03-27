package com.qiuyj.eurekaserviceprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiuyj
 * @since 2018/3/25
 */
@RestController
public class DcController {

  private DiscoveryClient dc;

  @Autowired
  public void setDiscoveryClient(DiscoveryClient dc) {
    this.dc = dc;
  }

  @GetMapping("dc")
  public String dc() {
    return "Current service info: " + dc.getServices();
  }
}