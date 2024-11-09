package leetcode.Windows;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }
    public static String minWindow(String s, String t) {
        Map<Character,Integer> window = new HashMap<>();
        Map<Character,Integer> need = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int left=0,right=0,len=Integer.MAX_VALUE,count=0,start=0;
        while(right<s.length()){
            //扩展窗口
            char c = s.charAt(right);
            right++;
            //缩减窗口
            if(need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(window.get(c).equals(need.get(c))){
                    count++;
                }
            }
            while(count==need.size()){
                if(right-left<len){
                    len = right-left;
                    start=left;
                }
                char cc = s.charAt(left);
                left++;
                if(need.containsKey(cc)){
                    if(window.get(cc).equals(need.get(cc))){
                        count--;
                    }
                    window.put(c,window.get(cc)-1);
                }
            }


        }
        return len==Integer.MAX_VALUE? "":s.substring(start,start+len);
    }
}
