package com.shuaijie.abstractFactory;

public class ColorFactory extends AbstractFactory{
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }


    Shape getShape(String shape) {
        return null;
    }
}
