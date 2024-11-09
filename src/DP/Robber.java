package DP;

public class Robber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int rob = rob(nums);
        System.out.println(rob);
    }
    public static int rob(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=nums[1];

        for (int i = 2; i <nums.length ; i++) {
            dp[2]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[nums.length-1];
    }
}
