package com.company;

import java.awt.*;
import java.util.Random;

public class Rectangle {
    Point point;
    double edgeX;
    double edgeY;

    Rectangle(Point v, double myX, double myY) {
        edgeX = myX;
        edgeY = myY;
        point = v;
    }

    double getSurface() {
        return edgeX * edgeY;
    }

    double getPerimeter() {
        return (edgeX + edgeY) * 2;
    }

    @Override
    public String toString() {
        return "Point{x=" + point.x + "; y=" + point.y + "}";
    }

    void move(double dx, double dy) {
        point.x += dx;
        point.y += dy;
    }

    Color setColor() {
        Random r = new Random();
        return new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }
}