package cn.com.nfky.spring_quartz_learning.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ExampleJob extends QuartzJobBean {
    private static final Logger log = LoggerFactory.getLogger(ExampleJob.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private int timeout;

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
    
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionCtx) throws JobExecutionException {
        // TODO Auto-generated method stub
        log.info("quartz timeout {} , now {}", this.timeout, dateFormat.format(new Date()));
    }

}
