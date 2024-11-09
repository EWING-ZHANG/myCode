package interviewLeetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Yanghuisanjiao {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            int prev = 0;
            int curr=0;
            ArrayList<Integer> inside = new ArrayList<>();
            for (int j = 0; j <= temp.size(); j++) {
                if(j==0){
                    prev=0;
                }else{
                    temp.get(j);
                }
                if(j==temp.size()){
                    curr=0;
                }else{
                    curr=temp.get(j);
                }
                inside.add(curr+prev);
            }
            list.add(inside);
            temp=inside;
        }
        return list;
    }
}
