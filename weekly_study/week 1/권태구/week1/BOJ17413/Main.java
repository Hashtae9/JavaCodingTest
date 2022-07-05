package BOJ17413;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        String str = br.readLine();

        Deque<Character>deque = new LinkedList<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='<'){
                int j=i;
                while(str.charAt(j)!='>'){
                    sb.append(str.charAt(j));
                    j++;
                }
                sb.append('>');
                i=j;
            }
            else if(str.charAt(i)==' '){
                sb.append(" ");
            }
            else{
                int j=i;
                while(j<str.length() && str.charAt(j) != ' ' && str.charAt(j) != '<'){
                    deque.addLast(str.charAt(j));
                    j++;
                }
                int length=deque.size();
                for(int k=0; k<length; k++){
                    sb.append(deque.pollLast());
                }
                i=j-1;
            }
        }

        System.out.println(sb.toString());
    }
}
