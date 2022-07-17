import java.util.Scanner;

/**
 * BOJ1676 팩토리얼 0의 개수
 * 0의 개수는 2 * 5의 개수라고 할 수 있음
 * 전체 팩토리얼의 2와 5의 개수를 세어 적은 수를 리턴
 */
public class BOJ1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();


        int twoCount = 0;
        int fiveCount = 0;

        for (int i = 2; i <= target; i++) {
            int cur = i;
            while (cur % 2 == 0 || cur % 5 == 0) {
                if (cur % 2 == 0) {
                    twoCount += 1;
                    cur /= 2;
                } else {
                    fiveCount += 1;
                    cur /= 5;
                }
            }
        }
        System.out.println(Math.min(twoCount, fiveCount));
    }
}
