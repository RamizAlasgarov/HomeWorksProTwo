package ZYUR._2024_07_07;


public record Sweet(int id) {
    private static int count = 0;

    public Sweet() {
        this(count++);
    }
}

