package day3;

public class Operators {
    public static void main(String[] args) {

        // ====================
        // Arithmetic Operators
        // ====================

        int a = 20, b = 10;

        int result = a + b;
        System.out.println("Sum of a and b is: " + result);
        System.out.println("Difference of a and b is: " + (a - b));
        System.out.println("Multiplication of a and b is: " + (a * b));
        System.out.println("Division of a and b is: " + (a / b));
        System.out.println("Modulo division of a and b is: " + (a % b));

        System.out.println("------------------------");

        // ====================
        // Relational Operators
        // ====================

        System.out.println(a > b); // true
        System.out.println(a < b); // false
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false

        System.out.println("------------------------");
        b = 20;
        System.out.println(a != b); // false
        System.out.println(a == b); // true

        boolean res = a > b;
        System.out.println(res); // false

        System.out.println("---------------------");

        // ====================
        // Logical Operators
        // ====================

        boolean x = true;
        boolean y = false;

        System.out.println(x && y); // false
        System.out.println(x || y); // true
        System.out.println(!x); // false
        System.out.println(!y); // true

        boolean b1 = 10 > 20;
        System.out.println(b1); // false

        boolean b2 = 20 > 10;
        System.out.println(b2); // true

        System.out.println(b1 && b2); // false
        System.out.println(b1 || b2); // true

        System.out.println((10 < 20) && (20 > 10)); // true

        // ====================
        // Increment / Decrement
        // ====================

        System.out.println("-------------------");

        // case 1
        int c = 10;
        System.out.println(c); // 10

        c++; // c=c+1;
        System.out.println(c);// 11

        // case 2 - post increment
        System.out.println("---------------------");
        int d = 10;
        int res1 = d++;
        System.out.println(res1); // 10
        System.out.println(d); // 11

        // case 3 - pre increment
        int e = 10;
        int res2 = ++e;
        System.out.println(res2); // 11
        System.out.println(e); // 11

        // post dec
        int f = 100;

        int res3 = f--;
        System.out.println(res3); // 100
        System.out.println(f); // 99

        // pre dec
        int g = 100;

        int res4 = --g;
        System.out.println(res4); // 99
        System.out.println(g); // 99

        // ====================
        // Assignment Operators
        // ====================

        // Ex 1
        int h = 10;
        h += 5;
        System.out.println(h); // 15

        int i = 15;
        i -= 5;
        System.out.println(i); // 10

        // Ex 2
        int j = 20;
        j *= 8;
        System.out.println(j); // 160

        // Ex 3
        int k = 40;
        k /= 2;
        System.out.println(k); // 20

        // ====================
        // Ternary Operator
        // ====================

        // Ex 1
        int l = 200, m = 100;

        int o = (l > m) ? l : m;
        System.out.println(o);

        // Ex 2
        int p = 1, q = 2;
        int n = (p == q) ? 200 : 300;
        System.out.println(n); // 300

        // Ex 3
        int person_age = 22;

        String vote = (person_age >= 18) ? "Eligible" : "Not eligible";
        System.out.println(vote);

    }
}
