package day4;

public class PracticeConditionalStatements {
    public static void main(String[] args) {

        // Smallest of Three Numbers

        int a = 15;
        int b = 6;
        int c = 26;

        if (a <= b && a <= c) {
            System.out.println("Smallest number is: " + a);
        } else if (b <= a && b <= c) {
            System.out.println("Smallest number is: " + b);
        } else {
            System.out.println("Smallest number is: " + c);
        }

        // Check Character Case

        char ch = 'A';

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        }

        // Check whether a student passed (marks ≥ 35).

        // int marks = 31;

        // if (marks >= 35) {
        // System.out.println("Passed");
        // } else {
        // System.out.println("failed");
        // }

        // Check Leap Year

        int year = 1995;

        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        // Check Driving License Eligibility

        int age1 = 74;

        if (age1 >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        // Display Grades
        // Display the grade based on the student's marks.

        int marks = 88;

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade: B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade: C");
        } else if (marks >= 35 && marks <= 69) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

        // Electricity Bill Calculator
        // Calculate the total bill based on unit slabs.
        // Slabs: <=100: ₹2 | 101-200: ₹3 | >200: ₹5

        int units = 350;
        int bill;

        if (units <= 100) {
            bill = units * 2;
            System.out.println(bill);
        } else if (units >= 101 && units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);
            System.out.println(bill);
        } else {
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
            System.out.println(bill);
        }

        // BMI Category
        // Display the BMI category based on the given BMI value.
        // Underweight: <18.5 | Normal: 18.5-24.9 | Overweight: 25-29.9 | Obese: >=30

        double BMI = 22.5;

        if (BMI < 18.5) {
            System.out.println("Category: UnderWeight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Category: Normal");
        } else if (BMI >= 25.0 && BMI <= 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        // Simple Calculator (if-else)
        // Perform an arithmetic operation based on the given operator.

        int firstNumber = 20, secondNumber = 5;
        char operator = '^';
        int result;

        if (operator == '*') {
            result = firstNumber * secondNumber;
            System.out.println("Result: " + result);
        } else if (operator == '+') {
            result = firstNumber + secondNumber;
            System.out.println("Result: " + result);
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
        } else if (operator == '%') {
            result = firstNumber % secondNumber;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Operation is invalid...");
        }

        // Login Validation (Nested if)
        // Validate login credentials using username and password.

        String correctUsername = "John";
        String correctPassword = "JohnSnow";

        String enteredUsername = "John";
        String enteredPassword = "JohnEagle";

        if (enteredUsername.equals(correctUsername)) {
            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Wrong Password");
            }
        } else {
            System.out.println("Wrong Username");
        }

        // College Admission (Nested if)
        // Check admission eligibility based on marks and entrance exam score.

        int mark = 65;
        int candidateEntranceScore = 75;

        int minMark = 60;
        int minEntranceScore = 70;

        if (mark >= minMark) {
            if (candidateEntranceScore >= minEntranceScore) {
                System.out.println("Student is admitted");
            } else {
                System.out.println("Student is not admitted");
            }
        } else {
            System.out.println("Student failed");
        }

        // ATM Withdrawal (Nested if)
        // PIN must match and balance must be sufficient.

        int correctPin = 1234;
        int enteredPin = 1234;

        int balance = 10000;
        int withdrawalAmount = 3000;

        if (correctPin == enteredPin) {
            if (balance >= withdrawalAmount) {
                System.out.println("Withdrawal Successful");
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Invalid Pin");
        }

        // Switch case
        // Display day number based on day name

        String dayName = "Monday";

        switch (dayName) {
            case "Monday":
                System.out.println("1");
                break;
            case "Tuesday":
                System.out.println("2");
                break;
            case "Wednesday":
                System.out.println("3");
                break;
            case "Thursday":
                System.out.println("4");
                break;
            case "Friday":
                System.out.println("5");
                break;
            case "Saturday":
                System.out.println("6");
                break;
            case "Sunday":
                System.out.println("7");
                break;
            default:
                System.out.println("Invalid Day Name");
        }

        // Simple Calculator (switch)
        // Perform an arithmetic operation based on the given operator.

        char oper = '@';
        int firstNum = 60, secondNum = 4;
        int res;

        switch (oper) {
            case '+':
                res = firstNum + secondNum;
                System.out.println(res);
                break;
            case '-':
                res = firstNum - secondNum;
                System.out.println(res);
                break;
            case '*':
                res = firstNum * secondNum;
                System.out.println(res);
                break;
            case '/':
                res = firstNum / secondNum;
                System.out.println(res);
                break;
            case '%':
                res = firstNum % secondNum;
                System.out.println(res);
                break;
            default:
                System.out.println("Inavlid Operator");
        }

        // Display Season Based on Month Number

        int monthNumber = 5;
        String season;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                System.out.println(season);
                break;

            case 3:
            case 4:
            case 5:
                season = "Summer";
                System.out.println(season);
                break;

            case 6:
            case 7:
            case 8:
                season = "Monsoon";
                System.out.println(season);
                break;

            case 9:
            case 10:
            case 11:
                season = "Autumn";
                System.out.println(season);
                break;
            default:
                System.out.println("Invalid Month");
        }

    }
}
