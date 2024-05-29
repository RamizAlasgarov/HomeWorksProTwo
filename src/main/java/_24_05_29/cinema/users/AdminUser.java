package _24_05_29.cinema.users;

public class AdminUser implements User {
    private String name;
    private String rol;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getRol() {
        return this.rol;
    }
}
