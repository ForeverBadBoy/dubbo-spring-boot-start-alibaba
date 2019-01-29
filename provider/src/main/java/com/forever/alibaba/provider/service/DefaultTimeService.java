package com.forever.alibaba.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.forever.alibaba.service.TimeService;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * @author liuhq
 * @date 2019/1/29
 */
@Service(
    interfaceClass = TimeService.class
)
@Component
public class DefaultTimeService implements TimeService {

  @Override
  public String getTime() {
    return "provider:" + TimeZone.getDefault().getDisplayName()
        + new SimpleDateFormat("Y年M月d日H时m分s秒").format(System.currentTimeMillis());
  }
}
