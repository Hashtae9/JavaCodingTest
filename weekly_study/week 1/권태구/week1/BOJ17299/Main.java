package BOJ17299;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n]; //숫자입력
        int[] countArr = new int[1000001]; //각 숫자가 몇번 나왔는가?
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>(); // 인덱스 관리

        String str = br.readLine();
        String[] number = str.split(" ");

        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(number[i]);
            countArr[arr[i]] += 1;
        }

        stack.push(0);

        for(int i = 1; i<n; i++){
            if(stack.isEmpty())
                stack.push(i);
            while(!stack.isEmpty() && countArr[arr[stack.peek()]] < countArr[arr[i]]){
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) result[stack.pop()] = -1;

        for(int i = 0; i<n; i++){
            bw.write(result[i] + " ");
        }
        bw.flush();
    }
}
