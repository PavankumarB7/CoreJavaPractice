package OOPS.MethodsConstructors;

public class Greetings {

    // 1) No parameters, no return value

    void m1() {
        System.out.println("Hello there...");
    }

    // 2) No parameters, with return value

    String m2() {
        return ("Hello... how are you??");
    }

    // 3) With parameters, no return value

    void m3(String name) {
        System.out.println("Hello " + name);
    }

    // 4) With parameters, with return value

    String m4(String name) {
        return ("Hello " + name);
    }
}
