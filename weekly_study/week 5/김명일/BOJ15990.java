import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// d[i][0] : i 를 나타내는 경우중 1로 끝나는 경우
// d[i][1] : i 를 나타내는 경우중 2로 끝나는 경우
// d[i][2] : i 를 나타내는 경우중 3로 끝나는 경우
public class BOJ15990 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = sc.nextInt();
        long[][] d = new long[100001][3];
        d[1][0] = 1;
        d[1][1] = 0;
        d[1][2] = 0;

        d[2][0] = 0;
        d[2][1] = 1;
        d[2][2] = 0;

        d[3][0] = 1;
        d[3][1] = 1;
        d[3][2] = 1;

        for (int i = 4; i < d.length; i++) {
            d[i][0] = (d[i - 1][1] + d[i - 1][2]) % 1000000009;
            d[i][1] = (d[i - 2][0] + d[i - 2][2]) % 1000000009;
            d[i][2] = (d[i - 3][0] + d[i - 3][1]) % 1000000009;
        }

        for (int i = 0; i < T; i++) {
            int target = sc.nextInt();
            long result = (d[target][0] + d[target][1] + d[target][2]) % 1000000009;
            bw.write(result + "\n");
        }

        bw.flush();
    }
}
