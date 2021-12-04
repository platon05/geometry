package com.company;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(new Point(12, 15), 11);
        System.out.println(myCircle.toString());
        System.out.println(myCircle.setColor());
    }
}