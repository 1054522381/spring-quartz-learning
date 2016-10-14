package cn.com.nfky.spring_quartz_learning.thinkinginjava;

public class Upper {
    String upperString;
    
    public Upper(){
        System.out.println("Upper's Constructor " + this.getClass().getSimpleName());
        Initializer.init(this);
    }
}
