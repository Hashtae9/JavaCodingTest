import java.util.Scanner;
import java.util.Stack;

/**
 * BOJ 1918 후위 표기식
 */
public class BOJ1918 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        // 연산자 스택 - 후기 표현식 특성상 일반적으로 먼저 나온 연산자가 나중에 나온다.
        Stack<Character> s = new Stack<>();

        // 1. 문자는 그대로 출력한다.
        // 2. (는 스택에 추가한다.
        // 3. )가 나오면 스택에서 다음이 (나올 때 까지 또는 스택이 빌때까지 출력한다. (제거해준다.
        // 4. +, - 가 나오면 스택에 다음이 (가 나오거나 빌 때까지 출력한다. 이후 자기자신을 스택에 추가한다.
        // ( +, - 는 우선순위가 제일 나중이다. 다 꺼내고 자기자신을 넣는다. )
        // 5. *, / 가 나오면 스택에 비지 않고 * 또는 /가 다음이면 출력한다. 이후 자기자신을 스택에 추가한다.
        // ( +, - 인 경우, *, / 가 우선순위가 높으니까 그냥 추가하면 된다. b/c 스택에 넣는 거니까 나중에 들어갔으니 먼저 나온다 -> 먼저계산된다. )
        // 6. 스택에 남은 전부를 출력한다.

        for (int i = 0; i < input.length(); i++) {
            char val = input.charAt(i);

            if ('A' <= val && val <= 'Z') {
                sb.append(val);
            } else {
                if (val == '(') {
                    s.push(val);
                } else if (val == '*' || val == '/') {
                    while (!s.isEmpty() && (s.peek() == '*' || s.peek() == '/')) sb.append(s.pop());
                    s.push(val);
                } else if (val == '+' || val == '-') {
                    while (!s.isEmpty() && s.peek() != '(') sb.append(s.pop());
                    s.push(val);
                } else if (val == ')') {
                    while (!s.isEmpty() && s.peek() != '(') sb.append(s.pop());
                    if (!s.isEmpty()) s.pop();
                }
            }
        }

        while (!s.isEmpty()) sb.append(s.pop());

        System.out.println(sb);

    }

}
