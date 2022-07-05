package BOJ10866;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new LinkedList<>();

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i<count; i++){
            String[] str = br.readLine().split(" ");
            switch(str[0]){
                case "push_front":
                    deque.addFirst(Integer.parseInt(str[1]));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(str[1]));
                    break;
                case "pop_front":
                    if(deque.peekFirst()==null) sb.append("-1").append("\n");
                    else sb.append(deque.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    if(deque.peekLast()==null) sb.append("-1").append("\n");
                    else sb.append(deque.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    if(deque.isEmpty()) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                case "front":
                    if(deque.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(deque.peekFirst()).append("\n");
                    break;
                case "back":
                    if(deque.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(deque.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
