/**
 * Copyright(c) 2013-2015 by Puhuifinance Inc.
 * All Rights Reserved
 */
package com.qfwj.quarzspring.mutithread;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**   
 * @ClassName:  ThreadTask   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhbo
 * @date:   2017年5月20日 上午7:22:47   
 *     
 * @Copyright: 2017 . All rights reserved. 
 *
 */
@Configuration
public class ThreadTaskFirst {

	@Scheduled(cron="0/5 * * * * ?")
	public void mutiThreadFir(){
		System.out.println("#######################任务一：" + Thread.currentThread().getName());
	}
}
