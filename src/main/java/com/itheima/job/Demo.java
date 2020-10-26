package com.itheima.job;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 创建触发器
 * 创建日期 : 2020/10/26 17:47
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //读取配置文件
        new ClassPathXmlApplicationContext("classpath:spring.xml");
        //阻塞
        System.in.read();
    }
}
