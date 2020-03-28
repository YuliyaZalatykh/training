package com.zalatykh.javaFundamentals.mainTask;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int sum = 0;
        int product = 1;

        for (int number : numbers) {
            sum += number;
            product *= number;
        }
        System.out.println("Sum of args = " + sum);
        System.out.println("Product of args = " + product);
    }

}
