package com.qfwj.quarzspring.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import com.qfwj.quarzspring.controller.QuartzController;

/**
 * Created by zhbo on 2017/5/13.
 */
public class FirstJob implements Job{
    @Autowired
    QuartzController quartzController;
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("#########我的测试数据1######");
        quartzController.index();
        System.out.println("#########我的测试数据1######");
    }
}
