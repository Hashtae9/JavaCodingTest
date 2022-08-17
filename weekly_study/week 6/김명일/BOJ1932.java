    import java.util.Scanner;

    // d[i][j] : i 번째 row 에서 j 번째 값을 선택했을 때, 가장 큰 값
    // = d[i-1][j] 와 d[i-1][j-1] 중 큰 값 + 현재 위치의 값
    public class BOJ1932 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            int n = sc.nextInt();

            int[][] d = new int[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    d[i][j] = Math.max(d[i - 1][j], d[i - 1][j - 1]) + sc.nextInt();
                }
            }

            int result = getMax(d[n]);

            System.out.println(result);
        }

        static int getMax(int[] d){
            int maxValue = Integer.MIN_VALUE;
            for (int cur : d) {
                if(maxValue < cur) maxValue = cur;
            }

            return maxValue;
        }
    }
