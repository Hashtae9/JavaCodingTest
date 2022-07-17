import java.util.Scanner;

/**
 * BOJ2004 조합 0의 개수
 * 5C2 = 5*4 / 2! -> 시간초과
 * nCr = n! / ((n-r)! * r!)
 * n!에 2의 개수 -> 1 ~ n 까지 짝수 개수 + 1 ~ n/2 까지 짝수 개수 + ....
 * n!에 5의 개수 -> 1 ~ n 까지 5의 배수 개수 + 1 ~ n / 5 까지 5의 배수 개수 + ...
 *
 * 숫자가 좀 작아지고 메모리 사용량이 커진다면 dp를 통해 더 빠른 해결 가능할 것 같음
 */
public class BOJ2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int twoCount = findTwo(N) - findTwo(N - M) - findTwo(M);
        int fiveCount = findFive(N) - findFive(N - M) - findFive(M);

        System.out.println(Math.min(twoCount, fiveCount));
    }

    static int findTwo(int num) {
        if(num < 2) return 0;

        // num 까지의 2의 배수 + num / 2 까지의 2의 배수
        return (num / 2) + findTwo(num / 2);
    }

    static int findFive(int num) {
        if(num < 5) return 0;

        // num 까지의 5의 배수 + num / 5 까지의 5의 배수
        return (num / 5) + findFive(num / 5);
    }
}
