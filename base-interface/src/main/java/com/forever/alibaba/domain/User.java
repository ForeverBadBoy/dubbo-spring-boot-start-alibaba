package com.forever.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author liuhq
 * @date 2019/1/29
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
  private int id;
  private String name;
}
