package com.company;

import java.awt.*;

public class Point {
    double x;
    double y;
    Color c;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(Point another) {
        x = another.x;
        y = another.y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(Color c) {
        this.c = c;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", c=" + c +
                '}';
    }

    public double distanceTo(Point another) {
        return Math.sqrt((x - another.x) * (x - another.x) + (y - another.y) * (y - another.y));
    }

    public double distanceXTo(Point another) {
        return Math.abs(x - another.x);
    }

    public double distanceYTo(Point another) {
        return Math.abs(y - another.y);
    }
}