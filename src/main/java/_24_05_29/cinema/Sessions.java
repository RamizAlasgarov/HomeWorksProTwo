package _24_05_29.cinema;

import _24_05_29.cinema.janr.Film;
import _24_05_29.cinema.janr.Movie;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Создать класс Session, представляющий сеанс, который содержит фильм, время и количество доступных билетов.
 */
public class Sessions {
    private Movie movie;
    private LocalDateTime localDateTime;
    private int countOfTicket;

    public Sessions(Movie movie, LocalDateTime localDateTime, int countOfTicket) {
        this.movie = movie;
        this.localDateTime = localDateTime;
        this.countOfTicket = countOfTicket;
    }
}
