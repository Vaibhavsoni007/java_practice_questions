//Write a Java program to divide two numbers and print them on the screen.
package w3resource_java_problems.java_exercises_basic_programs;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt the user to input the first number
        System.out.print("Input the first number: ");

        // Read and store the first number

        int a = sc.nextInt();

        // Prompt the user to input the second number
        System.out.print("Input the second number: ");

        // Read and store the second number
        int b = sc.nextInt();

        // Calculate the division of a and b
        int d = (a / b);

        // Display a blank line for separation
        System.out.println();

        // Display the result of the division
        System.out.println("The division of a and b is: " + d);

    }
}
