package com.zalatykh.javaFundamentals.mainTask;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of numbers");
        int amount = scanner.nextInt();
        int[] array = new int[amount];

        for (int i = 0; i < amount; i++) {
            int random = (int) (Math.random() * 100);
            array[i] = random;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < amount; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
