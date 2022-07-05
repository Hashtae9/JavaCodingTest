package BOJ9012;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String a;

        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (char ch : str.toCharArray()) {
                if (ch == '(') stack.push(ch);
                else {
                    if (stack.isEmpty()) {
                        stack.push(ch); //넣어줌으로써 stack이 절대 비지 않음
                        break;
                    } else stack.pop();
                }
            }
            if (stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
        br.close();
    }
}
