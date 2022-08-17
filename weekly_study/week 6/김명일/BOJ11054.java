import java.util.Scanner;

// lis 를 양쪽에서 진행하여 그 결과의 합 - 1이 가장 큰 길이이다.
public class BOJ11054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        int[] reversedValues = reverseArray(values);

        int[] lis = new int[n];
        int[] reverseLis = new int[n];

        for (int i = 0; i < n; i++) {
            lis[i] = 1;
            reverseLis[i] = 1;

            for (int j = i - 1; j >= 0; j--) {
                if (values[j] < values[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
                if (reversedValues[j] < reversedValues[i]) {
                    reverseLis[i] = Math.max(reverseLis[i], reverseLis[j] + 1);
                }
            }
        }

        int[] reversedreverseLis = reverseArray(reverseLis);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int cur = lis[i] + reversedreverseLis[i] - 1;
            max = Math.max(cur, max);
        }

        System.out.println(max);

    }

    static int[] reverseArray(int[] d){
        int[] result = new int[d.length];

        for (int i = 0; i < d.length; i++) {
            result[i] = d[d.length - 1 - i];
        }

        return result;
    }
}
