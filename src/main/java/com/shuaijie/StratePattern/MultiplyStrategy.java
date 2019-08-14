package com.shuaijie.StratePattern;

/**
 * @ClassName MultiplyStrategy
 * @Description (实现乘法)
 * @Author WangSJ
 * @Date 2019/8/15 1:15
 * @Version 1.0
 */
public class MultiplyStrategy implements Strategy{
    public int calculate(int a, int b) {
        return a*b;
    }
}
