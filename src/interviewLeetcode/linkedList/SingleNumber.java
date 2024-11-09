package interviewLeetcode.linkedList;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(i== nums.length || nums[i]!=nums[i+1]){
                return nums[i];
            }
            i++;
        }
        return 0;

    }
}
