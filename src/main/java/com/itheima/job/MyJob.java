package com.itheima.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建日期 : 2020/10/26 17:27
 */
@Controller
public class MyJob {
    private static final SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    /**
     * initialDelay: 启动时延迟多少毫秒后才执行
     * fixedDelay: 每间隔多长时间执行
     * 注解指定方法运行 xml文件中要添加   <task:annotation-driven/>
     * 注解支持 【注意】：使用的约束是spring-task，不要导错了
     */
    @Scheduled(initialDelay = 1000,fixedDelay = 2000)
    public void ff(){
        System.out.println(Thread.currentThread()+" : "+sdf.format(new Date()));
    }
}
