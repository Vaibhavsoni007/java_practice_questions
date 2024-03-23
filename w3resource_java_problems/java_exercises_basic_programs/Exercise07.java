//Write a Java program that takes a number as input and prints its multiplication table up to 10.
package w3resource_java_problems.java_exercises_basic_programs;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        int table = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int num1 = sc.nextInt();
        for(int i=1;i<=10;i++){
            table = i*num1;
            System.out.println(table);
        }
    }
}
