package week4.BOJ2745;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        int b = scan.nextInt();

        char[] c = n.toCharArray();

        int result = 0;

        for(int i = 0; i<c.length; i++){
            if(c[i] >= 'A' && c[i] <= 'Z') result += (c[i]-'A'+10) *Math.pow(b, n.length()-i-1);
            else result += ((c[i] - '0')*Math.pow(b, n.length()-i-1));
        }
        System.out.println(result);
    }
}
