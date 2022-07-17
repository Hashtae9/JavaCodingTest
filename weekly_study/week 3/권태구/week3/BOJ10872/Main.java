package week3.BOJ10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = n;

        if(n == 0){
            result = 1;
        }
        else{
            for(int i = n; i>1; i--){
                result = result*(i-1);
            }
        }

        System.out.println(result);
    }

//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        int N = in.nextInt();
//        in.close();
//
//        int sum = factorial(N);
//        System.out.println(sum);
//
//    }
//
//    public static int factorial(int N) {
//        if(N <= 1) return 1;	// 재귀 종료조건
//        return N * factorial(N - 1);
//    }
//
//}
}
