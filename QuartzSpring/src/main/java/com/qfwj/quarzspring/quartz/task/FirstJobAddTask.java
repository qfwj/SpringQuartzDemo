package com.qfwj.quarzspring.quartz.task;

import com.qfwj.quarzspring.quartz.JobManager;
import com.qfwj.quarzspring.quartz.entity.TaskInfo;
import com.qfwj.quarzspring.quartz.job.FirstJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhbo on 2017/5/13.
 */
@Component
public class FirstJobAddTask {
    @Autowired
    JobManager jobManager;
    public void  addJob(){
        TaskInfo info = new TaskInfo();
        info.setJobName(FirstJob.class.getName());
        info.setJobDescription("第一个任务");
        info.setCronExpression("0/10 * * * * ?");
        jobManager.addJob(info);
    }
}
