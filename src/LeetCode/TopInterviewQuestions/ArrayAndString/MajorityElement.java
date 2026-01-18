package LeetCode.TopInterviewQuestions.ArrayAndString;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        Map<Integer, Integer> elementMap = new HashMap<>();

        for (int num:nums) {
            elementMap.put(num, elementMap.getOrDefault(num,0)+1);

          if (elementMap.get(num)>n) {
              return num;
          }
        }
        return -1;
    }

    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int[] nums = {1,2,2,2,2,2,3,4};

        int result = me.majorityElement(nums);
        System.out.println(result);

    }
}
