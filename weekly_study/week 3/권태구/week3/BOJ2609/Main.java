package week3.BOJ2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));

    }

    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return a*b/gcd(a, b);
    }
}
