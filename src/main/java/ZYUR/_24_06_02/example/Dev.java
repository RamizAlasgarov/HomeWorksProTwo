package ZYUR._24_06_02.example;

import ZYUR._24_06_02.example.book.Book;
import com.github.javafaker.Faker;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Создайте класс книга с полями Название, Автор, ISBN.
 * На полке стоят книги в алфавитном порядке по автору,
 * затем по названию, затем по ISBN.
 * Напишите два метода поиска книг на полке – линейный и бинарный.
 * Создайте метод, который замерит время выполнения обоих методов поиска
 */
public class Dev {
    public static Faker faker = new Faker();

    public static void main(String[] args) {
        List<Book> books = getBooks();
        Collections.sort(books);
        String author = books.get(ThreadLocalRandom.current().nextInt(books.size())).getAuthor();
        System.out.println(author);
        System.out.println(binarySearch(books, author));
        System.out.println(searchLiner(books, author));
//        getTime("linear",() -> searchLiner(books,author));
//
//        getTime("binary",() -> binarySearch(books,author));



    }

    public static List<Book> getBooks() {
        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            bookList.add(new Book(faker.book().title(), faker.book().author(), UUID.randomUUID().toString()));
        }
        return bookList;
    }

    public static int searchLiner(List<Book> bookList, String author) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().equals(author)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(List<Book> bookList,String author){
        int last = bookList.size()-1;
        int first = 0;

        while (first <= last){
            int middle = (last-first)/2;
            Book book = bookList.get(middle);
            if(book.getAuthor().equals(author)){
                return middle;
            }
            if(book.getAuthor().compareTo(author) > 0){
                last = middle-1;
            }
            else {
                first = middle+1;
            }
        }
        return -1;
    }

    public static void getTime(String name,Runnable runnable){
        LocalTime start = LocalTime.now();
        runnable.run();
        LocalTime end = LocalTime.now();
        System.out.println(name + " " + Duration.between(start,end));
    }
}
