import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

// 에라토네스의 체를 구현해 개수를 확인

public class BOJ17103 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = sc.nextInt();
        int maxValue = 1000000;

        boolean[] isPrimes = getSieveOfEratones(maxValue);

        for (int i = 0; i < T; i++) {
            int target = sc.nextInt();

            int result = 0;
            for (int j = 2; j <= target / 2; j++) {
                if (isPrimes[j] && isPrimes[target - j]) {
                    result += 1;
                }
            }

            bw.write(result + "\n");
        }

        bw.flush();
    }

    static boolean[] getSieveOfEratones(int n) {
        boolean[] values = new boolean[n + 1];
        Arrays.fill(values, true);
        values[0] = false;
        values[1] = false;

        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (values[i]) {
                for (int j = i * i; j <= n; j += i) {
                    values[j] = false;
                }
            }
        }

        return values;
    }
}
