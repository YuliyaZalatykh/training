package com.zalatykh.javaFundamentals.optionalTask1;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        System.out.println(Arrays.toString(numbers));

        int counter = 0;
        int min = Integer.MAX_VALUE;
        String minNumber = null;

        for (String number : numbers) {
            for (int digit = 0; digit < 9; digit++) {
                for (int j = 0; j < number.length(); j++) {
                    String charFromNumber = Character.toString(number.charAt(j));
                    String charFromDigit = Integer.toString(digit);
                    if (charFromNumber.equals(charFromDigit)) {
                        counter++;
                        break;
                    }
                }
            }
            if (min > counter) {
                min = counter;
                minNumber = number;
            }
            counter = 0;
        }

        System.out.println(minNumber + " " + min);
    }
}
