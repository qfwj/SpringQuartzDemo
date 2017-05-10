/**
 * Copyright(c) 2013-2015 by Puhuifinance Inc.
 * All Rights Reserved
 */
package com.qf.quartzSpring.taskservice;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qf.quartzSpring.entity.TaskInfo;
import com.qf.quartzSpring.job.FirstJob;
import com.qf.quartzSpring.manager.TaskManager;

/**   
 * @ClassName:  FirstJobService   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhbo
 * @date:   2017年5月10日 下午10:39:55   
 *     
 * @Copyright: 2017 . All rights reserved. 
 *
 */
@Component
public class FirstJobService {
	 @Autowired
	 TaskManager taskManager;
	 @PostConstruct
	public void addJob(){
		TaskInfo  info = new TaskInfo();
		info.setCronExpression("0/10 * * * * ?");
		info.setJobGroup("job");
		info.setJobName(FirstJob.class.getName());
		taskManager.addJob(info);
	}
}
