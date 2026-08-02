package day5;

public class ForLoop {
    public static void main(String[] args) {

        // ====================
        // For Loop
        // ====================

        // Ex 1 - Print 1 to 10 numbers

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Ex 2 - Print even numbers from 1 to 10

        for (int j = 2; j <= 10; j += 2) {
            System.out.println(j);
        }

        // Ex 3 - Display whether each number from 1 to 10 is odd or even

        for (int k = 1; k <= 10; k++) {
            if (k % 2 == 0) {
                System.out.println(k + " Even");
            } else {
                System.out.println(k + " Odd");
            }
        }

        // Ex 4 - Print numbers from 10 to 1

        for (int l = 10; l >= 1; l--) {
            System.out.println(l);
        }

    }
}
