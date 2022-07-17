import java.util.Arrays;
import java.util.Scanner;

/**
 * BOJ6588 골드바흐의 추측
 */
public class BOJ6588 {
    static final int MAX = 1000000;

    static final String FAIL_MESSAGE = "Goldbach's conjecture is wrong.";

    public static void main(String[] args) {
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(MAX); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int target = sc.nextInt();
            if (target == 0) {
                break;
            }
            boolean hasSolution = false;
            for (int i = 3; i <= target / 2; i++) {
                if (isPrime[i] && isPrime[target - i]) {
                    sb.append(String.format("%d = %d + %d", target, i, target - i)).append("\n");
                    hasSolution = true;
                    break;
                }
            }

            if (!hasSolution) {
                sb.append(FAIL_MESSAGE).append("\n");
            }

        }
        System.out.println(sb);
    }
}
