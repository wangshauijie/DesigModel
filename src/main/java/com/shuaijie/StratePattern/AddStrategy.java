package com.shuaijie.StratePattern;

/**
 * 实现加法运算
 */
public class  AddStrategy implements Strategy{

    public int calculate(int a, int b) {
        return a+b;
    }

    public int calculateThree(int a, int b,int c) {
        return a+b+c;
    }

}
