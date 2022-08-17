import java.util.Scanner;
// d[i][0] : i 번째까지 중간에 빼는 것 없이 더했을 때, 가장 큰 값
// = 이전 값까지 중간에 빼는 것 없이 더한 최대 값 + 현재 값과 현재 값에서 시작하는 경우 중 큰 값
// d[i][1] : i 번째까지 중간에 하나 빼고, 가장 큰 값
// = 이전 값까지 중간에 빼는 것 없이 더한 최대 값과 중간에 빠진 적 있이 더한 값 + 현재 값 중 큰 값
public class BOJ13398 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int[] values = new int[n];
        int[][] d = new int[n][2];

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        // 초기 값 설정
        d[0][0] = values[0];
        d[0][1] = values[0];


        int result = values[0];
        for (int i = 1; i < n; i++) {
            d[i][0] = Math.max(d[i - 1][0] + values[i], values[i]);
            d[i][1] = Math.max(d[i - 1][0], d[i - 1][1] + values[i]);


            result = Math.max(Math.max(d[i][0], d[i][1]), result);
        }

        System.out.println(result);

    }
}
