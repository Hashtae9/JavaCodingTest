package week4.BOJ17087;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int s = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = Math.abs(s-scan.nextInt());
        }

        int result = arr[0]; // 0초기화 x, 동생이 한명일 경우 대비
        for(int j = 1; j<arr.length; j++){
            result = gcd(result, arr[j]); //세 수 이상의 최대공약수는 한 수를 기준으로 두고 나머지수들의 모든 최대공약수를 구하면 됨
        }
        System.out.println(result);

    }

    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}
