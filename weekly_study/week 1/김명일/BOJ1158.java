import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * BOJ1185 요세푸스
 */
public class BOJ1158 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<String> result = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        int count = 1;

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (count != k) {
                q.offer(cur);
                count += 1;
            } else {
                result.add(String.valueOf(cur));
                count = 1;
            }
        }


        System.out.println("<" + String.join(", ", result) + ">");
    }
}
