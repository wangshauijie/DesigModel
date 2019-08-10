package com.shuaijie.abstractFactory;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color blue = colorFactory.getColor("BlUE");
        blue.fill();
    }
}
