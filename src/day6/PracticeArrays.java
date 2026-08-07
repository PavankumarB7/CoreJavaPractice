package day6;

public class PracticeArrays {
    public static void main(String[] args) {

        // =====================================================
        // FIND SUM OF ARRAY ELEMENTS
        // =====================================================

        // Input:
        // a = {1,2,3,4,5}

        // Output:
        // sum = 15

        int[] a = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int x : a) {
            sum += x;
        }
        System.out.println(sum);

        System.out.println("---------------");

        // =====================================================
        // COUNT EVEN AND ODD NUMBERS
        // =====================================================

        // Input:
        // b = {1,2,3,4,5,6}

        // Output:
        // Even = 3
        // Odd = 3

        int[] b = { 1, 2, 3, 4, 5, 6 };
        int even = 0;
        int odd = 0;

        for (int x : b) {
            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);

        System.out.println("---------------");

        // =====================================================
        // LINEAR SEARCH - SEARCH AN ELEMENT IN AN ARRAY
        // =====================================================

        int[] arr = { 10, 20, 30, 40, 50 };
        int searchElement = 40;
        boolean status = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                System.out.println("Element Found");
                status = true;
                break;
            }
        }

        if (status == false) {
            System.out.println("Element Not Found");
        }

        System.out.println("---------------");

        // =====================================================
        // COUNT OCCURRENCES OF AN ELEMENT
        // =====================================================

        int[] numbers = { 60, 80, 70, 65, 60, 65, 80, 70, 65, 65 };
        int targetNumber = 65;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            // System.out.println(arr1[i]);
            if (numbers[i] == targetNumber) {
                count++;
            }
        }
        System.out.println(count);

        // =====================================================
        // FIND MISSING NUMBER IN AN ARRAY
        // =====================================================

        // Input:
        // a = {1, 4, 5, 3}

        // Output:
        // Missing Number = 2

        // Assumptions:
        // - Numbers are within a continuous range.
        // - Array does not contain duplicate elements.

        int[] arr1 = { 1, 4, 5, 3 };
        int expectedSum = 0;
        int actualSum = 0;

        for (int i = 0; i < arr1.length; i++) {
            actualSum = actualSum + arr1[i];
        }
        System.out.println("Actual Sum in array: " + actualSum);

        for (int i = 1; i <= 5; i++) {
            expectedSum = expectedSum + i;
        }
        System.out.println("Expected Sum in array: " + expectedSum);

        System.out.println("Missing number from array is: " + (expectedSum - actualSum));

        // =====================================================
        // FIND LARGEST ELEMENT IN AN ARRAY
        // =====================================================

        int[] arr2 = { 40, 80, 20, 100, 60 };
        int largest = arr2[0];

        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] > largest) {
                largest = arr2[i];
            }
        }
        System.out.println(largest);

        // =====================================================
        // FIND SMALLEST ELEMENT IN AN ARRAY
        // =====================================================

        int[] arr3 = { 75, 180, 95, 200, 14 };
        int smallest = arr3[0];

        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] < smallest) {
                smallest = arr3[i];
            }
        }
        System.out.println(smallest);

    }
}
