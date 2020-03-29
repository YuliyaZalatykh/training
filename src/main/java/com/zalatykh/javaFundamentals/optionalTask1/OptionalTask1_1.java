package com.zalatykh.javaFundamentals.optionalTask1;

import java.util.Scanner;

public class OptionalTask1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers");
        String numbers = scanner.nextLine();
        String[] number= numbers.split(" ");

        String max=number[0];
        String min= number[0];
        for (int i =0 ; i<number.length; i++){
            if (number[i].length()>max.length()){
                max= number[i];
            }
           else if (number[i].length()<min.length()){
                min = number[i];
            }
        }
        System.out.println("Shortest number = "+ min);
        System.out.println("Longest number = "+ max);
    }
}
