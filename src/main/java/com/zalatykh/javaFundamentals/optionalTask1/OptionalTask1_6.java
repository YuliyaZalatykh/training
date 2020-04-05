package com.zalatykh.javaFundamentals.optionalTask1;

import java.util.Scanner;

public class OptionalTask1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers");
        String numbers = scanner.nextLine();
        String[] arrayNumbers = numbers.split(" ");

        for (String arrayNumber : arrayNumbers) {
            for (int j = 0; j < arrayNumber.length() - 1; j++) {
                int firstDigit = (int) arrayNumber.charAt(j);
                int secondDigit = (int) arrayNumber.charAt(j + 1);
                if (firstDigit > secondDigit) {
                    break;
                }
                if (j == arrayNumber.length() - 2) {
                    System.out.println(arrayNumber);
                }
            }
        }
    }
}
