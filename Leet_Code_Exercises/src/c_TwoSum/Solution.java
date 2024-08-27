package c_TwoSum;

import java.util.*;


public class Solution {
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();

        int[] output = new int[2];

        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i])){
                output[0] = map.get(nums[i]);
                output[1] = i;
                return output;
            }
            map.put(target - nums[i], i);
        }
        return null;
    }
}
