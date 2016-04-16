package com.springmaven.test.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ScheduledJob extends QuartzJobBean{
	
	private ProcessExecutor processExecutor;

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		processExecutor.printMessage();
	}
	
	public void setProcessExecutor(ProcessExecutor processExecutor) {
		this.processExecutor = processExecutor;
	}

}
