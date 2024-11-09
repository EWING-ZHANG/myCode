package ChapterOne.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Main {
    private int count;
    public static void main(String[] args) {
/*        longestString("adafdeefaadfaadaa");
        int[] arr = {2,3,4};
        int[] res = new int[11];*/

/*        StringBuilder string = new StringBuilder("the sky is blue");
        reverseLetter(string);*/
        int[] nums = {1,1,1,1,1};
        int target = 3;
        Pailie p = new Pailie(nums,target,0);

        int count=0;
        System.out.println(p.findTargetSumWays(nums,target));

/*        int[][] newArr = {{2,3},{2,4},{3,5}};
        Arrays.sort(newArr,Comparator.comparing());
        System.out.println(newArr[0]);*/






    }
    public static void longestString(String s){
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            arr.add('#');
            arr.add(s.charAt(i));

        }
        arr.add('#');
        System.out.println(arr);

        List<Character> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            List<Character>  help = getLen(arr,i);
            //第一次操作时候会有问题
        if(help.size()>result.size()){
                result = help;
            }
        }
        String string = "";
        for (int i = 0; i < result.size(); i++) {
            if(!result.get(i).equals('#')){
                string +=result.get(i);
            }
        }
        System.out.println(string);
    }
    public static List<Character> getLen(ArrayList<Character> arr, int i){
        int left=i,right=i;
        int count=0;
        while(left>=0 && right<arr.size()&&(arr.get(left)).equals(arr.get(right))){
            count++;
            left--;
            right++;
        }
        return arr.subList(left+1,right);
    }
    public static String countFre(String string){

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        StringBuilder res = new StringBuilder();

        //put the map into a Arraylist and sort by the key asc
        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        for (int i = 0; i < list.size(); i++) {
            char cc = list.get(i);
            int fre = map.get(cc);
            for (int j = 0; j < fre; j++) {
                res.append(cc);

            }

        }
        return res.toString();



    }
    public static void reverseLetter(StringBuilder string){
        //首先翻转整个字符串
        int left =0;
        int right=string.length()-1;
        while(left<right){
            char c = string.charAt(left);
            //string是可以原地更改的吗
            string.setCharAt(left,string.charAt(right));
            string.setCharAt(right,c);
            right--;
            left++;
        }
        //对每个单词分别反转
        int slow=0,fast=0;
        for(; fast<string.length(); fast++) {
            if(string.charAt(fast)==' ' || fast==string.length()-1){
                int left1;
                int right1;
                if(string.charAt(fast)==' '){
                    left1=slow;
                    right1=fast-1;
                }
                else{
                    left1=slow;
                    right1=fast;
                }

                while(left1<right1){
                    char c = string.charAt(left1);
                    //string是可以原地更改的吗
                    string.setCharAt(left1,string.charAt(right1));
                    string.setCharAt(right1,c);
                    right1--;
                    left1++;
                }
                slow=fast+1;


            }

        }
        System.out.println(string.toString());



    }
    //最小路径和
    public void minPathSum(int[][] grid) {
        int[] arr = new int[11];
        Arrays.fill(arr,0);

        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            dp[i][0]=dp[i-1][0]+grid[i][0];

        }
        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i]=dp[0][i-1]+grid[0][i];

        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }

        }



    }





}
class Pailie{
    private int count;
    private int[] nums;
    private int target;
    public Pailie(int[] nums,int target,int count){
        this.count=count;
        this.nums=nums;
        this.target=target;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return backTrace(nums,target,0,0);



    }
    public  int backTrace(int[] nums, int target, int res,int i){
        if(i==nums.length){
            if(res==target){
                count++;
            }
            return count;
        }
        backTrace(nums,target,res+1,i+1);
        backTrace(nums,target,res-1,i+1);
        return count;
    }


}
