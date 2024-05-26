package _24_05_26;

import com.github.javafaker.Faker;

public class Demo {
    private final static Faker faker = new Faker();
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(faker.name().name(),200.24);
        BankAccount bankAccount2 = new BankAccount(faker.name().name(),500.25);
        bankAccount1.deposit(100);
        System.out.println(bankAccount1);
//        System.out.println(bankAccount1.withdraw(500));
        System.out.println(bankAccount2.deposit(-1));
    }
}
