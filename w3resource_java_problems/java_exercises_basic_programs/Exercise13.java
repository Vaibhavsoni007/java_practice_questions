//Write a Java program to print the area and perimeter of a rectangle.
package w3resource_java_problems.java_exercises_basic_programs;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        System.out.println("enter the length and weidth of rectange:");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int wei = sc.nextInt();
        int area = len*wei;
        int perimeter = len+wei;
        System.out.println(area);
        System.out.println(perimeter);


    }
}
