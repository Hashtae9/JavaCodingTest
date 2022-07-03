import java.util.Scanner;
import java.util.Stack;

/**
 * BOJ1874 스택 수열
 */

public class BOJ1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int idx = 0;
        int value = 1;
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        boolean isSuccess = true;

        while (idx < n) {
            if (value <= values[idx]) {
                s.push(value);
                sb.append('+').append('\n');
                value++;
                continue;
            }

            if (s.peek() == values[idx]) {
                sb.append('-').append('\n');
                s.pop();
                idx++;
                continue;
            }

            isSuccess = false;
            break;
        }

        if (isSuccess) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}
