//Write a Java program to print the area and perimeter of a circle.
package w3resource_java_problems.java_exercises_basic_programs;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float radius = sc.nextFloat();
        
        float area = (float) (Math.PI * radius * radius);
        System.out.println("The area of the circle is: " + area);
        
        float perimeter = (float) (2 * Math.PI * radius);
        System.out.println("The perimeter of the circle is: " + perimeter);
    }
}

