package day4;

public class ConditionalStatements {
    public static void main(String[] args) {

        // ====================
        // If Else
        // ====================

        // Ex 1 - Check person is eligible to vote

        int person_age = 15;

        if (person_age >= 18) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not eligible for vote");
        }

        // Ex 2 - Check number is even or odd

        int num = 10;

        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        // ====================
        // Else If Ladder
        // ====================

        // Ex 3 - Check number is positive, negative or zero

        int num1 = 0;

        if (num1 > 0) {
            System.out.println("Positive Number");
        } else if (num1 < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }

        // Ex 4 - Find largest of three numbers

        int a = 100, b = 200, c = 30;

        if (a > b && a > c) {
            System.out.println("a is largest number: " + a);
        } else if (b > a && b > c) {
            System.out.println("b is largest number: " + b);
        } else {
            System.out.println("c is largest number: " + c);
        }

        // Ex 5 - Display day name based on day number using if-else

        int dayNumber = 7;

        if (dayNumber == 1) {
            System.out.println("Sunday");
        } else if (dayNumber == 2) {
            System.out.println("Monday");
        } else if (dayNumber == 3) {
            System.out.println("Tuesday");
        } else if (dayNumber == 4) {
            System.out.println("Wednesday");
        } else if (dayNumber == 5) {
            System.out.println("Thursday");
        } else if (dayNumber == 6) {
            System.out.println("Friday");
        } else if (dayNumber == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Day Number");
        }

        // ====================
        // Switch
        // ====================

        // Ex 5 - Display day name based on day number using switch

        dayNumber = 3;

        switch (dayNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day Number");
        }

    }
}
