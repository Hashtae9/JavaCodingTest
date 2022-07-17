import java.util.Scanner;
/**
 * BOJ2609 최대공약수와 최소공배수
 */
public class BOJ2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        int lcm = (A * B) / smaller;

        System.out.println(gcd);
        System.out.println(lcm);

    }
}
