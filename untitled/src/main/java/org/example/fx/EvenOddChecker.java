package org.example.fx;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        do {
            System.out.print("Enter any positive integer: ");
            input = scanner.nextInt();

            if (input >= 1) {
                if (input % 2 == 0) {
                    System.out.println(input + " is an even number!");
                }
                else {
                    System.out.println(input + " is an odd number!");
                }
            }
        } while (input >= 1);
        System.out.println(input + " is not a valid number!");

//        System.out.print("Enter any positive integer: ");
//        int input = scanner.nextInt();
//
//        while (input >= 1) {
//            if (input % 2 == 0) {
//                System.out.println(input + " is an even number!");
//            }
//            else {
//                System.out.println(input + " is an odd number!");
//            }
//            System.out.print("Enter any positive integer: ");
//            input = scanner.nextInt();
//        }
//        System.out.println(input + " is not a valid number!");
    }
}
