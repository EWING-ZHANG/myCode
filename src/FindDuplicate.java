import java.util.Arrays;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                    res=i;
                }
            }

        }
        return res;
    }
}
