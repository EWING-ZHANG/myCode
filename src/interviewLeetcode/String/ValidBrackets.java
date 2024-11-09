package interviewLeetcode.String;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
//https://leetcode.cn/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-100-liked
public class ValidBrackets {
    //
    public static void main(String[] args) {
        String test ="{}()";
        System.out.println(isValid(test));
    }
    public static Boolean isValid(String s){
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        if(s.length()%2!=0){
            return false;
        }
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(pairs.containsKey(c)){  //这里不能用equals 没有重写方法 判断是否是同一个引用
                if(stack.isEmpty() || stack.peek() !=(pairs.get(c))){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
