package BOJ17298;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        
        int[] a = new int[n];
        int[] ans = new int[n];
        
        String[] str = bf.readLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }
        
        Stack<Integer> stack= new Stack<>();

        stack.push(0);

        for (int i = 1; i < n; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            }
            while (!stack.isEmpty() && a[stack.peek()] < a[i]) {
                ans[stack.pop()] = a[i];
            }
            stack.push(i);
        }

        while (!stack.empty()) {
            ans[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
