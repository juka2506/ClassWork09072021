package com.company;

public class Rectangle {

    private int breadth;
    private int length;

    public Rectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }

    public Rectangle() {
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public int getArea() {
        return this.length * this.breadth;
    }

    public int getPerimeter() {
        return 2 * (this.length + this.breadth);
    }
}
