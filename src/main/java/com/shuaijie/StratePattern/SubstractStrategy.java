package com.shuaijie.StratePattern;

/**
 * @ClassNameSubstractStrategy
 * @Description (实现减法运算)
 * @Author WangSJ
 * @Date 2019/8/15 1:14
 * @Version 1.0
 */
public class SubstractStrategy implements Strategy{

    public int calculate(int a, int b) {
        return a-b;
    }
}
