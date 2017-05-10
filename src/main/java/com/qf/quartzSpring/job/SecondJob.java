/**
 * Copyright(c) 2013-2015 by Puhuifinance Inc.
 * All Rights Reserved
 */
package com.qf.quartzSpring.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**   
 * @ClassName:  SecondJob   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhbo
 * @date:   2017年5月10日 下午10:22:13   
 *     
 * @Copyright: 2017 . All rights reserved. 
 *
 */
public class SecondJob implements Job {

	/**   
	 * @Title: execute   
	 * @Description: TODO   
	 * @param:      
	 * @return:     
	 * @throws   
	 */ 
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		
		System.out.println("########" + SecondJob.class.getName()+
				Thread.currentThread().getName() + "#######");
		
	}

}
