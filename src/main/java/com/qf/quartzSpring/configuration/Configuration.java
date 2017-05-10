/**
 * Copyright(c) 2013-2015 by Puhuifinance Inc.
 * All Rights Reserved
 */
package com.qf.quartzSpring.configuration;

import java.io.IOException;
import java.util.Properties;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**   
 * @ClassName:  Configuration   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhbo
 * @date:   2017年5月10日 下午10:24:01   
 *     
 * @Copyright: 2017 . All rights reserved. 
 *
 */
@Component
public class Configuration {

	@Bean
	public Scheduler startScheduler() throws IOException, SchedulerException{
		SchedulerFactory schedulerFactory = new StdSchedulerFactory(properties());  
        Scheduler scheduler = schedulerFactory.getScheduler();  
        scheduler.start();  
        return scheduler;  
	}
	
	
	public Properties properties(){
		Properties prop = new Properties();  
        prop.put("quartz.scheduler.instanceName", "ServerScheduler");  
        /*prop.put("org.quartz.scheduler.instanceId", "AUTO");  
        prop.put("org.quartz.scheduler.skipUpdateCheck", "true");*/  
        prop.put("org.quartz.scheduler.instanceId", "NON_CLUSTERED");  
        prop.put("org.quartz.scheduler.jobFactory.class", "org.quartz.simpl.SimpleJobFactory");   
        prop.put("org.quartz.threadPool.class", "org.quartz.simpl.SimpleThreadPool");  
        prop.put("org.quartz.threadPool.threadCount", "5");  
        return prop;
	}
}
