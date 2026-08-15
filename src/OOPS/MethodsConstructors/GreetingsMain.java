package OOPS.MethodsConstructors;

public class GreetingsMain {

    public static void main(String[] args) {

        Greetings gr = new Greetings();

        gr.m1(); // 1

        String s = gr.m2(); // 2
        System.out.println(s);

        gr.m3("Winchester");

        String s1 = gr.m4("David");
        System.out.println(s1);

    }

}
