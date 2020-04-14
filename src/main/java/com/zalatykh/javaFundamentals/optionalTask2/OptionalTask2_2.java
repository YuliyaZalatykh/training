package com.zalatykh.javaFundamentals.optionalTask2;

import java.util.Random;
import java.util.Scanner;

public class OptionalTask2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter size of matrix");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        System.out.println("Enter interval of random");
        int interval = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(interval * 2 + 1) - interval;
                System.out.printf("%2d ", array[i][j]);
            }
            System.out.println();
        }
        int counter = 1;
        int maxCounter = 1;
        boolean isLast = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int el1 = array[i][j];
                int el2 = array[i][j+1];
                if(isLast){
                    el1 = array[i-1][array.length-1];
                    el2 = array[i][j];
                    j--;
                    isLast = false;
                }
                if (el1 < el2) {
                    counter++;
                } else {
                    if (maxCounter < counter) {
                        maxCounter = counter;
                    }
                    counter = 1;
                }
            }
            isLast = true;
        }
        System.out.println(maxCounter);
    }
}
