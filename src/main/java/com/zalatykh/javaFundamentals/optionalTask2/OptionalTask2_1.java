package com.zalatykh.javaFundamentals.optionalTask2;

import java.util.Random;
import java.util.Scanner;

public class OptionalTask2_1 {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int arraySize = scanner.nextInt();
        int[][] array = new int[arraySize][arraySize];

        System.out.println("Enter interval of filling");
        int randomInterval = scanner.nextInt();

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                array[i][j] = random.nextInt(randomInterval * 2 + 1) - randomInterval;
                System.out.printf("%2d ", array[i][j]);
            }
            System.out.println();
        }

        System.out.println("which column do you want to sort?");
        int column = scanner.nextInt() - 1;

        for (int iteration = 0; iteration < arraySize - 1; iteration++) {
            for (int i = 0; i < arraySize - 1; i++) {
                if (array[i][column] > array[i + 1][column]) {
                    int temp;
                    temp = array[i][column];
                    array[i][column] = array[i + 1][column];
                    array[i + 1][column] = temp;
                }
            }
        }

        System.out.println("Sorted array");
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                System.out.printf("%2d ", array[i][j]);
            }
            System.out.println();
        }

        System.out.println("which line do you want to sort? ");
        int line = scanner.nextInt() - 1;
        for (int iteration = 0; iteration < arraySize - 1; iteration++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[line][j] > array[line][j + 1]) {
                    int temp = array[line][j];
                    array[line][j] = array[line][j + 1];
                    array[line][j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array");
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                System.out.printf("%2d", array[i][j]);
            }
            System.out.println();
        }
    }
}
