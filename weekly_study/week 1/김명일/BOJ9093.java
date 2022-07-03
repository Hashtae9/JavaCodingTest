import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BOJ9093 단어 뒤집기
 */
public class BOJ9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine(), " ");

            while (st.hasMoreTokens()) {
                StringBuilder temp = new StringBuilder(st.nextToken());
                sb.append(temp.reverse()).append(" ");
            }

            System.out.println(sb);
        }
    }
}
