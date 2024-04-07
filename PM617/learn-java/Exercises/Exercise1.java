package Exercises;

import java.util.Scanner;
// This is the template code. 

public class Exercise1 {

    public static void main(String args[]) {
        String question = "Which station is one of Glasgow subway station? ";
        String choiceOne = "Argyle";
        String choiceTwo = "Buchanan";
        String choiceThree = "Clyde";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("A: " + choiceOne);
        System.out.println("B: " + choiceTwo);
        System.out.println("C: " + choiceThree);
        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        // Retrieve the user's input
        // If the user's input matches the correctAnswer...
        if (answer.equals(correctAnswer)) {
            System.out.println("Congratulation! You are right! ");
        }
        // then the user is correct and we want to print out a congrats message to the
        // user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the
        // user
        // is incorrect as well as what the correct choice was.
        else {
            System.out.println("Sorry, your answer is wrong. ");
        }
    }
}
