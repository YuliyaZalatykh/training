package com.zalatykh.javaFundamentals.optionalTask1;

import java.util.Scanner;

public class OptionalTask1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers");
        String numbers = scanner.nextLine();
        String[] arrayNumbers = numbers.split(" ");

        int totalLength = 0;
        for (String arrayNumber : arrayNumbers) {
            totalLength += arrayNumber.length();
        }

        int mediumLength = totalLength / arrayNumbers.length;
        System.out.println("Medium length is " + mediumLength);

        System.out.print("Numbers are less than medium length ");
        for (String arrayNumber : arrayNumbers) {
            if (arrayNumber.length() < mediumLength) {
                System.out.print(arrayNumber + " ");
            }
        }
        System.out.println();

        System.out.print("Numbers are bigger than medium length ");
        for (String arrayNumber : arrayNumbers) {
            if (arrayNumber.length() > mediumLength) {
                System.out.print(arrayNumber + " ");
            }
        }
    }
}
