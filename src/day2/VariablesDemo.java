package day2;

public class VariablesDemo {
    public static void main(String[] args) {
        /*
         * int a; // declaration
         * a=100; // assignment
         * 
         * int a=100; // declaration+assignment
         * System.out.println(a);
         * 
         * a=200;
         * System.out.println(a);
         */

        // Different approaches or methods to create variables

        // Approach 1 - Declare and initialize each variable separately
        /*
         * int a=100;
         * int b=200;
         * int c=300;
         */

        // Approach 2 - Declare multiple variables first, then initialize them
        // separately
        /*
         * int a,b,c;
         * a=100;
         * b=200;
         * c=300;
         */

        // Approach 3 - Declare and initialize multiple variables in a single statement
        int a = 100, b = 200, c = 300;

        System.out.println("the value of a is: " + a);
        System.out.println("the value of b is: " + b);
        System.out.println("the value of c is: " + c);

        System.out.println(a + b + c); // 600
        System.out.println(a + " " + b + " " + c); // 100 200 300
    }
}
