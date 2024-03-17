//Write a Java program that takes two numbers as input and displays the product of two numbers.

package w3resource_java_problems.java_exercises_basic_programs;
import java.util.Scanner;
public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers for getting multiplied...");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num2*num1;
        System.out.println(result);
    }
}
