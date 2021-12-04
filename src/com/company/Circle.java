package com.company;

import java.lang.Math.*;
import java.util.Random;
import java.awt.Color;

public class Circle {
    Point center;
    double radius;

    Circle(Point c, double r) {
        center = c;
        radius = r;
    }

    void getSurface() {
        double s = radius * radius * Math.PI;
    }

    void getPerimeter() {
        double p = 2 * radius * Math.PI;
    }

    void getDiameter() {
        double d = 2 * radius;
    }

    @Override
    public String toString() {
        return "Point{x=" + center.x
                + "; y=" + center.y +
                "}, color=" + setColor();
    }

    void move(double dx, double dy) {
        center.x += dx;
        center.y += dy;
    }

    Color setColor() {
        Random r = new Random();
        return new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }
}