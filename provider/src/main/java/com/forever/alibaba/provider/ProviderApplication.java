package com.forever.alibaba.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liuhq
 * @date 2019/1/29
 */
@EnableDubboConfiguration
@SpringBootApplication
public class ProviderApplication {

  public static void main(String[] args) {
    //new SpringApplicationBuilder(ProviderApplication.class).web(WebApplicationType.NONE).run(args);
    SpringApplication.run(ProviderApplication.class, args);
  }

}
