import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * BOJ1406 에디터
 */
public class BOJ1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            s1.push(a.charAt(i));
        }

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            String operation = st.nextToken();
            switch (operation) {
                case "P": {
                    String val = st.nextToken();
                    s1.push(val.charAt(0));
                    break;
                }
                case "L": {
                    if(!s1.isEmpty()) s2.push(s1.pop());
                    break;
                }
                case "D": {
                    if(!s2.isEmpty()) s1.push(s2.pop());
                    break;
                }
                case "B": {
                    if(!s1.isEmpty()) s1.pop();
                    break;
                }
            }
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        StringBuilder sb = new StringBuilder();
        while (!s2.isEmpty()) {
            sb.append(s2.pop());
        }
        System.out.println(sb);
    }
}
