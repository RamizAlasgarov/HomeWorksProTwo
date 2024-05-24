package _24_05_23;

public class Example01 {

    public static void hello() {
        System.out.println("hello");
    }

    public static void say(String text) {
        System.out.printf("hello %s\n", text);
    }

    public static String getText() {
        String temp = "Какое-то возвращаемый текст";
        temp = temp.trim();
        return temp;
    }

    public static String add(int x, int y) {
        String result = Integer.toString(x + y);
        return result;
    }

    public static void main(String[] args) {
        hello();
        say("какой-то текст");

        String value = getText();
        String sumToText = add(1, 2);
    }
}
