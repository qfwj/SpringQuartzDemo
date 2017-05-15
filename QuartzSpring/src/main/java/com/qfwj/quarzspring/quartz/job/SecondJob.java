package com.qfwj.quarzspring.quartz.job;

import com.qfwj.quarzspring.controller.QuartzController;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhbo on 2017/5/13.
 */
public class SecondJob implements Job {
    @Autowired
    QuartzController  quartzController;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("#########我的测试数据2######");
        quartzController.index();
        System.out.println("#########我的测试数据2######");
    }
}
