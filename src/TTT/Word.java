package TTT;

import java.util.ArrayList;
import java.util.List;

public class Word {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("bb");
        list.add("bbb");
        String s ="bb";
        System.out.println(wordBreak(s,list));

    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        int start =0;
        while(start<s.length()){
            Boolean flag=false;
            for (int i = 0; i < wordDict.size(); i++) {
                String word = wordDict.get(i);
                int len = word.length();
                if(s.length()-start<len) continue;
                String sWord = s.substring(start, start + len);
                if(sWord.equals(word)){
                    start +=len;
                    flag=true;
                }
                if(start>=s.length()) return true;
            }
            if(!flag) return false;

        }
        return true;

    }
}
