import java.util.Arrays;
import java.util.Scanner;

/**
 * BOJ1978 소수찾기
 */
public class BOJ1978 {
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[1001];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(1000); i++) {
            if (isPrime[i]) {
                for (int j = i + i; j < 1001; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        int result = 0;
        for (int i = 0; i < N; i++) {
            int target = sc.nextInt();
            if (isPrime[target]) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}
