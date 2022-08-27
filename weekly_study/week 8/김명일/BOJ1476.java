import java.util.Scanner;

// E를 기준으로 값을 키워가며 S와 M 조건에 부합하는지 체크
public class BOJ1476 {
    static final int MAX_E = 15;
    static final int MAX_S = 28;
    static final int MAX_M = 19;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();


        int i = 0;
        while(true){
            int cur = i * MAX_E + E;

            int rS = S == MAX_S ? 0 : S;
            int rM = M == MAX_M ? 0 : M;

            if(S <= cur && M <= cur && cur % MAX_S == rS && cur % MAX_M == rM) break;

            i++;
        }

        System.out.println(i * MAX_E + E);

    }
}
