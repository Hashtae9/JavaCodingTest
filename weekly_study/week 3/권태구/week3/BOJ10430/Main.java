package week3.BOJ10430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] arr = new int[3];
        for(int i = 0; i<3; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        int A = arr[0];
        int B = arr[1];
        int C = arr[2];

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}
