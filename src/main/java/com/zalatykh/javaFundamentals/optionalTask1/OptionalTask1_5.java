package com.zalatykh.javaFundamentals.optionalTask1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numsAllCont = new ArrayList<>();
        ArrayList<String> numsEqAmntOfContAndUnc = new ArrayList<>();

        System.out.println("Enter some numbers");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        System.out.println(Arrays.toString(numbers));

        int countable = 0;
        int uncountable = 0;

        for (String number : numbers) {
            for (int i = 0; i < number.length(); i++) {
                int charNum = (int) number.charAt(i);
                if (charNum % 2 == 0) {
                    countable++;
                } else {
                    uncountable++;
                }
            }
            if (uncountable == 0) {
                numsAllCont.add(number);
            }
            if (countable == uncountable) {
                numsEqAmntOfContAndUnc.add(number);
            }
            countable = 0;
            uncountable = 0;
        }
        System.out.println(numsAllCont.size() + " number(s) with only countable digits: " + numsAllCont);
        System.out.println(numsEqAmntOfContAndUnc.size() + " number(s) with equal amount countable and uncountable: " + numsEqAmntOfContAndUnc);
    }
}

