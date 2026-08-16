package OOPS.PolymorphismEncapsulation;

public class AdderMain {

    public static void main(String[] args) {

        Adder addobj = new Adder();

        addobj.sum(); // 1

        addobj.sum(15, 30); // 2

        addobj.sum(25.5, 40); // 4

        addobj.sum(60, 80.5); // 3

        addobj.sum(40, 60, 80); // 5

        // addobj.sum(50.7,90.3,180.5) // invalid

    }
}
