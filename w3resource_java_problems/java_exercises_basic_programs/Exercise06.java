//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
package w3resource_java_problems.java_exercises_basic_programs;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.println("the additon of numbers is :"+(num1+num2));
        System.out.println("the subtraction of numbers is :"+(num1-num2));
        System.out.println("the multiplication of numbers is :"+(num1*num2));
        System.out.println("the division of numbers is :"+(num1/num2));
        System.out.println("the remainder of numbers is :"+(num1%num2));








    }
}
