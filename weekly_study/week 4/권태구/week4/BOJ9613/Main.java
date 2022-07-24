package week4.BOJ9613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i<t; i++){
            String[] str = br.readLine().split(" ");
            int[] arr = new int[str.length];
            for(int j = 0; j<str.length; j++){
                arr[j] = Integer.parseInt(str[j]);
            }

            long ans = 0;

            for(int k = 1; k<=arr[0]; k++){
                int index = k+1;

                while(index <= arr[0]){
                    ans += gcd(arr[k], arr[index]);
                    index++;
                }
            }
            System.out.println(ans);
        }
        br.close();
    }

    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}
