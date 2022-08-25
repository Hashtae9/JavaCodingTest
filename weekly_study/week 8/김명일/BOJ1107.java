import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 중복 순열 다구해서 했는데, 매우 비효율적임
public class BOJ1107 {
    static int init = 100; // 처음시작
    static int[] enableNumber = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // 가능한 숫자 초기화

    static ArrayList<ArrayList<Integer>> enableChannel; // i번 눌러서 가능한 숫자들을 통해 갈 수 있는 채널 목록

    static int[] now; // 중복 순열 저장을 위한 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        String targetString = target + "";

        int failCount = sc.nextInt();

        int[] fail = new int[failCount];
        for (int i = 0; i < failCount; i++) {
            fail[i] = sc.nextInt();
        }

        // 고장난 번호를 뺀 가능한 숫자 배열 구하기
        enableNumber = Arrays.stream(enableNumber).filter(v -> Arrays.stream(fail).noneMatch(f -> f == v)).toArray();

        // 중복순열 계산을 위한 임시 배열 초기화
        now = new int[targetString.length() + 1];

        // i번 눌러서 가능한 채널목록 초기화 ( 목표 채널보다 한자리 더 긴 숫자 까지 해야 함 )
        enableChannel = new ArrayList<>();
        for (int i = 0; i <= targetString.length() + 1; i++) {
            enableChannel.add(new ArrayList<>());
        }

        enableChannel.get(0).add(init); // 0번 눌러서 갈 수 있는 채널은 초기값 100
        Arrays.stream(enableNumber).forEach(v -> enableChannel.get(1).add(v)); // 1번 눌러서 갈 수 있는 채널은 가능한 숫자목록과 같음
        for (int i = 2; i < enableChannel.size(); i++) {
            permutation(0, i);
        }

        // 최소 비용 구하기
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < enableChannel.size(); i++) {
            for (int j = 0; j < enableChannel.get(i).size(); j++) {
                // i 번 눌러서 해당 채널에 간 후, 목표 채널과의 차이 만큼 + 또는 - 를 누름
                result = Math.min(result, i + Math.abs(target - enableChannel.get(i).get(j)));
            }
        }

        System.out.println(result);
    }

    // 중복순열 ( cur: 현재 index, r: 목표 개수 )
    static void permutation(int cur, int r) {
        if (cur == r) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < r; i++) {
                temp.append(now[i]);
            }
            enableChannel.get(r).add(Integer.parseInt(temp.toString()));
            return;
        }

        for (int i = 0; i < enableNumber.length; i++) {
            if(cur == 0 && enableNumber[i] == 0) continue; // 2자리부터 구하기 위해 사용하니까 첫자리가 0인 경우 건너뜀
            now[cur] = enableNumber[i];

            permutation(cur + 1, r);
        }
    }


}
