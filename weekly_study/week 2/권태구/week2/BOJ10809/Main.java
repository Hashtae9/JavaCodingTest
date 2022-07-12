package week2.BOJ10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] arr = new int[26];
        for(int i = 0; i<26; i++){
            arr[i] = -1;
        }

        for(int j = 0; j<str.length(); j++){
            if(arr[str.charAt(j)-'a'] == -1) arr[str.charAt(j)-'a'] = j;
        }

        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
