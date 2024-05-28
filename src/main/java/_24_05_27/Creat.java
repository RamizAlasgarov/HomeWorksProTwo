package _24_05_27;

import com.github.javafaker.Faker;

public class Creat {
    public final Faker faker = new Faker();
    public Manager getmanager(){

            return new Manager(faker.name().name(),"top",faker.number().randomDigit(),3);

    }

    public Developer getDeveloper(){
        return new Developer(faker.name().firstName(),"Top12",faker.number().randomDigit(),"Java");
    }
}
