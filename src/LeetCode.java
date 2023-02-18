import java.util.LinkedList;
import java.util.List;

public class LeetCode {
    public static void main(String[] args) {

        int[] num = {3, 2, 3};
        int target = 6;

        for (int i : twoSum(num, target)) {
            System.out.print(i + " ");
        }

    }
    private static int[] twoSum(int[] num, int target) {
        List<Integer> index = new LinkedList<>();
        if ((num[0] + num[num.length - 1]) == target) {
            for (int i = 0; i < num.length; i++) {
                index.add(i);
                index.add(num.length - 1);
                break;
            }
        } else {
            for (int i = 0; i < num.length; i++) {
                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] + num[j] == target) {
                        index.add(i);
                        index.add(j);
                    }
                }
            }
        }
        int[] indexNum = new int[index.size()];
        for (int n = 0; n < index.size(); n++) {
            indexNum[n] = index.get(n);
        }
        return indexNum;
    }
}

