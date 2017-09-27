package com.ssmo.controller.tool;

import org.springframework.beans.factory.InitializingBean;

import com.ssmo.controller.jpush.PushExample;

public class InitDataListener implements InitializingBean {

	public void afterPropertiesSet() throws Exception {
		System.out.println("初始化加载！");
		//PushExample.testSendPush();
		
	}

}
