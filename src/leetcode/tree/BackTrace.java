package leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackTrace {
    static StringBuilder sb = new StringBuilder();
    static List<String> res = new ArrayList<>();

    public static void main(String[] args) {
        String s= "1234";
        Boolean[] used = new Boolean[s.length()];
        Arrays.fill(used,true);
        permutation(s,used);
        System.out.println(Arrays.toString(res.toArray()));



    }
    public static void permutation(String s, Boolean[] used) {
    if(sb.length()==s.length()){
        res.add(sb.toString());
    }
        for (int i = 0; i < s.length(); i++) {
            if (!used[i]) continue;
            used[i] = false;
            char c = s.charAt(i);
            sb.append(c);
            permutation(s,used);
            used[i] = true;
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
