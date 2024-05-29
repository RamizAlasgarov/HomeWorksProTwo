package _24_05_29.cinema.users;

public class VieweUser implements User{
    private String name;
    private String rol;

    public VieweUser(String name, String rol) {
        this.name = name;
        this.rol = rol;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getRol() {
        return null;
    }
}
