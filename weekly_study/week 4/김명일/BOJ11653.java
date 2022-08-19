import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ11653 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int target = sc.nextInt();
        int maxValue = 10000000;

        boolean[] isPrimes = getSieveOfEratones(maxValue);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 2; i < isPrimes.length; ) {
            if (isPrimes[i] && target % i == 0) {
                pq.add(i);
                target = target / i;
                if (isPrimes[target]) {
                    pq.add(target);
                    break;
                }
            } else {
                i += 1;
            }
        }

        while (!pq.isEmpty()) {
            bw.write(pq.poll() + "\n");
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
