/**
 * Copyright(c) 2013-2015 by Puhuifinance Inc.
 * All Rights Reserved
 */
package com.qfwj.quarzspring.mutithread;

/**   
 * @ClassName:  RunableTask   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhbo
 * @date:   2017年5月20日 上午8:37:59   
 *     
 * @Copyright: 2017 . All rights reserved. 
 *
 */
public class RunableTask implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		/**   
		 * @Title: run   
		 * @Description: TODO   
		 * @param:      
		 * @return:     
		 * @throws   
		 */
		System.out.println("@@@@@@@@@  RunableTask成功了!");

	}

}
