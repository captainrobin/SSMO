package com.ssmo.controller.tool;

import org.springframework.beans.factory.InitializingBean;

public class InitDataListener implements InitializingBean {

	public void afterPropertiesSet() throws Exception {
		System.out.println("初始化加载一次！");
		
	}

}
