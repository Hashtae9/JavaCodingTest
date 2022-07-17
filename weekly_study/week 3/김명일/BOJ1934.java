import java.util.Scanner;
/**
 * BOJ1934 최소공배수
 */
public class BOJ1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int smaller = Math.min(A, B);
            int bigger = Math.max(A, B);

            // 유클리드 알고리즘
            int mod = bigger % smaller;
            while (mod > 0) {
                bigger = smaller;
                smaller = mod;
                mod = bigger % smaller;
            }

            int gcd = smaller;

            // gcd(A,B) * lcm(A,B) = A * B
            int lcm = (A * B) / gcd;

            System.out.println(lcm);
        }





    }
}
