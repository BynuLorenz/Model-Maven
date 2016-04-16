package com.springmaven.test.quartz;

import org.springframework.stereotype.Component;

@Component("processOne")
public class ProcessExecutor {
	
	public void printMessage(){
		System.out.println("I am called by Quartz jobBean using CronTriggerFactoryBean");
	}

}
