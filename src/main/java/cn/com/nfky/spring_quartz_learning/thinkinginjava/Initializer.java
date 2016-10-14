package cn.com.nfky.spring_quartz_learning.thinkinginjava;

public class Initializer {
    static void init(final Upper upper){
        if(upper instanceof Lower){
            Lower lower = (Lower)upper;
            lower.lowerString  = "lowerInited";
        }
        upper.upperString = "upperInited";
    }
}
