import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BOJ9613 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int[] values = new int[n];
            for (int j = 0; j < n; j++) {
                values[j] = sc.nextInt();
            }

            long result = 0;
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    result += gcd(values[j], values[k]);
                }
            }

            bw.write(result + "\n");
        }

        bw.flush();

    }

    static int gcd(int a, int b){
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
