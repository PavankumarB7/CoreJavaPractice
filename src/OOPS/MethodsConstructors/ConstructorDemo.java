package OOPS.MethodsConstructors;

public class ConstructorDemo {

    int x, y;

    ConstructorDemo() { // default constructor
        x = 100;
        y = 200;
    }

    ConstructorDemo(int a, int b) { // parameterized constructor
        x = a;
        y = b;
    }

    void sum() {
        System.out.println(x + y);
    }

    public static void main(String[] args) {

        ConstructorDemo cd1 = new ConstructorDemo(); // invoke default constructor
        cd1.sum();

        ConstructorDemo cd2 = new ConstructorDemo(10, 20); // parameterized constructor
        cd2.sum();

    }
}
