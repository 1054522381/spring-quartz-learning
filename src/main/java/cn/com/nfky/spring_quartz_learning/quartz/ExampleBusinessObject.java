package cn.com.nfky.spring_quartz_learning.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import cn.com.nfky.spring_quartz_learning.annotation.async.SampleBean;

@Component
public class ExampleBusinessObject {
    private static final Logger log = LoggerFactory.getLogger(SampleBean.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    public void doIt() {
        log.info("quartz doIt():The time is now {}", dateFormat.format(new Date()));
    }
}
