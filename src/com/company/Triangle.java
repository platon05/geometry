package com.company;

import java.awt.*;
import java.util.Random;

public class Triangle {
    Point point1;
    Point point2;
    Point point3;
    double a;
    double b;
    double c;

    Triangle(Point v1, Point v2, Point v3) {
        point1 = v1;
        point2 = v2;
        point3 = v3;
    }

    double getSurface() {
        return ((point1.x - point3.x) * (point2.y - point3.y) - (point2.x - point3.x) * (point1.y - point3.y)) / 2;
    }

    double petPerimeter() {
        a = Math.sqrt((point1.x - point2.x) * (point1.x - point2.x) + (point1.y - point2.y) * (point1.y - point2.y));
        b = Math.sqrt((point2.x - point3.x) * (point2.x - point3.x) + (point3.y - point2.y) * (point3.y - point2.y));
        c = Math.sqrt((point1.x - point3.x) * (point1.x - point3.x) + (point1.y - point3.y) * (point1.y - point3.y));
        return (a + b + c) / 2;
    }

    boolean isIsoceles() {
        if (a == b) {
            return true;
        }
        else if (a == c) {
            return true;
        }
        else if (b == c) {
            return true;
        }
        else {
            return false;
        }
    }

    boolean isRectangle() {
        return a * a + b * b == c * c;
    }

    boolean estEquilateral() {
        return a == b && b == c;
    }

    @Override
    public String toString() {
        return "Point{(" + point1 + "), (" + point2 + "), (" + point3 + ")}";
    }

    void move(double dx, double dy) {
        point1.x += dx;
        point1.y += dy;
        point2.x += dx;
        point2.y += dy;
        point3.x += dx;
        point3.y += dy;
    }

    Color setColor() {
        Random r = new Random();
        return new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }
}