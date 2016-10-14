package cn.com.nfky.spring_quartz_learning.thinkinginjava;

public class Lower extends Upper{
    String lowerString = null;
    public Lower(){
        super();
        System.out.println("Upper:" + upperString);
        System.out.println("Lower:" + lowerString);
    }
    
    public static void main(String[] args) {
        new Lower();
    }
}
