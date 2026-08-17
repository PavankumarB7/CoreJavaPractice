package OOPS.ThisStaticKeywords;

public class StaticMain {

    public static void main(String[] args) {

        // 1) Static methods can access static stuff directly (without creating object)

        System.out.println(StaticKeyword.a);
        StaticKeyword.m1();

        // System.out.println(b); // cannot access, b is non-static
        // m2(); // cannot access, m2() is non-static

        // 2) Static methods can access non-static stuff thorugh object

        StaticKeyword sk = new StaticKeyword();
        System.out.println(sk.b);
        sk.m2();

        // 3) Non-static methods can access everything directly

        sk.m();

    }
}
