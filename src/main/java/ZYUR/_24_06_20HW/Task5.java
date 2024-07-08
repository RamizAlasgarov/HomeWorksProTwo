package ZYUR._24_06_20HW;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Дан список адресов с полями street, city и zipCode. Создайте список уникальных городов.
 */
public class Task5 {
    public static void main(String[] args) {
        List<Adress> adressList = List.of(new Adress("ZahleStrasse", "Berlin", 12200),
                new Adress("ZahleStrasse", "Berlin", 12200),
                new Adress("NoStrasse", "Bern", 13222),
                new Adress("AndereStrasse", "Berlin", 12201));
        Set<String> adressSet = adressList.stream().map(a -> a.getCity()).collect(Collectors.toSet());
        System.out.println(adressSet);
    }
}

class Adress implements Comparable<Adress> {
    private String street;
    private String city;
    private int zipCode;

    public Adress(String street, String city, int zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return zipCode == adress.zipCode && Objects.equals(street, adress.street) && Objects.equals(city, adress.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, zipCode);
    }

    @Override
    public int compareTo(Adress o) {
        return this.city.compareTo(o.city);
    }
}
