import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class BOJ14002 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        int[] values = new int[n];
        int[] lis = new int[n];
        int[] prev = new int[n];

        int result = 1;
        int last = 0;
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
            lis[i] = 1;
            prev[i] = -1;

            for (int j = i - 1; j >= 0; j--) {
                if (values[j] < values[i] && lis[i] <= lis[j]) {
                    lis[i] = lis[j] + 1;
                    prev[i] = j;
                }

                if (result < lis[i]) {
                    result = lis[i];
                    last = i;
                }

            }
        }

        Stack<Integer> s = new Stack<>();
        while (last != -1) {
            s.push(values[last]);
            last = prev[last];
        }

        bw.write(s.size() + "\n");
        while (!s.isEmpty()) {
            bw.write(s.pop() + " ");
        }

        bw.flush();
        bw.close();
        sc.close();
    }
}
