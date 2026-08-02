package day5;

public class BreakContinue {
    public static void main(String[] args) {

        // Break Statement
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("--------------------");

        // Continue Statement
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("------------------------");

        for (int j = 1; j <= 10; j++) {
            if (j == 3 || j == 5 || j == 9) {
                continue;
            }
            System.out.println(j);
        }

    }
}
