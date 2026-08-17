package OOPS.ThisStaticKeywords;

public class StaticKeyword {

    static int a = 10; // static variables
    int b = 20;

    static void m1() { // static method
        System.out.println("this is m1 static method...");
    }

    void m2() { // non-static method
        System.out.println("this is m2 non-static method....");
    }

    void m() { // non-static method
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String[] args) {

        // 1) Static methods can access static stuff directly (without creating object)

        // System.out.println(a);
        // m1();

        // System.out.println(b); // cannot access, b is non-static
        // m2(); // cannot access, m2() is non-static

        // 2) Static methods can access non-static stuff thorugh object

        // StaticKeyword sk = new StaticKeyword();
        // System.out.println(sk.b);
        // sk.m2();

        // 3) Non-static methods can access everything directly

        StaticKeyword sk = new StaticKeyword();
        sk.m();

    }

}
