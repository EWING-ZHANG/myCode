package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Main main = new Main();
//        System.out.println(main.countVowels("aba"));
        double a = Math.pow(10,9)+7;
        Long l= new Double(a).longValue();
        double res = (Math.pow(10,9)+7)%(l);
        int i = (int) Math.round(res);
        int j = (int)Math.ceil(3.3);
        int k = (int)Math.floor(3.3);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

    }
    //1.
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (int j = 0; j < allowed.length(); j++) {
            set.add(allowed.charAt(j));
        }
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            int flag = 0;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (!set.contains(c)) {
                    break;
                }
                if (j == s.length() - 1 && set.contains(c)){
                    flag = 1;
                }
            }
            if (flag == 1) {
                count++;
            }
        }
        return count;

    }
    //2.
    public long countVowels(String word) {
        //初始化
        long count=0;
        char[] c = new char[]{'a','e','i','o','u'};
        int n = word.length();
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'));
        for (int i = 0; i < word.length(); i++) {
            char cc = word.charAt(i);
            if(set.contains(cc)){
                count+=(i+1)*(n-i);
            }
        }
        return count;
    }
    /*    //首先得到子串
        int count =0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j <= word.length(); j++) {
                String sub = word.substring(i,j);
                for (int k = 0; k < sub.length(); k++) {
                    char c = sub.charAt(k);
                    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                        count++;
                    }
                }
            }

        }
        return count;

        //获取子串中元音字母的数量
    }*/
}
