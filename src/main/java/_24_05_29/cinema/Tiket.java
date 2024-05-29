package _24_05_29.cinema;

import _24_05_29.cinema.users.User;

/**
 *    - Создать класс `Ticket`, представляющий билет, который содержит информацию о пользователе, сеансе и месте.
 */
public class Tiket {
    private User user;
    private Sessions sessions;
    private String place;

    public Tiket(User user, Sessions sessions, String place) {
        this.user = user;
        this.sessions = sessions;
        this.place = place;
    }
}
