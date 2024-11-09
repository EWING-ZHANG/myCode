package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num+",");
        }
        int[] numberA = new int[2];
        int[] numberB = new int[2];
        numberA[1]=1;
        numberA[0]=1;
        numberB[1]=1;
        numberB[0]=1;
        System.out.println(numberA.equals(numberB));
    }

    public static void moveZeroes(int[] nums) {
        int count=0;
        int i =0;
        while(i<nums.length){
            if(nums[i]==0){
                count++;
            }else if (nums[i]!=0 && count>0){
               //另个指针进行遍历知道遇到有0的
                int j = i;
                //往前挪
                while(j<nums.length){
                    if(nums[j]!=0){
                        nums[j-count]=nums[j];
                        j++;
                    }else{
                        i=j-1;
                        break;
                    }
                }
                if(j==nums.length){
                    break;
                }
            }
            i++;
        }
        for (int j = nums.length-count; j < nums.length; j++) {
            nums[j]=0;

        }
    }
}

