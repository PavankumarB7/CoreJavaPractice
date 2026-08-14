package OOPS.ClassObjectMethods;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee(); // object

        emp1.eid = 101;
        emp1.ename = "John";
        emp1.job = "Manager";
        emp1.sal = 50000;
        emp1.display();

        System.out.println("-------------------");

        Employee emp2 = new Employee();

        emp2.eid = 102;
        emp2.ename = "David";
        emp2.job = "Designer";
        emp2.sal = 20000;
        emp2.display();
    }
}
