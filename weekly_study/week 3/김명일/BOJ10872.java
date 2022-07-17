import java.util.Scanner;

/**
 * BOJ10872 팩토리얼
 */
public class BOJ10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        int result = 1;
        for (int i = 2; i <= target; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
