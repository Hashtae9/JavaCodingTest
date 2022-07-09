import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BOJ10820 문자열 분석
 *
 * 자바 EOF 처리
 * Scanner
 * sc.hasNext();
 *
 * BufferedReader
 * br.readline() == null
 */

public class BOJ10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            // EOF 처리
            if (input == null) {
                break;
            }

            int[] counts = new int[4];
            for (int i = 0; i < input.length(); i++) {
                int cur = input.charAt(i);

                if ('a' <= cur && cur <= 'z') {
                    counts[0] += 1;
                } else if ('A' <= cur && cur <= 'Z') {
                    counts[1] += 1;
                } else if ('0' <= cur && cur <= '9') {
                    counts[2] += 1;
                } else if (cur == ' ') {
                    counts[3] += 1;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int count : counts) {
                sb.append(count).append(' ');
            }
            System.out.println(sb);
        }


    }
}
