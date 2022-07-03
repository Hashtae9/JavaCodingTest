import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * BOJ 17299 오등큰수
 */
public class BOJ17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] values = new int[n];
        int[] counts = new int[1000001];
        Stack<Integer> s = new Stack<>();
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int value =  Integer.parseInt(st.nextToken());
            values[i] = value;
            counts[value] += 1;
        }

        for (int i = 0; i < values.length; i++) {
            int cur = values[i];

            while(!s.isEmpty() && counts[values[s.peek()]] < counts[cur]){
                values[s.pop()] = cur;
            }

            s.push(i);
        }

        while (!s.isEmpty()) {
            values[s.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int value: values){
            sb.append(value).append(' ');
        }

        System.out.println(sb);

    }
}
