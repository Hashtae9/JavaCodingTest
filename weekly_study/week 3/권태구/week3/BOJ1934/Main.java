package week3.BOJ1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i<count; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            System.out.println(lcm(a, b));
        }
    }

    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return a*b/gcd(a, b);
    }
}
