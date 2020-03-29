package com.zalatykh.javaFundamentals.optionalTask1;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers");
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");

        String temp;
        for (int j = 0; j < numbers.length - 1; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                int firstNumber = numbers[i].length();
                int secondNumber = numbers[i + 1].length();
                if (firstNumber > secondNumber) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        System.out.println("Sort descending" + Arrays.toString(numbers));

        for (int j = 0; j < numbers.length - 1; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                int firstNumber = numbers[i].length();
                int secondNumber = numbers[i + 1].length();
                if (firstNumber < secondNumber) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        System.out.println("Sort ascending" + Arrays.toString(numbers));


    }
}
