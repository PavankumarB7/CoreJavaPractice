package day5;

public class WhileAndDoWhile {
    public static void main(String[] args) {

        // ====================
        // While Loop
        // ====================

        // Ex 1 - Print numbers from 1 to 10

        int a = 1;

        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        System.out.println("-----------------------");

        // Ex 2 - Print "Hello" 10 times

        int b = 1;

        while (b <= 10) {
            System.out.println("Hello");
            b++;
        }
        System.out.println("-----------------------");

        // Ex 3 - print even numbers between 1 & 10

        // Approach 1
        int c = 2;

        while (c <= 10) {
            System.out.println(c);
            c += 2;
        }
        System.out.println("-----------------------");

        // Approach 2
        int d = 1;

        while (d <= 10) {
            if (d % 2 == 0) {
                System.out.println(d);
            }
            d++;
        }
        System.out.println("-----------------------");

        // Ex 4 - Display whether each number from 1 to 10 is odd or even

        int e = 1;

        while (e <= 10) {
            if (e % 2 == 0) {
                System.out.println(e + " Even");
            } else {
                System.out.println(e + " Odd");
            }
            e++;
        }
        System.out.println("-----------------------");

        // Ex 5 - Print numbers from 10 to 1

        int f = 10;

        while (f > 0) {
            System.out.println(f);
            f--;
        }

        System.out.println("-----------------------");

        // ====================
        // Do-While Loop
        // ====================

        // Ex 1 - Print numbers from 1 to 10

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        System.out.println("----------------");

        // Ex 2 - Print numbers from 10 to 1

        int j = 10;

        do {
            System.out.println(j);
            j--;
        } while (j >= 1);

        System.out.println("----------------");

        // ====================
        // While vs Do-While
        // ====================

        // Demonstrate the difference between while and do-while
        // when the loop condition is initially false.

        int x = 10;

        while (x <= 5) {
            System.out.println(x);
            x++;
        }

        System.out.println("----------------");

        int y = 10;

        do {
            System.out.println(y);
            y++;
        } while (y <= 5);

        System.out.println("----------------");

        // ====================
        // Infinite While Loop
        // ====================

        // Demonstrate an infinite while loop that terminates using break.

        int count = 1;

        while (true) {
            System.out.println("Hello");
            count++;

            if (count == 10) {
                break;
            }
        }

    }
}
