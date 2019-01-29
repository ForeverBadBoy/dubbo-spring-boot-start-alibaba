package com.forever.alibaba.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.forever.alibaba.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuhq
 * @date 2019/1/29
 */
@RestController
@RequestMapping("/time")
public class TimeController {

  @Reference
  private TimeService timeService;

  @GetMapping
  public String sayHello(){
    return timeService.getTime();
  }

}
