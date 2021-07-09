package com.company;

public class Calculator {

    public int addValues(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public int subtractValues(int biggerNumber, int smallerNumber) {
        return biggerNumber - smallerNumber;
    }

    public int multiplyValue(int... numbers) {
        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[i];
        }
        return product;
    }

    public float divideValues (float biggerNumber, float smallerNumber) {
        if (smallerNumber == 0) {
            System.out.println("Please do not put 0 as a divisor");
            return 0;
        } else {
            return biggerNumber / smallerNumber;
        }
    }

    public float averageValue(float... numbers) {
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

}
