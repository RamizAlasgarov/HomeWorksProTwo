package _24_05_26;

import com.github.javafaker.Faker;

public class Demo {
    private final static Faker faker = new Faker();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(createAccount());
        }

//        BankAccount bankAccount1 = new BankAccount(123.3, createUser());
//        BankAccount bankAccount2 = new BankAccount(123.3,createUser());
//        BankAccount bankAccount3 = new BankAccount(123.3, createUser());
//        bankAccount1.deposit(10);
//        System.out.println(bankAccount1.withdraw(4000));
//        bankAccount1.deposit(100);
//        System.out.println(bankAccount1);
//        System.out.println(bankAccount1.withdraw(500));
//        System.out.println(bankAccount2.deposit(-1));
    }

    public static User createUser(){
        return new User(faker.name().name(), faker.name().username(), faker.address().fullAddress());
    }

    public static BankAccount createAccount(){
        return new BankAccount(123.3, createUser());
    }


}
