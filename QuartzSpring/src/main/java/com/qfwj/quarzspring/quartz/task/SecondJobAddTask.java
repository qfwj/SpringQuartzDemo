package com.qfwj.quarzspring.quartz.task;

import com.qfwj.quarzspring.quartz.JobManager;
import com.qfwj.quarzspring.quartz.entity.TaskInfo;
import com.qfwj.quarzspring.quartz.job.SecondJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhbo on 2017/5/13.
 */
@Component
public class SecondJobAddTask {
    @Autowired
    JobManager jobManager;
    public void  addJob(){
        TaskInfo info = new TaskInfo();
        info.setJobName(SecondJob.class.getName());
        info.setJobDescription("第二个任务");
        info.setCronExpression("0/5 * * * * ?");
        jobManager.addJob(info);
    }
}
