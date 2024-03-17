//Write a Java program to print the sum of two numbers.
//Test Data:
package w3resource_java_problems.java_exercises_basic_programs;
import java.util.*;
public class Exercise02 {
    public static void main(String[] args) {
        //int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers for addition");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num2+num1;
        System.out.println("the addition of these numbers is :"+result);



    }
}
