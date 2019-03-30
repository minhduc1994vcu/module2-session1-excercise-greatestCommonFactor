package com.codegym.factor;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int number1 = Math.abs(scanner.nextInt());
        System.out.println("enter the second number: ");
        int number2 = Math.abs(scanner.nextInt());
        if (number1 == 0 || number2 == 0) {
            System.out.println(" no greatest common factor");
        } else {
            while (number1 != number2) {
                if (number1 > number2) {
                    number1 = number1 - number2;
                } else {
                    number2 = number2 - number1;
                }
            }
        }
        System.out.println("the greatest common factor is " + number1);

    }
}
