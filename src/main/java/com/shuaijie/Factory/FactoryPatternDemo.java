package com.shuaijie.Factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取Circle对象,并调用draw方法
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        //RECTANGLE,并调用draw方法
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        //SQUARE,并调用draw方法
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
