public class KadaneAlgorithm {
    public static int kadaneAlgorithm(int[] nums) {
        int max = nums[0];
        int currentMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            max = Math.max(currentMax, max);
        }
        return max;
    }

    public static int myApproach(int[] nums) {
        int max = nums[0];
        int currentMax = 0;

        for (int i = 0; i < nums.length; i++) {
            currentMax = currentMax + nums[i];

            if (currentMax < 0) {
                currentMax = 0;
            }
            if(currentMax > max){
                max = currentMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(kadaneAlgorithm(nums));
        System.out.println(myApproach(nums));
    }
}