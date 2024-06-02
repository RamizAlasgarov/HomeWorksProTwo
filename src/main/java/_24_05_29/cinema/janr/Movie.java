package _24_05_29.cinema.janr;

public class Movie implements Film{
    protected String title;
    protected String janr;

    public Movie(String title, String janr) {
        this.title = title;
        this.janr = janr;
    }

    @Override
    public String getNazvaiyeFilma() {
        return this.title;
    }

    @Override
    public String getJanr() {
        return null;
    }
}
