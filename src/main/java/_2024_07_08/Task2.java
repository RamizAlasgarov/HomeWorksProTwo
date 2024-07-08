package _2024_07_08;

import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        String source = "Ss#rr";
        String result = "Srr";

        System.out.println(isCut(source, result));

    }

    public static boolean isCut(String source, String result) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < source.length(); i++) {
            char ch = source.charAt(i);
            if (ch != '#') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        System.out.println(sb);
        return sb.toString().equals(result);

    }
}
