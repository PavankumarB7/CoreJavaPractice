package day7;

import java.util.Arrays;

public class StringsConcepts {
    public static void main(String[] args) {

        // String s="welcome";
        // String s=new String("welcome");

        // String built in methods

        // length() - returns length of a string(number of characters)
        String s = "welcome";
        int l = s.length();
        System.out.println(l);
        System.out.println("welcome".length());

        // concat() - joins two or more string
        String s1 = "welcome ";
        String s2 = "to java ";
        String s3 = "automation";

        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));

        System.out.println(s1 + s2 + s3);
        System.out.println(s1.concat(s2).concat(s3));

        System.out.println(s1.concat(s2 + s3));

        System.out.println("welcome to java");
        System.out.println("welcome ".concat("to java"));

        // trim() - removes leading and trailing spaces

        s = "   welcome   ";

        System.out.println(s);
        System.out.println("Before trimming: " + s.length());

        System.out.println(s.trim());
        System.out.println("After trimmed: " + s.trim().length());

        // charAt() - returns a character from a string based on index

        s = "welcome";
        System.out.println(s.charAt(4));
        System.out.println(s.charAt(0));

        // contains() - returns true/false
        // checks whether a sequence of characters is present in the string

        System.out.println(s.contains("wel"));
        System.out.println(s.contains("come"));
        System.out.println(s.contains("Wel"));
        System.out.println(s.contains("COME"));
        System.out.println(s.contains("welme"));

        // equals(), equalsIgnoreCase() - compare strings
        // equals() is case-sensitive; equalsIgnoreCase() ignores case

        s1 = "welcome";
        s2 = "welcome";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Welcome"));
        System.out.println(s1.equalsIgnoreCase("Welcome"));

        // replace() - replace single/multiple(sequence) of characters in a string

        s = "welcome to selenium java selenium python selenium c#";
        System.out.println(s.replace('e', 'U'));

        System.out.println(s.replace("selenium", "playwright"));

        // substring() - extract substring from the main string

        s = "selenium";
        System.out.println(s.substring(1, 5));
        System.out.println(s.substring(0, 3));

        // toUpperCase() toLowerCase()

        s = "Welcome";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // split() - splits the string into multiple parts based on delimiter

        s = "abc@gmail.com";

        String[] a = s.split("@");
        System.out.println(Arrays.toString(a));

        System.out.println(a[0]);
        System.out.println(a[1]);

        // Ex 1
        String amount = "$15,20,55";

        System.out.println(amount.replace("$", ""));

        System.out.println(amount.replace("$", "").replace(",", ""));

        // Ex 2
        s = "abc,123@xyz";

        String[] arr1 = s.split(",");
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = arr1[1].split("@");
        System.out.println(Arrays.toString(arr2));

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        // Ex 3
        s = "abc 123 xyz";

        String[] ar = s.split(" ");
        System.out.println(Arrays.toString(ar));

        // Ex 4
        String name = "John Kennedy";

        System.out.println(name.contains("john"));

        System.out.println(name.replace('J', 'j').contains("john"));
        System.out.println(name.toLowerCase().contains("john"));

    }
}
