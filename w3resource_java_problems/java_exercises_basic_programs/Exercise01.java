//Write a Java program to print 'Hello' on screen and your name on a separate line.
package w3resource_java_problems.java_exercises_basic_programs;
import java.util.*;
public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("hello");
        System.out.println(name);
    }
}
