package com.qfwj.quarzspring.quartz;

import com.qfwj.quarzspring.quartz.entity.TaskInfo;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhbo on 2017/5/13.
 */
@Component
public class JobManager {
    @Autowired
    Scheduler scheduler;

    @SuppressWarnings("unchecked")
    public  void addJob(TaskInfo info){
        String jobName = info.getJobName(),
                jobGroup = info.getJobGroup(),
                cronExpression = info.getCronExpression(),
                jobDescription = info.getJobDescription();
        try {
            TriggerKey triggerKey = TriggerKey.triggerKey(jobName, jobGroup);
            JobKey jobKey = JobKey.jobKey(jobName, jobGroup);

            CronScheduleBuilder schedBuilder = CronScheduleBuilder.cronSchedule(cronExpression).withMisfireHandlingInstructionDoNothing();
            CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(triggerKey).withDescription("").withSchedule(schedBuilder).build();


            Class<? extends Job> clazz = (Class<? extends Job>)Class.forName(jobName);
            JobDetail jobDetail = JobBuilder.newJob(clazz).withIdentity(jobKey).withDescription(jobDescription).build();
            scheduler.scheduleJob(jobDetail, trigger);
        } catch (SchedulerException |ClassNotFoundException e) {
           e.printStackTrace();
        }

    }
}
