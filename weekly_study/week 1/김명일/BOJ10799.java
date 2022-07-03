import java.util.Scanner;
import java.util.Stack;

/**
 * BOJ10799 쇠막대기
 */
public class BOJ10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Stack<Character> s = new Stack<>();

        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            char cur = input.charAt(i);

            if (cur == '(') {
                s.push(cur);
            } else {
                s.pop();
                char prev = input.charAt(i - 1);
                if (prev == '(') {
                    result += s.size();
                } else {
                    result += 1;
                }
            }
        }

        System.out.println(result);
    }
}
