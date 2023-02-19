import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LeetCode {
    public static void main(String[] args) {

        int[] num = {2, 7, 11, 15};
        int target = 9;

        for (int i : twoSum(num, target)) {
            System.out.print(i + " ");
        }
    }
    /*private static int[] twoSum(int[] num, int target) {
            for (int i = 0; i < num.length; i++) {
                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] + num[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }

        return num;
    }*/

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = indexes.get(nums[i]);
            if (index != null) {
                return new int[] {i, index};
            }
            indexes.put(target - nums[i], i);
        }
        return nums;
    }
}

