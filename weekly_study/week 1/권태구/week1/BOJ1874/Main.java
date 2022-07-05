package BOJ1874;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int c_value = 0;

        for(int i =0; i<n; i++){
            int value = Integer.parseInt(br.readLine());

            if(value > c_value){
                for(int j = c_value+1; j <= value; j++){
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                c_value = value;
            }else{
                if(stack.peek() != value){
                    System.out.println("NO");
                    return;
                }
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}
