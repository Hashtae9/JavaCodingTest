package week4.BOJ11576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[m];
        for(int i = 0; i<m; i++){
            arr[i] = scan.nextInt();
        }

        Stack stack = new Stack<>();

        int tenResult = 0;

        for(int i = 0; i<m; i++){
            tenResult += arr[i]*Math.pow(a, m-i-1);
        }

        while(tenResult > 0){
            stack.push(tenResult%b);
            tenResult /=b;
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }

        System.out.println(sb);
    }
}
