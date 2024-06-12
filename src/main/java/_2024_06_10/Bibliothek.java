package _2024_06_10;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@AllArgsConstructor
public class Bibliothek {
    List<Books> bookList;

    public static Optional<String> getBookByName(List<Books> bookList, String nameOfBook) {
        for (Books book : bookList) {
            if (Objects.equals(book.getName(), nameOfBook)) {
                return Optional.of(book.getName());
            }
        }
        return Optional.of("Empty");
    }

}

class Main {
    public static void main(String[] args) {
        Books book1 = new Books("abc", "def");
        Books book2 = new Books("adfbc", "sdff");
        Books book3 = new Books("absdfc", "xsfsf");
        List<Books> bookList = List.of(book1, book2, book3);
        System.out.println(Bibliothek.getBookByName(bookList, "abc"));
    }
}