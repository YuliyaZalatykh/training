package com.zalatykh.javaFundamentals.optionalTask2;

import java.util.Random;
import java.util.Scanner;

public class OptionalTask2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        Random random = new Random();
        System.out.println("Enter interval random");
        int interval = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(interval * 2 + 1) - interval;
                System.out.printf("%2d ", array[i][j]);
            }
            System.out.println();
        }

        Integer a = null;
        Integer b = null;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0) {
                    if (a != null) {
                        b = j;
                        break;
                    } else {
                        a = j;
                    }
                }
            }

            int sum = 0;
            if (a != null && b != null && b != a + 1) {
                for (int k = a + 1; k < b; k++) {
                    sum = sum + array[i][k];
                }
                System.out.println(sum);
            } else {
                System.out.println("empty");
            }
            a = null;
            b = null;
        }
    }
}
