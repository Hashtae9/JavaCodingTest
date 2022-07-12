package week2.BOJ10820;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while((str=br.readLine()) != null){
            int[] arr = new int[4];

            for(int i = 0; i<str.length(); i++){
                if(str.charAt(i)<='z' && str.charAt(i)>='a') arr[0]++;
                else if(str.charAt(i)<='Z' && str.charAt(i)>='A') arr[1]++;
                else if(str.charAt(i)==' ') arr[3]++;
                else if(str.charAt(i)>='0' && str.charAt(i)<='9') arr[2]++;
            }

            for(int val : arr){
                bw.write(val + " ");
            }
            bw.write("\n");
            bw.flush();
        }
    }
}
