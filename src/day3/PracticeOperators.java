package day3;

public class PracticeOperators {
    public static void main(String[] args) {

        // 1. Swapping of two numbers

        // Method 1 - Using a temporary variable
        int a = 100;
        int b = 200;
        int temp;

        temp = a; // temp=100
        a = b; // a=200
        b = temp; // b=100

        System.out.println("a = " + a); // a=200
        System.out.println("b = " + b); // b=100

        // Method 2 - Using addition & subtraction
        int c = 200;
        int d = 400;

        c = c + d; // c = 200+400=600
        d = c - d; // d = 600-400=200
        c = c - d; // c = 600-200=400

        System.out.println("c = " + c); // c=400
        System.out.println("d = " + d); // d=200

        // Method 3 - Using multiplication & division (Limitation: Doesn't work if
        // either a or b is 0.)
        int e = 10;
        int f = 20;

        e = e * f; // e=10*20=200
        f = e / f; // f=200/20=10
        e = e / f; // e=200/10=20

        System.out.println("e = " + e); // e=20
        System.out.println("f = " + f); // f=10

        // 2. Calculate Simple Interest
        int principal = 1000;
        int rate = 8;
        int time = 4;

        int simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest); // 320

        // 3. Calculate BMI
        double weight = 68.75;
        double height = 1.75;

        double bmi = weight / (height * height);
        System.out.println("BMI = " + bmi); // 10.572....

        // 4. Area & Perimeter of Rectangle
        double length = 40.82;
        double width = 22.86;

        double area = length * width;
        System.out.println("Area of Rectangle is " + area); // 933.145....

        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle is " + perimeter); // 127.36

        // 5. Assignment Operators
        // Demonstrate +=, -=, *=, /=, %= in one program.

        int num = 15;

        num += 5; // num = num + 5
        System.out.println("After += : " + num); // 20

        num -= 5; // num = num - 5
        System.out.println("After -= : " + num); // 15

        num *= 5; // num = num * 5
        System.out.println("After *= : " + num); // 75

        num /= 6; // num = num / 6
        System.out.println("After /= : " + num); // 12

        num %= 4; // num = num % 4
        System.out.println("After %= : " + num); // 0

        // 6. Relational Operators
        // Demonstrate >, <, >=, <=, ==, != by comparing two numbers and printing the
        // boolean results.

        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 > num2  : " + (num1 > num2)); // false
        System.out.println("num1 < num2  : " + (num1 < num2)); // true
        System.out.println("num1 >= num2 : " + (num1 >= num2)); // false
        System.out.println("num1 <= num2 : " + (num1 <= num2)); // true
        System.out.println("num1 == num2 : " + (num1 == num2)); // false
        System.out.println("num1 != num2 : " + (num1 != num2)); // true

        // 7. Logical Operators
        // Demonstrate &&, ||, ! using boolean variables

        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("&& : " + (isLoggedIn && isAdmin)); // false
        System.out.println("|| : " + (isLoggedIn || isAdmin)); // true
        System.out.println("!isLoggedIn : " + (!isLoggedIn)); // false
        System.out.println("!isAdmin : " + (!isAdmin)); // true

        // 8. Unary Operators
        // Demonstrate pre/post increment and decrement

        int numb = 10;

        System.out.println("Original value : " + numb); // 10

        System.out.println("Pre Increment (++numb)  : " + (++numb)); // 11
        System.out.println("Post Increment (numb++) : " + (numb++)); // 11

        System.out.println("Value after Post Increment : " + numb); // 12

        System.out.println("Pre Decrement (--numb)  : " + (--numb)); // 11
        System.out.println("Post Decrement (numb--) : " + (numb--)); // 11

        System.out.println("Final value : " + numb); // 10

        // 9. Ternary Operator
        // Largest of Two Numbers

        int numb1 = 60;
        int numb2 = 80;

        int result = (numb1 > numb2) ? numb1 : numb2;
        System.out.println("Largest Number: " + result); // 80

        // 10. Ternary Operator
        // Even or Odd

        int numb3 = 24;

        String res = (numb3 % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is : " + res); // Even

    }
}
