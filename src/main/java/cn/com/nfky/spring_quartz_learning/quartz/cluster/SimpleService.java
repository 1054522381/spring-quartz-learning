package cn.com.nfky.spring_quartz_learning.quartz.cluster;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("simpleService")
public class SimpleService {
    
    private static final Logger log = LoggerFactory.getLogger(SimpleService.class);
    
    public void testMethod1(Class clz){
        //这里执行定时调度业务
        log.info("testMethod1.......{}", clz.getSimpleName());
    }
    
    public void testMethod2(Class clz){
        log.info("testMethod2.......{}", clz.getSimpleName()); 
    }
}
