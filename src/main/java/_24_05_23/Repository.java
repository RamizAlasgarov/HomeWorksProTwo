package _24_05_23;

import java.util.Arrays;

public class Repository {
    private int index;
    private Person[] storage;
    private int count;

    public Repository(int count) {
        this.count = count;
        this.storage = new Person[this.count+1];
        this.index = 0;
    }

    public void append(String personName, int personAge) {
        storage[index] = new Person(personName, personAge);
        index += 1;
    }

    public void append(Person person) {
        storage[index] = person;
        index += 1;
    }

    /**
     * Получение Person по указанному id
     * @param id - идентификатор пользователя
     * @return Person
     */
    public Person getPersonById(int id) {
        if (id < 0 || id >= index) {
            return null;
        }
        return storage[id];
    }
//    public Person[] removeFromId(int id){
//        if(id < 0 || id > index){
//            return null;
//        }
//        return storage
//    }

    public int size(){
        return index;
    }


}
