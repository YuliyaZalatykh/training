package com.zalatykh.javaFundamentals.mainTask;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.printf("Hello %s!", name);
    }
}
