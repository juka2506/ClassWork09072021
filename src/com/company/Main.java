package com.company;

public class Main {

    public static void main(String[] args) {
        /*Rectangle rectangle = new Rectangle(5, 10);
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setBreadth(7);
        rectangle1.setLength(12);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of rectangle1: " + rectangle1.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle1.getPerimeter());
    */
        Calculator calculator = new Calculator();
        System.out.println(calculator.addValues(2, 4, 8, 9, 10, 11, 23, 25));
        int difference, product;
        float quotient;

        difference = calculator.subtractValues(60, 30);
        product = calculator.multiplyValue(3, 4, 2, 5);
        quotient = calculator.divideValues(40, 20);


        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

    }

}
