import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        PriorityQueue<String> pq = new PriorityQueue<>();

        for (int i = 0; i < input.length(); i++) {
            pq.offer(input.substring(i));
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            sb.append(pq.poll()).append('\n');
        }

        System.out.println(sb);
    }
}
