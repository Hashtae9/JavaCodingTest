package BOJ1158;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i<=n; i++){
            queue.add(i);
        }

        sb.append("<");

        for(int i = 0; i < n; i++){
            if(i+1 != n) {
                for (int j = 1; j <= k; j++) {
                    if (j == k) sb.append(queue.poll()).append(", ");
                    else queue.add(queue.poll());
                }
            }else sb.append(queue.poll()).append(">");
        }
        System.out.println(sb);

    }
}