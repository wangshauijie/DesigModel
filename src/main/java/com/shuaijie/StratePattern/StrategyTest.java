package com.shuaijie.StratePattern;

/**
 * @ClassName StrategyTest
 * @Description (测试类)
 * @Author WangSJ
 * @Date 2019/8/15 1:24
 * @Version 1.0
 */
public class StrategyTest {

    public static void main(String[] args) {

        //加法
        Context context = new Context(new AddStrategy());
        System.out.println(context.calucate(20,10));
    }
}
