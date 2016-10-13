package cn.com.nfky.spring_quartz_learning.annotation.async;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class SampleBean {
    private static final Logger log = LoggerFactory.getLogger(SampleBean.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
    @Async
    public void doSomething() {
        log.info("doSomething:The time is now {}", dateFormat.format(new Date()));
    }
}
