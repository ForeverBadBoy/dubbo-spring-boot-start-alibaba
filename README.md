## 本项目使用alibaba提供的2.0.0版本
### 前言: 
在maven的中央仓库我们可以找到两个springboot dubbo的依赖,他们分别是两个版本:

```xml
<dependency>
            <groupId>com.alibaba.spring.boot</groupId>
            <artifactId>dubbo-spring-boot-starter</artifactId>
            <version>2.0.0</version>
</dependency>
``` 
~~~xml
<dependency>
            <groupId>com.alibaba.boot</groupId>
            <artifactId>dubbo-spring-boot-starter</artifactId>
            <version>0.2.0</version>
</dependency> 
~~~

在两个都有使用,里面有一些具体的区别,我都做了尝试. 
经过查阅得知 2.0.0是alibaba/dubbo-spring-boot-starter,阿里捐给apache后,后者也有一个项目 
apache/incubator-dubbo,目前来看,后者最近一次更新距离现在更近,所以我认为大家可以优先考虑使用 apache的项目,大家也可以参考官方给的demo.地址如下: 
https://github.com/apache/incubator-dubbo
--------------------- 
### 额外说明
* alibaba的github源码可查看https://github.com/alibaba/dubbo-spring-boot-starter
##### 参考链接
> https://blog.csdn.net/ZzzPaul/article/details/82343603
> https://blog.csdn.net/qq_38306688/article/details/82707503