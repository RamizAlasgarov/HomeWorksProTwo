package ZYUR._24_04_19;

public record Student(String name, int age, double avgMark) {
    public Student(String name, int age) {
        this(name, age, 0.0);
    }

    public Student updateAvgMark(double avgMark) {
        return new Student(name, age, avgMark);
    }
}
