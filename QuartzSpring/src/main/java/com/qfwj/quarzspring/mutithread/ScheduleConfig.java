/**
 * Copyright(c) 2013-2015 by Puhuifinance Inc.
 * All Rights Reserved
 */
package com.qfwj.quarzspring.mutithread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**   
 * @ClassName:  ExecutorConfiguration   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhbo
 * @date:   2017年5月20日 上午8:05:55   
 *     
 * @Copyright: 2017 . All rights reserved. 
 *
 */
/*@Configuration*/
/*@EnableScheduling*/
public class ScheduleConfig implements SchedulingConfigurer {
 
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(taskExecutor());
    }
 
    @Bean(destroyMethod="shutdown")
    public Executor taskExecutor() {
        return Executors.newScheduledThreadPool(10);
    }
}