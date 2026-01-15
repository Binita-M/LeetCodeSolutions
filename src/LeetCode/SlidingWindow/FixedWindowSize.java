package LeetCode.SlidingWindow;

public class FixedWindowSize {
    public int findBestSubArray(int[] nums, int k) {
        int currentSum = 0;

        for(int i=0; i<k; i++) {
            currentSum += nums[i];
        }

        int ans = currentSum;
        for(int i=k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i-k];
            ans = Math.max(ans, currentSum);
        }
       return ans;
    }

    public static void main(String[] args) {
        FixedWindowSize fixedWindowSize = new FixedWindowSize();
        int[] nums = {3,-1,4,12,-8,5,6};
        int k = 4;

        int ans = fixedWindowSize.findBestSubArray(nums, k);
        System.out.println(ans);
    }
}
