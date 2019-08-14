package com.shuaijie.StratePattern;

/**
 * @ClassName Context
 * @Description (定义具体的环境绝色)
 * @Author WangSJ
 * @Date 2019/8/15 1:19
 * @Version 1.0
 */
public class Context {

    private  Strategy strategy;

    public  Context (Strategy strategy){
        super();
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calucate(int a, int b){
        return strategy.calculate(a,b);
    }
}
