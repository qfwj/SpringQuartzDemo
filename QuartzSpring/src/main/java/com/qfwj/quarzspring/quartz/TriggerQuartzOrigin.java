package com.qfwj.quarzspring.quartz;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.qfwj.quarzspring.mutithread.RunableTask;

/**
 * Created by zhbo on 2017/5/13.
 */
@RestController

@Component
public class TriggerQuartzOrigin {
   /* @Autowired
    FirstJobAddTask firstJobAddTask;
    @Autowired
    SecondJobAddTask secondJobAddTask;*/
	@Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;
	 @Bean
	    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {

	       return new ThreadPoolTaskScheduler();

	    }
    @PostConstruct
    public  void  addJob(){
    	  
    	RunableTask run = new RunableTask();
    	CronTrigger cron = new CronTrigger("0/2 * * * * ?");
    	threadPoolTaskScheduler.schedule(run, cron);
        /*firstJobAddTask.addJob();
        secondJobAddTask.addJob();*/
    }
}
