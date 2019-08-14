package com.shuaijie.StratePattern;

/**
 * @ClassName DivisionStrategy
 * @Description （实现除法运算）
 * @Author WangSJ
 * @Date 2019/8/15 1:16
 * @Version 1.0
 */
public class DivisionStrategy implements Strategy{
    public int calculate(int a, int b) {

        if (b != 0) {
            return a / b;
        }else{
            throw new RuntimeException("除数不能为零");
        }

    }
}
