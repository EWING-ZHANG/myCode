package interviewLeetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int[] test = new int[]{2,3,4,7};
        int[] result = twoSum(test, 9);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> set = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if(set.containsKey(nums[i])){
                 result[0]=set.get(nums[i]);
                 result[1]=i;
                 return result;
            }else{
                set.put(target-nums[i],i);
            }
        }
        return result;
    }
}
