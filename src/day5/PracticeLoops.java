package day5;

public class PracticeLoops {
   public static void main(String[] args) {

      // ====================
      // Reverse Number
      // ====================

      // Input : 1234
      // Output : 4321

      int num = 1234;
      int reverseNum = 0;

      while (num > 0) {
         int lastDigit = num % 10;
         System.out.println("Extracted last digit: " + lastDigit);

         reverseNum = reverseNum * 10 + lastDigit;
         System.out.println("Reverse Number: " + reverseNum);

         num /= 10;
         System.out.println("Remaining Number: " + num);
         System.out.println("--------------------");
      }
      System.out.println(reverseNum);

      // ====================
      // Palindrome Number
      // ====================

      // Input : 121
      // Output : Palindrome Number

      int number = 121;
      int originalNumber = number;
      int reverseNumber = 0;

      while (number > 0) {
         int lastDigit = number % 10;
         reverseNumber = reverseNumber * 10 + lastDigit;
         number /= 10;
      }

      if (originalNumber == reverseNumber) {
         System.out.println("Palindrome number");
      } else {
         System.out.println("Not a palindrome number");
      }

      // ====================
      // Count Number of Digits
      // ====================

      // Input : 423424
      // Output : 6

      int numb = 4234;
      int count = 0;

      while (numb > 0) {
         numb /= 10;
         count++;
      }
      System.out.println(count);

      // ====================
      // Count Even and Odd Digits
      // ====================

      // Input : 23456
      // Output : Even = 3, Odd = 2

      int input = 23456;
      int evenCount = 0;
      int oddCount = 0;

      while (input > 0) {
         int lastDigit = input % 10;

         if (lastDigit % 2 == 0) {
            evenCount++;
         } else {
            oddCount++;
         }
         input /= 10;
      }

      System.out.println("Even Count: " + evenCount);
      System.out.println("Odd Count: " + oddCount);

      // ====================
      // Sum of Digits
      // ====================

      // Input : 1234
      // Output : 10

      int digits = 1234;
      int sum = 0;

      while (digits > 0) {
         int lastDigit = digits % 10;
         sum += lastDigit;
         digits /= 10;
      }

      System.out.println(sum);

      // ====================
      // Find Largest Digit
      // ====================

      // Input : 58372
      // Output : 8

      int inp = 58372;
      int largestDigit = 0;

      while (inp > 0) {
         int lastDigit = inp % 10;

         if (lastDigit > largestDigit) {
            largestDigit = lastDigit;
         }

         inp /= 10;
      }
      System.out.println(largestDigit);

      // ====================
      // Find Smallest Digit
      // ====================

      // Input : 58372
      // Output : 2

      int numberr = 58372;
      int smallestDigit = 9;

      while (numberr > 0) {
         int lastDigit = numberr % 10;

         if (lastDigit < smallestDigit) {
            smallestDigit = lastDigit;
         }
         numberr /= 10;
      }
      System.out.println(smallestDigit);

   }

}
