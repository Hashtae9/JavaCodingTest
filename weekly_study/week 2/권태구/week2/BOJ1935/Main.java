package week2.BOJ1935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Stack<Double> stack = new Stack<>();
        double[] number = new double[count];
        for(int i = 0; i<number.length; i++){
            number[i] = Double.parseDouble(br.readLine()); //A부터 0번째 시작
        }

        double result = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                stack.push(number[str.charAt(i) - 'A']);
            } else{
                if(!stack.isEmpty()){
                    double first = stack.pop();
                    double second = stack.pop();
                    switch(str.charAt(i)){
                        case '+':
                            result = second + first;
                            stack.push(result);
                            continue;
                        case '-':
                            result = second - first;
                            stack.push(result);
                            continue;
                        case '*':
                            result = second * first;
                            stack.push(result);
                            continue;
                        case '/':
                            result = second / first;
                            stack.push(result);
                            continue;
                    }
                }
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}
