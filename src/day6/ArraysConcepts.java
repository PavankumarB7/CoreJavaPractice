package day6;

import java.util.Arrays;

public class ArraysConcepts {

    public static void main(String[] args) {

        // =====================================================
        // SINGLE DIMENSIONAL ARRAY
        // =====================================================

        // Approach 1: Declare array and assign values individually
        int[] numbers1 = new int[5];

        numbers1[0] = 100;
        numbers1[1] = 200;
        numbers1[2] = 300;
        numbers1[3] = 400;
        numbers1[4] = 500;

        // Approach 2: Declare and initialize array together
        int[] numbers2 = { 100, 200, 300, 400, 500 };

        // Find array length
        System.out.println("Array Length: " + numbers2.length);

        System.out.println("--------------------------------");

        // Read a single value
        System.out.println("Element at index 4: " + numbers2[4]);

        System.out.println("--------------------------------");

        // Read multiple values using normal for loop
        System.out.println("Using Normal For Loop:");

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        System.out.println("--------------------------------");

        // Read multiple values using enhanced for loop
        System.out.println("Using Enhanced For Loop:");

        for (int number : numbers2) {
            System.out.println(number);
        }

        // =====================================================
        // TWO DIMENSIONAL ARRAY
        // =====================================================

        // Approach 1: Declare array and assign values individually
        int[][] matrix1 = new int[3][2];

        matrix1[0][0] = 100;
        matrix1[0][1] = 200;

        matrix1[1][0] = 300;
        matrix1[1][1] = 400;

        matrix1[2][0] = 500;
        matrix1[2][1] = 600;

        // Approach 2: Declare and initialize array together
        int[][] matrix2 = {
                { 100, 200 },
                { 300, 400 },
                { 500, 600 }
        };

        // Find number of rows and columns
        System.out.println("\nRows: " + matrix2.length);
        System.out.println("Columns: " + matrix2[0].length);

        // Read a single value
        System.out.println("Element at [2][1]: " + matrix2[2][1]);

        System.out.println("--------------------------------");

        // Read multiple values using normal for loop
        System.out.println("Using Normal For Loop:");

        for (int row = 0; row < matrix2.length; row++) {
            for (int column = 0; column < matrix2[row].length; column++) {
                System.out.print(matrix2[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        // Read multiple values using enhanced for loop
        System.out.println("Using Enhanced For Loop:");

        for (int[] row : matrix2) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        // =====================================================
        // OBJECT ARRAY (HETEROGENEOUS DATA)
        // =====================================================

        Object[] data = { 100, 10.5, "WELCOME", true };

        System.out.println("Object Array:");

        for (Object value : data) {
            System.out.println(value);
        }

        // =====================================================
        // SORTING ARRAYS USING ARRAYS.SORT()
        // =====================================================

        int[] num = { 100, 600, 400, 200, 300, 500 };

        System.out.println("Before Sorting...........");
        System.out.println(Arrays.toString(num));

        Arrays.sort(num);

        System.out.println("After Sorting.........");
        System.out.println(Arrays.toString(num));

        // =====================================================
        // SORTING STRING ARRAYS
        // =====================================================

        String[] s = { "scott", "mary", "john", "david" };

        System.out.println("Before Sorting ..... " + Arrays.toString(s));

        Arrays.sort(s);

        System.out.println("After Sorting ..... " + Arrays.toString(s));

        // =====================================================
        // TRAVERSE ARRAY IN REVERSE ORDER
        // =====================================================

        int[] arr2 = { 100, 500, 400, 600, 200 };

        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.println(arr2[i]);
        }
    }
}