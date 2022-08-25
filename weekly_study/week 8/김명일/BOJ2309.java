import java.util.*;

// 조합 사용
public class BOJ2309 {
    static class Combination {
        private final int n;
        private final int r;
        private final int[] now;
        private final ArrayList<ArrayList<Integer>> result;

        public Combination(int n, int r) {
            this.n = n;
            this.r = r;
            this.now = new int[r];
            this.result = new ArrayList<>();
        }

        public void combination(ArrayList<Integer> arr, int depth, int index, int target) {
            // nCr에서 r에 도달하면 원하는 결과이므로 추가
            if (depth == r) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int i = 0; i < now.length; i++) {
                    temp.add(arr.get(now[i]));
                }
                result.add(temp);
                return;
            }
            // 끝까지 도달하면 그냥 리턴
            if (target == n) {
                return;
            }

            now[index] = target;
            // 해당 인덱스를 포함하는 조합
            combination(arr, depth + 1, index + 1, target + 1);
            // 해당 인덱스를 포함하지 않는 조합
            combination(arr, depth, index, target + 1);
        }

        public ArrayList<ArrayList<Integer>> getResult() {
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> values = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            values.add(sc.nextInt());
        }

        Collections.sort(values);

        Combination comb = new Combination(9, 7);
        comb.combination(values, 0, 0, 0);

        ArrayList<ArrayList<Integer>> result = comb.getResult();

        for (ArrayList<Integer> cur : result) {
            int sum = 0;
            for (int value : cur) {
                sum += value;
            }
            if (sum == 100) {
                cur.forEach(System.out::println);
                break;
            }
        }

    }


}
