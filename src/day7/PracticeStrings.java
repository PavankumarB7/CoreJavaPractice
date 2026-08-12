package day7;

import java.util.Arrays;

public class PracticeStrings {
    public static void main(String[] args) {

        // =====================================================
        // REVERSE A STRING
        // =====================================================

        // Approach 1 - By using length() & charAt()

        String s = "welcome";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println("Reverse string is: " + rev);

        // Approach 2 - By converting string to char array type

        String S = "Selenium";
        String reverse = "";

        char[] a = S.toCharArray();

        for (int i = a.length - 1; i >= 0; i--) {
            reverse = reverse + a[i];
        }
        System.out.println("Reverse string is: " + reverse);

        // Approach 3 - Using StringBuffer Class

        StringBuffer b = new StringBuffer("Playwright");
        System.out.println("Reverse String is: " + b.reverse());

        // Approach 4 - Using StringBuilder Class

        StringBuilder c = new StringBuilder("Cypress");
        System.out.println("Reverse String is: " + c.reverse());

        // Mutable vs Immutable

        // Mutable - we can change
        int[] d = { 20, 10, 40, 50, 30 };

        System.out.println(Arrays.toString(d));
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));

        // Immutable - we cannot change
        String e = new String("welcome");

        System.out.println(e); // welcome
        e.concat("to java");
        System.out.println(e); // welcome

        // String vs StringBuffer vs StringBuilder

        // String
        String f = "Hong Kong";
        f.concat("to bangkok");
        System.out.println(f); // Hong Kong // immutable, cannot change original value of f

        // StringBuffer
        // StringBuffer g = new StringBuffer("Welcome");
        // g.append(" to America");
        // System.out.println(g); // Welcome to America // mutable, we can change
        // original value of g

        // StringBuilder
        StringBuilder g = new StringBuilder("Welcome");
        g.append(" to America");
        System.out.println(g); // Welcome to America // mutable, we can change original value of g

        // String Comparison

        // Case 1
        // String s1 = "welcome";
        // String s2 = "welcome";

        // System.out.println(s1 == s2); // true
        // System.out.println(s1.equals(s2)); // true

        // Case 2
        // String s1 = new String("welcome");
        // String s2 = new String("welcome");
        // System.out.println(s1);
        // System.out.println(s2);

        // System.out.println(s1 == s2); // false // to compare the objects
        // System.out.println(s1.equals(s2)); // true // to compare values of objects

        // Case 3
        // String s1 = "abc";
        // String s2 = new String("abc");

        // System.out.println(s1 == s2); // false
        // System.out.println(s1.equals(s2)); // true

        // Case 4
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = s2;

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        System.out.println(s2 == s3); // true // both references point to the same object
        System.out.println(s2.equals(s3)); // true

        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true

        // =====================================================
        // Check string is palindrome or not
        // =====================================================

        // Input: "MADAM"
        // Output: Palindrome

        String palindrome = "MADAM";
        String revString = "";

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            revString += palindrome.charAt(i);
        }
        System.out.println("Reverse string is: " + revString);

        if (revString.equals(palindrome)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        // =====================================================
        // Remove junk or special characters in a string
        // =====================================================

        String input = "Ja@va#123$";
        String result = "";

        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z' || arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= '0' && arr[i] <= '9') {
                result = result + arr[i];
            }
        }

        System.out.println(result);

        // =====================================================
        // How to remove white spaces in a string
        // =====================================================

        String whiteString = "C l ou  d";
        String res = "";

        for (int i = 0; i < whiteString.length(); i++) {
            if (whiteString.charAt(i) != ' ') {
                res += whiteString.charAt(i);
            }
        }
        System.out.println(res);

        // =====================================================
        // Count occurences of a character in a string
        // =====================================================

        String inputChar = "Selenium";
        char targetElement = 'e';
        int count = 0;

        for (int i = 0; i < inputChar.length(); i++) {
            if (inputChar.charAt(i) == targetElement) {
                count++;
            }
        }
        System.out.println(count);

    }
}
