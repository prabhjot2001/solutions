import java.util.HashMap;
import java.util.Map;

public class SubarraySumK {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int subarraySumOptimized(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            int diff = prefixSum[i] - k;
            if (map.containsKey(diff)) {
                count = count + map.get(diff);
            }
            map.put(prefixSum[i], map.getOrDefault(prefixSum[i], 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 5, 3, 4, 2, 1, 7, 8, 6, 4, 5, 3, 4, 5, 1, 2 };
        int k = 6;
        System.out.println(subarraySum(nums, k));
        System.out.println(subarraySumOptimized(nums, k));
    }
}
