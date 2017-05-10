/**
 * Copyright(c) 2013-2015 by Puhuifinance Inc.
 * All Rights Reserved
 */
package com.qf.quartzSpring.manager;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qf.quartzSpring.entity.TaskInfo;

/**   
 * @ClassName:  TaskManager   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhbo
 * @date:   2017年5月10日 下午10:31:59   
 *     
 * @Copyright: 2017 . All rights reserved. 
 *
 */
@Component
public class TaskManager {
	@Autowired  
    private Scheduler scheduler; 
	@SuppressWarnings("unchecked")  
    public void addJob(TaskInfo info) {  
        String jobName = info.getJobName(),   
               jobGroup = info.getJobGroup(),   
               cronExpression = info.getCronExpression(),  
               jobDescription = info.getJobDescription(),  
               createTime = "yyyy-MM-dd HH:mm:ss";  
        try {  
            /*if (checkExists(jobName, jobGroup)) {  
                logger.info("===> AddJob fail, job already exist, jobGroup:{}, jobName:{}", jobGroup, jobName);  
                throw new ServiceException(String.format("Job已经存在, jobName:{%s},jobGroup:{%s}", jobName, jobGroup));  
            }  */
  
            TriggerKey triggerKey = TriggerKey.triggerKey(jobName, jobGroup);  
            JobKey jobKey = JobKey.jobKey(jobName, jobGroup);  
  
            CronScheduleBuilder schedBuilder = CronScheduleBuilder.cronSchedule(cronExpression).withMisfireHandlingInstructionDoNothing();  
            CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(triggerKey).withDescription(createTime).withSchedule(schedBuilder).build();  
  
  
            Class<? extends Job> clazz = (Class<? extends Job>)Class.forName(jobName);  
            JobDetail jobDetail = JobBuilder.newJob(clazz).withIdentity(jobKey).withDescription(jobDescription).build();  
            scheduler.scheduleJob(jobDetail, trigger);  
        } catch (SchedulerException | ClassNotFoundException e) {  
              
        }  
    }  
}
