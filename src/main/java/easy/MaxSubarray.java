package easy;

public class MaxSubarray {
    public static void main(String[] args) {

    }

    public static int maxSubArray(int[] nums) {
        int globalMax = nums[0];
        int curMax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (curMax < 0) {
                curMax = 0;
            }
            curMax += num;
            if (curMax > globalMax) {
                globalMax = curMax;
            }
        }
        return globalMax;
    }
}
