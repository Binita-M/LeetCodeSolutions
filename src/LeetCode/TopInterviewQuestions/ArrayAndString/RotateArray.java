package LeetCode.TopInterviewQuestions.ArrayAndString;

import java.util.Arrays;


public class RotateArray {
    public void rotateArray(int[] nums, int k) {

        /*if (nums == null || nums.length == 0) return;
        int n = nums.length;
        k = k % n; //when k>n for eg, if k is 10 and n is 7, rotating 10 times gives same result as rotating 3 times
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }*/

        if (nums == null || nums.length == 0) return; //handles null pointer
        int n= nums.length;
        k= k % n; //handles case where k>n

        reverse(nums, 0, n-1); //reverses whole array
        reverse(nums, 0, k-1); //reverses first k elements
        reverse(nums, k, n-1); //reverses remaining elements
    }

    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        ra.rotateArray(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}