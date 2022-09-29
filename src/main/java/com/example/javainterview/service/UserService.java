package com.example.javainterview.service;

import org.apache.catalina.startup.Tomcat;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author joakims
 * @create 2022-09-13-19:49
 **/

@Component
public class UserService implements InitializingBean
{
    @Override
    public void afterPropertiesSet() throws Exception {
//        throw new NullPointerException();

    }

    @Transactional
    public void test(){

        Tomcat tomcat = new Tomcat();
        tomcat.getServer();

    }
}
