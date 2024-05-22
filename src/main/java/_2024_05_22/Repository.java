package _2024_05_22;

/**
 * Создать метод printPersonById, который принимает int id и выводит в консоль имя и возраст человека с данным ID.
 * Если ID не существует, метод ничего не выводит.
 */
public class Repository {
    String[] names = new String[10];
    int[] ages = new int[10];
    int currentIndex = 0;

    public void createPerson(String personName, int personAge) {
        if (currentIndex < 10) {
            names[currentIndex] = personName;
            ages[currentIndex] = personAge;
            currentIndex++;
        }
    }

    public String[] getPersonById(int id) {

        if (id < 0 || id >= 10) {
            return new String[]{"empty", "-1"};

        }
        return new String[]{names[id], String.valueOf(ages[id])};
    }

    public void printPersonById(int id) {
        if (id < 0 || id >= 10) {
            return;
        }
        System.out.printf("imya: %s, vozrast: %d .", names[id], ages[id]);
    }
    public void printPerson(String[] person) {
        System.out.printf("imya: %s, vozrast: %d ", person[0], person[1]);
    }



}
