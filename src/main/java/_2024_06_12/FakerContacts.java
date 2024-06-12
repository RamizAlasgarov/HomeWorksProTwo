package _2024_06_12;

import com.github.javafaker.Faker;

import java.util.List;
import java.util.Random;

public class FakerContacts {
    Faker faker = new Faker();
    Random random = new Random();

    public void createTenContact(List<Contact> contactList) {
        for (int i = 0; i < 10; i++) {
            contactList.add(new Contact(random.nextInt(),
                    faker.name().firstName(),
                    faker.number().randomNumber(),
                    faker.name().username()));
        }
    }
}
