package com.shuaijie.abstractFactory;

/**
 * 为Color和Shape类创建一个抽象工厂
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
