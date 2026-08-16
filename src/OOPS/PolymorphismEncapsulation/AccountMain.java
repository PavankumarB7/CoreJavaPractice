package OOPS.PolymorphismEncapsulation;

public class AccountMain {

    public static void main(String[] args) {

        Account acc = new Account();

        acc.setAccno(101);
        acc.setName("John");
        acc.setAmount(55445.325);

        System.out.println(acc.getAccno());
        System.out.println(acc.getName());
        System.out.println(acc.getAmount());
    }
}
