package BOJ10845;

import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<Integer>();
        int last = 0;

        for(int i=0; i<n; i++){
            String s = br.readLine();
            String[] judge = s.split(" ");
            switch(judge[0]){
                case "push":
                    last = Integer.parseInt(judge[1]);
                    queue.offer(last);
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        sb.append("-1").append("\n");
                        break;
                    }
                    sb.append(queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty()? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? -1 : last).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
