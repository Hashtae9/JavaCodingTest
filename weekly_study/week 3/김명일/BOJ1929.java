import java.util.Arrays;
import java.util.Scanner;

/**
 * BOJ1929 소수 구하기
 */
public class BOJ1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();

        boolean[] isPrime = new boolean[max + 1];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(max); i++) {
            if (isPrime[i]) {
                for (int j = i + i; j < max + 1; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = min; i <= max; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
