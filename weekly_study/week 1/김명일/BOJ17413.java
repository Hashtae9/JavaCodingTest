import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BOJ17413 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        boolean isOpen = false;
        StringBuilder result = new StringBuilder();
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char cur = input.charAt(i);

            if (cur == '<') {
                while (!s.isEmpty()) {
                    result.append(s.pop());
                }
                isOpen = true;
                result.append(cur);
                continue;
            }

            if (cur == '>') {
                isOpen = false;
                result.append(cur);
                continue;
            }

            if (isOpen) {
                result.append(cur);
                continue;
            }

            if (!isOpen && cur == ' ') {
                while (!s.isEmpty()) {
                    result.append(s.pop());
                }
                result.append(cur);
                continue;
            }

            s.add(cur);
        }

        // 모두다 합치기
        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        System.out.println(result);
    }
}
