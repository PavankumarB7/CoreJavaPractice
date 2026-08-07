package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {

        // =====================================================
        // READING INPUT FROM THE CONSOLE
        // =====================================================

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Given number is: " + number);

        System.out.println("Enter decimal number");
        double decimalNumber = sc.nextDouble();
        System.out.println("Given value is: " + decimalNumber);

        System.out.println("Enter your city");
        String city = sc.next();
        System.out.println("Your city is: " + city);

        // =====================================================
        // READING MULTIPLE INPUTS FROM THE CONSOLE
        // =====================================================

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Addition of 2 numbers: " + (num1 + num2));

        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("your name is :" + name);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("your age is :" + age);

        System.out.println("Enter unknown value");
        Object value = sc.next();
        System.out.println(value);

        // =====================================================
        // READING ARRAY ELEMENTS FROM THE CONSOLE
        // =====================================================

        int[] data = new int[5];

        for (int i = 0; i < data.length; i++) {
            System.out.println("Enter a value for the position " + i + ":");
            data[i] = sc.nextInt();
        }

        System.out.println("printing array elements....");

        System.out.println(Arrays.toString(data));

        sc.close();

    }
}
