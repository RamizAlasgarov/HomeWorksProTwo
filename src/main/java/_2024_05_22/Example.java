package _2024_05_22;

public class Example {
    public static void main(String[] args) {
        Repository repo = new Repository();
        repo.createPerson("ima", 22);
        repo.createPerson("ima1", 23);
        repo.printPersonById(0);
        repo.printPersonById(2);
        System.out.println();

//        String[] person = repo.getPersonById(1);
//        repo.printPerson(person);
    }
}
