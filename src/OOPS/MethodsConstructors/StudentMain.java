package OOPS.MethodsConstructors;

public class StudentMain {

    public static void main(String[] args) {

        // Student stu = new Student();

        // Storing data in variables

        // 1) Using the Object reference variables

        // stu.sid = 101;
        // stu.sname = "John";
        // stu.grad = 'A';

        // stu.printStudentData();

        // 2) Using a Method

        // stu.setStudentData(102, "Oliver", 'D');
        // stu.printStudentData();

        // 3) Using a Constructor

        Student stu = new Student(103, "Conner", 'C');
        stu.printStudentData();

    }

}
