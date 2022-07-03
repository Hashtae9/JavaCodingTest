import java.util.Scanner;

public class BOJ9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String value = sc.nextLine();
            int isSame = 0;
            for (int j = 0; j < value.length(); j++) {
                char a = value.charAt(j);

                if (a == '(') {
                    isSame += 1;
                } else {
                    isSame -= 1;
                    if (isSame < 0) {
                        break;
                    }
                }
            }

            if (isSame != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}
