import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * BOJ 10828 스택
 */
public class BOJ10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());


        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String operation = st.nextToken();

            switch (operation) {
                case "push":
                    int value = Integer.parseInt(st.nextToken());
                    s.push(value);
                    break;
                case "top":
                    if (!s.isEmpty()) System.out.println(s.peek());
                    else System.out.println(-1);
                    break;
                case "size":
                    System.out.println(s.size());
                    break;
                case "empty":
                    if (s.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "pop":
                    if (!s.isEmpty()) System.out.println(s.pop());
                    else System.out.println(-1);
                    break;
            }
        }
    }
}
