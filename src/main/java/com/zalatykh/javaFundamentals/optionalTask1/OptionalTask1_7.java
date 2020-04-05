package com.zalatykh.javaFundamentals.optionalTask1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OptionalTask1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers");
        String numbers = scanner.nextLine();
        String[] arrayNumbers = numbers.split(" ");
        Set<Integer> digits = new HashSet<>();

        for (String number : arrayNumbers) {
            for (int i = 0; i < number.length(); i++) {
                int digit = (int) number.charAt(i);
                digits.add(digit);
            }
            if (number.length() == digits.size()) {
                System.out.println(number);
            }
            digits.clear();
        }
    }
}
