import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class BOJ11576 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = sc.nextInt();
        int B = sc.nextInt();

        int n = sc.nextInt();


        int target = 0;
        for (int i = 0; i < n; i++) {
            int cur = sc.nextInt();

            target += cur * Math.pow(A, n - 1 - i);
        }

        Stack<Integer> s = new Stack<>();

        while(true){
            int r = target % B;
            int q = target / B;

            s.push(r);

            if (q == 0) {
                break;
            }

            target = q;
        }

        while (!s.isEmpty()) {
            bw.write(s.pop() + " ");
        }

        bw.flush();
    }
}
