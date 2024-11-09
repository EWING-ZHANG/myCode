package interviewLeetcode;

import interviewLeetcode.linkedList.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Trap {
    public int trap(int[] height) {
        int res=0;
        int[] arry = new int[10];
        //数组必须定义固定的大小
        //arraylist是可以动态扩容的  初始10 然后
        for (int i = 1; i < height.length-1; i++) {
            int leftMax = getMax(Arrays.copyOfRange(height, 0, i));
            int rightMax = getMax(Arrays.copyOfRange(height, i + 1, height.length));
            int diff =Math.min(leftMax,rightMax);
            if(diff-height[i]>0){
                res+=diff-height[i];
            }
        }
        return res;
    }
    public int getMax(int[] array){
        int max = Arrays.stream(array).max().getAsInt();
        return max;

    }
}
