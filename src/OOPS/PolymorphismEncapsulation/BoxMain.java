package OOPS.PolymorphismEncapsulation;

public class BoxMain {

    public static void main(String[] args) {

        // Box b = new Box(); // 1
        // Box b = new Box(10.5, 15.5, 0.5); // 2
        Box b = new Box(25.8); // 3

        System.out.println(b.volume());
    }

}
