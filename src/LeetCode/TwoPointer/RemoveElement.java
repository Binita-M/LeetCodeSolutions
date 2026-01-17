package LeetCode.TwoPointer;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveElement rm = new RemoveElement();

        int[] nums = {2,4,3,6,7,8,4,2,4};
        int k = 2;

        int result = rm.removeElement(nums, k);
        System.out.println(result);
    }
}
