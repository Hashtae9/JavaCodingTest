import java.util.Scanner;

// d[i] : i 번째를 반드시 포함하는 증가하는 부분 수열의 최대 길이
public class BOJ11722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

//        lis 를 사용하기 위해 뒤집어 진행
        int[] reverseValues = reverse(values);
        int[] d = new int[n];

        int result = 1;
        for (int i = 0; i < n; i++) {
            d[i] = 1;

            for (int j = i - 1; j >= 0 ; j--) {
                if (reverseValues[j] < reverseValues[i]) {
                    d[i] = Math.max(d[i], d[j] + 1);
                    result = Math.max(d[i], result);
                }
            }
        }

        System.out.println(result);
    }

    static int[] reverse(int[] d){
        int[] result = new int[d.length];
        for (int i = 0; i < d.length; i++) {
            result[d.length - i - 1] = d[i];
        }

        return result;
    }
}
