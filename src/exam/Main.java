package exam;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String,Integer> count= new HashMap<>();
        while(in.hasNext()) {
            String word = in.next();
            //单词的内部还需要调整按照字典序
            String interior = sortWords(word);
            count.put(interior, count.getOrDefault(interior, 0) + 1);
        }
            List<Map.Entry<String,Integer>> list = new ArrayList<>(count.entrySet());
            list.sort((a,b)->{
                if(!b.getValue().equals(a.getValue())){
                    return b.getValue()-a.getValue();

                }else if(a.getKey().length()!=b.getKey().length()){
                    return a.getKey().length()-b.getKey().length();
                }else{
                    return a.getKey().compareTo(b.getKey());
                }

            });
            StringBuilder res = new StringBuilder();
            for(Map.Entry<String,Integer> entry:list){
                for (int i = 0; i < entry.getValue(); i++) {
                    res.append(entry.getKey()).append(" ");

                }
            }
            if(res.length()>0){
                res.setLength(res.length()-1);
            }
            System.out.println(res.toString());
            in.close();

        }


    private static String sortWords(String word) {
        char[] chars=word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }


}