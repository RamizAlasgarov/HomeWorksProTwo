package _24_05_29.cinema.users;

import _24_05_29.cinema.Sessions;
import _24_05_29.cinema.janr.Movie;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Демонстрировать полиморфное поведение при работе с коллекциями фильмов и пользователей.
 */
public class Demo {
    public static void main(String[] args) {
        Movie movie1 = new Movie("janna dark","boyevik");
        Movie movie2 = new Movie("gerakl","fantasy");
        User user1 = new AdminUser("Ilya","headAdmin");
        User user2 = new VieweUser("Petr","watcher");
        Sessions sessions = new Sessions(movie1, LocalDateTime.now(),2);
        List<Movie> movieList = List.of(movie1,movie2);
        List<User> userList = List.of(user1,user2);


    }
}
