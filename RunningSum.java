public class RunningSum {
    public static int[] getRunningSum(int[] nums) {
        int sum = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }

    public static int[] getRunningSumSpaceOptimized(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        for (int i : getRunningSumSpaceOptimized(nums)) {
            System.out.println(i);
        }
    }
}
