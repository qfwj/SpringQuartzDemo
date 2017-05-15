package com.qfwj.quarzspring.quartz;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qfwj.quarzspring.quartz.task.FirstJobAddTask;
import com.qfwj.quarzspring.quartz.task.SecondJobAddTask;

/**
 * Created by zhbo on 2017/5/13.
 */
@Component
public class TriggerQuartzOrigin {
    @Autowired
    FirstJobAddTask firstJobAddTask;
    @Autowired
    SecondJobAddTask secondJobAddTask;

    @PostConstruct
    public  void  addJob(){
        firstJobAddTask.addJob();
        secondJobAddTask.addJob();
    }
}
