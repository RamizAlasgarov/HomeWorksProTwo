package _2024_07_08;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(res(17));
    }

    public static int res(int people) {
        int sum = 0;
        for (int i = 0; i < people; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
