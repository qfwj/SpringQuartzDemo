/**
 * Copyright(c) 2013-2015 by Puhuifinance Inc.
 * All Rights Reserved
 */
package com.qf.quartzSpring.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**   
 * @ClassName:  FirstJob   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhbo
 * @date:   2017年5月10日 下午10:18:52   
 *     
 * @Copyright: 2017 . All rights reserved. 
 *
 */
public class FirstJob implements Job {

	/**   
	 * @Title: execute   
	 * @Description: TODO   
	 * @param:      
	 * @return:     
	 * @throws   
	 */ 
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		
		System.out.println("@@@@@@@@@@" + FirstJob.class.getName()+
				Thread.currentThread().getName() + "@@@@@");
		
		
	}

}
