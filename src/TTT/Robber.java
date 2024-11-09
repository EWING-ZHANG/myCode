package TTT;

class Robber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,1,2,3,4,5};
        int[][] island = {{1,2},{2,3}};
        System.out.println(island[0][1]);
        int with = robWithFirst(nums);
        int without = robWithout(nums);
        System.out.println(Math.max(without,with));
    }
    //with k+f(!(k-1),!1)
    public static int robWithout(int[] nums) {
        if(nums.length==2) return nums[1];
        int[] res = new int[nums.length];
        res[0]=0;
        res[1]=nums[1];
        res[2]=Math.max(nums[1],nums[2]);
        for (int i = 3; i < nums.length; i++) {
            res[i] = Math.max(nums[i]+res[i-2],nums[i-1]);
        }
        return res[nums.length-1];


    }
    //包含一 不能有k  没一 有k的情况
    public static int robWithFirst(int[] nums){
        if(nums.length==0) return 0;
        int second =nums[0];
        if(nums.length==1) return nums[0];

        int first=Math.max(nums[0],nums[1]);
        if(nums.length==2) return first;
        int res=0;
        for (int i = 2; i <nums.length ; i++) {
            res =Math.max(first,nums[i]+second);
            second =first;
            first=res;
        }
        return second;

    }
}