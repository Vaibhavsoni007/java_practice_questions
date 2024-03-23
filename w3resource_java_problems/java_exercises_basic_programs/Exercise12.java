// Write a Java program that takes three numbers as input to calculate and print the average of the numbers
package w3resource_java_problems.java_exercises_basic_programs;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float y = 0;
        float  total = 0;
        System.out.println("enter");
        for(int i=1;i<=3;i++)
        {
            System.out.println("enter the value of number :"+i);
            y = sc.nextFloat();
            total += y;
        }
        float average = total/3;
        System.out.println("average is :"+average);
    }
}
