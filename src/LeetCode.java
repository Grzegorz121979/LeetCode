import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LeetCode {
    public static void main(String[] args) {

        int[] num = {2, 7, 11, 15};
        int target = 9;

        Map<Integer, Integer> index = new HashMap<>();
        int[] indexes = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            index.put(num[i], i);
        }


        System.out.println(index);

        for (int i : twoSum(num, target)) {
            System.out.print(i + " ");
        }
    }
    private static int[] twoSum(int[] num, int target) {
            for (int i = 0; i < num.length; i++) {
                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] + num[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }

        return num;
    }
}

