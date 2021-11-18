package com.company;

import java.awt.*;

public class Rectangle {
    Point k;
    Point m;
    Color c;

    public Rectangle(Point v, double edgeX, double edgeY) {
        this.k = new Point(v);
        this.m = new Point(v.x + edgeX, v.y + edgeY);
    }

    public void move(double dx, double dy) {
        k.move(dx, dy);
        m.move(dx, dy);
    }

    public void setColor(Color c) {
        this.c = c;
    }

    public double getSurface() {
        return 2 * (k.distanceXTo(m) + k.distanceYTo(m));
    }

    public double getPerimeter() {
        return k.distanceXTo(m) * k.distanceYTo(m);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "k=" + k +
                ", m=" + m +
                ", c=" + c +
                '}';
    }
}