package com.example.javainterview.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author joakims
 * @create 2022-09-13-19:14
 **/

@ComponentScan("com.example.javainterview")
@Configuration(proxyBeanMethods = true)//确定为代理方式，单例模式。
@EnableTransactionManagement//开启事务管理
public class MyConfig {


}
