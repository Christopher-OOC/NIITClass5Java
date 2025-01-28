package org.example.fx;

import java.util.Random;
import java.util.Scanner;

public class RandomQuestions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of questions you want to answer: ");
        int numberOfQuestions = scanner.nextInt();

        String solution = "";
        int correctNumberOfAnswers = 0;
        Random random = new Random();

        for (int currentQuestion = 1; currentQuestion <= numberOfQuestions; currentQuestion++) {

            int number1 = random.nextInt(10);
            int number2 = random.nextInt(10);
            int result = number1 + number2;

            System.out.print("What is " + number1 + " + " + number2 + " = ");
            int answer = scanner.nextInt();

            solution = solution + number1 + " + " + number2 + " = " + result + "\n";

            if (answer == result) {
                correctNumberOfAnswers++;
            }
            System.out.println("Correct " + correctNumberOfAnswers);
        }

        System.out.println("You got " + correctNumberOfAnswers + " out of " + numberOfQuestions);
        System.out.println("The solution is");
        System.out.println(solution);
    }
}
