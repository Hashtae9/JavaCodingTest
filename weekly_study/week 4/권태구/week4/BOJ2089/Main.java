package week4.BOJ2089;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        if(n==0){
            sb.append(0);
        }else{
             while(n!=1){
                 sb.append(Math.abs(n % -2)); //나머지가 생기는지(1) 안생기는지 (0)
                 n = (int)(Math.ceil((double)n/-2)); //몫
                 //Math.ceil = 입력값보다 크거나 같은 가장 작은 정수값을 double형으로 반환
             }
             sb.append(n);
        }
        System.out.println(sb.reverse());

//        System.out.println(n%-2);
//        System.out.println(n/(-2));
//        System.out.println(Math.abs(n% -2));
//        System.out.println(Math.abs(n/(-2)));
    }
}
// -13 = -2 * 7 + 1 -> 1
// 7 = -2*-3 + 1 -> 1
// -3 = -2*2 + 1 -> 1
// 2 = -2*-1 + 0 -> 0
// -1 = -2*1 + 1 -> 1
// 1
// 110111

// -13/-2 = 6.5 -> 7 해당 결과값 보다 크거나 같은 가장 작은 정수값이 몫이 됨
// 7/-2 = -3.5 -> -3
