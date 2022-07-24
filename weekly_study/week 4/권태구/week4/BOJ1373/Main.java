package week4.BOJ1373;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String[] s = str.split("");
        int[] arr = new int[str.length()];

        for(int i = 0; i<str.length(); i++){
            arr[i] = Integer.parseInt(s[i]);
        }

        if(str.length() % 3 == 1){ //제일 앞이 1개가 남을경우
            sb.append(arr[0]);
        }

        if(str.length() % 3 == 2){ //제일 앞이 2개가 남을 경우
            int result =(arr[0]*2+arr[1]);
            sb.append(result);
        }

        for(int i = str.length()%3; i<str.length(); i+=3){
            int result = (arr[i]*4 + arr[i+1]*2 + arr[i+2]);
            sb.append(result);
        }
        System.out.println(sb);
    }
}
