import java.util.Scanner;

// d[i] : i 번째 수를 반드시 포함하는 가장 큰 증가하는 부분 수열 합
public class BOJ11055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] values = new int[n];
        int[] d = new int[n];

//        여기서 초기화 해주면 0이 기본값으로 들어가서 에러가 발생
//        int result = values[0];
        int result = 0;
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
            if(i == 0) result = values[0];
            d[i] = values[i];

            for (int j = i - 1; j >= 0 ; j--) {
                if(values[j] < values[i]){
                    d[i] = Math.max(d[i], d[j] + values[i]);
                    result = Math.max(result, d[i]);
                }
            }
//            lis(Longest Increase Sequence) 방식: 가장 긴 길이를 구하는 방식
//            for (int j = i - 1; j >= 0 ; j--) {
//                if(values[j] < values[i]){
//                    d[i] = Math.max(d[i], d[j] + 1);
//                    result = Math.max(result, d[i]);
//                }
//            }
        }

        System.out.println(result);
    }
}
