package LeetCode.TopInterviewQuestions.Intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryOfRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>(); //initializing list to store the resulting ranges

        if (nums == null || nums.length == 0) { //handling edge cases
            return result;
        }

        int start = nums[0];
        for (int i=1; i<=nums.length; i++) {   //looping through an array, going an extra length to close the last range
            if (i == nums.length || nums[i] != nums[i-1]+1) { //checking when the end of an array is reached or when the numbers are not consecutive
                int end = nums[i-1]; //end of the range is the previous number

                if (start == end) { //when the range has only one number
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + end); // if the range has multiple numbers
                }
                if (i < nums.length) { // if the end has not reached
                    start = nums[i]; //start of the next range
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //int[] nums = {0,1,2,4,5,7};
        int[] nums = {0,1,2,3,4,6,8,9};

        SummaryOfRanges sr = new SummaryOfRanges();
        List<String> result = sr.summaryRanges(nums);
        System.out.println(result);
    }
}
