package LeetCode.TopInterviewQuestions.ArrayAndString;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <=2) {
            return nums.length;
        }

        int k=2;
        for (int i=2; i<nums.length; i++) {
            if (nums[i] != nums[k-2]) {
                nums[k] = nums[i];
                k++;
            }
        }
    return k;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrayII rdfsaii = new RemoveDuplicatesFromSortedArrayII();
        int[] nums = {1,1,2,3,3,3,3,4,4,5};

        int result = rdfsaii.removeDuplicates(nums);
        System.out.println(result);

        for (int i=0; i<result; i++) {
            System.out.print(nums[i] + "\t");
        }
    }
}
