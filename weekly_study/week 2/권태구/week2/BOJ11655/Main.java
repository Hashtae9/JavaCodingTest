package week2.BOJ11655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        char[] arr = str.toCharArray();

        for(char c : arr){
            if(c >='a' && c <='z'){
                c+=13;
                if(c>'z') c-=26;
            } else if(c >='A' && c<= 'Z'){
                c+=13;
                if(c>'Z') c-=26;
            }
            sb.append(Character.toString(c));
        }
        System.out.print(sb);
    }
}
