package week4.BOJ1212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        int[] arr = new int[str.length];
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i = 0; i<str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        for(int i = 0; i< str.length; i++){
            if(i == 0) {
                int a = arr[i];
                queue.add(a / 4);
                a %= 4;
                queue.add(a / 2);
                queue.add(a % 2);

                if (queue.peek() == 0) { //첫번째 자리가 0인 경우
                    queue.remove();
                    if (queue.peek() == 0) { //첫번째도 0이고 두번째도 0인 경우
                        queue.remove();
                    }
                }

                while (queue.peek() != null) sb.append(queue.poll());
            }
            else{
                int a = arr[i];
                queue.add(a / 4);
                a %= 4;
                queue.add(a / 2);
                queue.add(a % 2);

                while (queue.peek() != null) sb.append(queue.poll());
            }
        }
        System.out.println(sb);
    }
}
